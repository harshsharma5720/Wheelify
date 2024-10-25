package com.nexonsolution.My.project.service;

import com.nexonsolution.My.project.entity.User_LogInEntity;

public interface User_LogInService {

    User_LogInEntity signUp(User_LogInEntity user);
    User_LogInEntity logIn(String email, String password);
}
