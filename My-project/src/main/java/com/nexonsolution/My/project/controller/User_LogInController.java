package com.nexonsolution.My.project.controller;

import com.nexonsolution.My.project.entity.User_LogInEntity;
import com.nexonsolution.My.project.service.Implementation.User_LogInServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class User_LogInController {

    @Autowired
    private User_LogInServiceImpl userLogInService;

    @PostMapping("/login")
    public ResponseEntity<String> logIn(@RequestBody User_LogInEntity user){
        User_LogInEntity loggedInUser = userLogInService.logIn(user.getEmail(), user.getPassword());
        return ResponseEntity.ok("Login successful for user: " + loggedInUser.getEmail());

    }

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User_LogInEntity user) {
        userLogInService.signUp(user);
        return ResponseEntity.ok("User registered successfully!");
    }
}
