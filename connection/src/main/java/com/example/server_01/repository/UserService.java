package com.example.server_01.repository;

import com.example.server_01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public ArrayList<HashMap<String, Object>> findAll(){
        return userMapper.findAll();
    }
}
