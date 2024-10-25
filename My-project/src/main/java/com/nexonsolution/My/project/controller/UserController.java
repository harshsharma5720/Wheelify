package com.nexonsolution.My.project.controller;

import com.nexonsolution.My.project.service.UserService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;



}
