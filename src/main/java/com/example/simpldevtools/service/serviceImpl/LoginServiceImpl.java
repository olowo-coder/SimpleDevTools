package com.example.simpldevtools.service.serviceImpl;

import com.example.simpldevtools.payload.UserForm;
import com.example.simpldevtools.repository.LoginRepository;
import com.example.simpldevtools.repository.LoginRepositoryImpl;
import com.example.simpldevtools.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("LoginServiceImpl")
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }


    public String validateLogin(UserForm userForm){
       return loginRepository.login(userForm) ? "Admin Login Successfully" : "Admin Login Failed";
    }
}
