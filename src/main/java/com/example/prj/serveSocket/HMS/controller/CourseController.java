package com.example.prj.serveSocket.HMS.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.example.prj.serveSocket.HMS.repository.vo.*;
import com.example.prj.serveSocket.HMS.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseController {
    @Autowired
    ApplyService hmsService;

    @GetMapping("/student/courseapply")
    public ModelAndView myView(HttpServletRequest request, HttpSession session){
        ModelAndView view = new ModelAndView();
        UserVO userInfo = (UserVO) session.getAttribute(User.USER);
        if(userInfo.getRole() == 6 || userInfo.getRole() == 7){
            return new ModelAndView("redirect:/main");
        }

        String crsid = request.getQueryString();

        TableVO tableData = hmsService.selectTableAll(crsid);

        List<GridVO> gridData = hmsService.selectGridAll(crsid, userInfo.getUsername());
        TextVO textData = hmsService.selectTextAll(crsid);
        List<Integer> list = hmsService.validation(crsid, userInfo.getUsername());
        view.addObject("tableData", tableData);
        view.addObject("gridData", gridData);
        view.addObject("textData", textData);
        view.addObject("crs_id", crsid);
        view.addObject("validationSeq", list);
        view.setViewName("/HMS/courseapply");
        return view;
    }

    @RequestMapping(value = "/HMS/HMSGrid", method = RequestMethod.POST)
    public @ResponseBody Object jqList(@RequestParam(value = "crs_id") int crs_id,
                                       HttpServletRequest request, HttpSession session
                                       ) throws JsonProcessingException{
        UserVO userInfo = (UserVO) session.getAttribute(User.USER);
        List<GridVO> gridData = hmsService.selectGridAll(Integer.toString(crs_id), userInfo.getUsername());
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("rows", gridData);

        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(modelMap);
        return value;
    }

    @RequestMapping("/HMS/HMSValidation")
    public @ResponseBody int Validation(GridVO vo. HttpServletRequest request, HttpSession session){
        UserVO userInfo = (UserVO) session.getAttribute(User.USER);
        ValidationVO vvo = new ValidationVO(vo.getCrsId(), vo.getSeq(), userInfo.getUsername());
        int count = hmsService.validationIns(vvo);
        return count;
    }

    @RequestMapping(value="/HMS/HMSInsert", method = RequestMethod.POST)
    public @ResponseBody void InsertData(HttpSession session,
                                         @Valid
                                         @RequestBody List<GridVO> data,
                                         HttpServletRequest request
                                         ){
        UserVO userInfo = (UserVO) session.getAttribute(User.USER);
        for(int i = 0; i < data.size(); i++){
            String crsId = data.get(i).getCrsId();
            String userId = Integer.toString(userInfo.getUserId());
            String seq = data.get(i).getSeq();
            ValidationVO vo = new ValidationVO(data.get(i).getCrsId(), data.get(i).getSeq(), userInfo.getUsername());
            int count = hmsService.validationIns(vo);
            if(count >= 1){
                return;
            } else {
                hmsService.insertApplyInfo(crsId, userId, seq);
            }
        }
    }

}
