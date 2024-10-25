package com.nexonsolution.My.project.service.Implementation;

import com.nexonsolution.My.project.entity.User_LogInEntity;
import com.nexonsolution.My.project.repository.UserLoginRepository;
import com.nexonsolution.My.project.service.User_LogInService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class User_LogInServiceImpl implements User_LogInService {

    @Autowired
    private UserLoginRepository userLoginRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User_LogInEntity signUp(User_LogInEntity user) {
        user.setUserName(user.getUserName());
        user.setEmail(user.getEmail());
        user.setPhone_no(user.getPhone_no());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userLoginRepository.save(user);
    }

    @Override
    public User_LogInEntity logIn(String email, String password) {
        Optional<User_LogInEntity> userOpt = userLoginRepository.findByEmail(email);
        if (userOpt.isPresent()){
            User_LogInEntity user = userOpt.get();
            if (passwordEncoder.matches(password, user.getPassword())){
                return user;
            }
        }
        throw new IllegalArgumentException("Invalid email or password");
    }

    // Add your methods here to interact with the UserLoginRepository



}
