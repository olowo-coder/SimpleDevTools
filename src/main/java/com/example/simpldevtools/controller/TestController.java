package com.example.simpldevtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequestHandler(type = "rest")
public class TestController {

    @GetMapping("/output")
    public String getTest(){
        return "Hello test 6";
    }
}
