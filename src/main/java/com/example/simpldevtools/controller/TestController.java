package com.example.simpldevtools.controller;

import com.example.simpldevtools.payload.UserForm;
import com.example.simpldevtools.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequestHandler(type = "rest")
public class TestController {

    private final LoginService loginService;

    @Autowired
    public TestController(@Qualifier("LoginServiceImpl") LoginService loginService) {
        this.loginService = loginService;
    }


    @GetMapping("/output")
    public String getTest(){
        return "Hello test 6";
    }

    @PostMapping("/login/admin")
    public ResponseEntity<String> login(@RequestBody final UserForm userForm){
        return ResponseEntity.ok(loginService.validateLogin(userForm));
    }
}
