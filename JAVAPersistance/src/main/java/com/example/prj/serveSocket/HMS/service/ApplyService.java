package com.example.prj.serveSocket.HMS.service;

import com.example.prj.serveSocket.HMS.repository.vo.GridVO;
import com.example.prj.serveSocket.HMS.repository.vo.TableVO;
import com.example.prj.serveSocket.HMS.repository.vo.TextVO;
import com.example.prj.serveSocket.HMS.repository.vo.ValidationVO;

import java.util.List;

@Service
public class ApplyService {
    @Autowired
    private com.example.prj.serveSocket.HMS.repository.mapper.CourseApplyMapper myMapper;

    public List<GridVO> selectGridAll(String crs_id, String username){
        return myMapper.selectGridAll(crs_id, username);
    }

    public TextVO selectTextAll(String crs_id){
        return myMapper.selectTextAll(crs_id);
    }

    public TableVO selectTableAll(String crs_id){
        return myMapper.selectTableAll(crs_id);
    }

    public int validationIns(ValidationVO vo){
        return myMapper.validationIns(vo);
    }

    public int insertApplyInfo(String crs_id, String user_id, String seq){
        return myMapper.insertApplyInfo(crs_id, user_id, seq);
    }

    public List<Integer> validation(String crs_id, String username){
        return myMapper.validation(crs_id, username);
    }
}
