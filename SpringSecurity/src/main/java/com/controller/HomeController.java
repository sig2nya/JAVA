package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        System.out.println("Hello, Controller Starts!");
        return "hello";
    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String join(){
        return "join";
    }
}
