package com.example.prj.serveSocket.HMS.repository.mapper;

import com.example.prj.serveSocket.HMS.repository.vo.GridVO;
import com.example.prj.serveSocket.HMS.repository.vo.TableVO;
import com.example.prj.serveSocket.HMS.repository.vo.TextVO;
import com.example.prj.serveSocket.HMS.repository.vo.ValidationVO;

import java.util.List;

@Mapper
@Repository
public interface CourseApplyMapper {
    public List<GridVO> selectGridAll(String crs_id, String username);

    public TableVO selectTableAll(String crs_id);

    public TextVO selectTextAll(String crs_id);

    public int validationIns(ValidationVO vo);

    public int insertApplyInfo(String crs_id, String user_id, String seq);

    public List<Integer> validation(String crs_id, String username);
}
