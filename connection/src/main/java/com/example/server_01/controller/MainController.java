package com.example.server_01.controller;

import com.example.server_01.repository.ResponseDTO;
import com.example.server_01.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public ModelAndView Welcome(){
        ArrayList<HashMap<String, Object>> list = userService.findAll();
        ModelAndView model = new ModelAndView("index");
        model.addObject("list", list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).get("CPU"));
        }
        System.out.println(list.get(0));
        System.out.println("서버 요청 완료!");
        return model;
    }
}
