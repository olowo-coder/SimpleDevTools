package com.example.simpldevtools.repository;

import org.springframework.stereotype.Repository;
import com.example.simpldevtools.payload.UserForm;


import java.util.HashMap;
import java.util.Map;

@Repository
public class LoginRepositoryImpl implements LoginRepository{

    Map<String, String> users;


    public LoginRepositoryImpl() {
        users = new HashMap<>();
        users.put("user1", "p1");
        users.put("user2", "p3");
        users.put("user3", "p4");
    }

    public boolean login(UserForm userForm) {
        System.out.println("LoginRepository.login " + userForm);
        String username = userForm.getUsername();
        String password = userForm.getPassword();
        return users.containsKey(username)
                && users.get(username).equals(password);
    }
}
