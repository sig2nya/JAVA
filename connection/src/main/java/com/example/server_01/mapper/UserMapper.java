package com.example.server_01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
@Mapper
public interface UserMapper {
    ArrayList<HashMap<String, Object>> findAll();
}
