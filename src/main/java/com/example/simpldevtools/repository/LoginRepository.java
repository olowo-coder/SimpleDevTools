package com.example.simpldevtools.repository;

import com.example.simpldevtools.payload.UserForm;

public interface LoginRepository {
    boolean login(UserForm userForm);
}
