package com.example.simpldevtools.service.serviceImpl;

import com.example.simpldevtools.payload.UserForm;
import com.example.simpldevtools.repository.LoginRepositoryImpl;
import com.example.simpldevtools.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements LoginService {

    private final LoginRepositoryImpl loginRepositoryImpl;

    @Autowired
    public UserLoginServiceImpl(LoginRepositoryImpl loginRepositoryImpl) {
        this.loginRepositoryImpl = loginRepositoryImpl;
    }


    @Override
    public String validateLogin(UserForm userForm) {
            return loginRepositoryImpl.login(userForm) ? "User Login Successfully" : "User Login Failed";
    }
}
