package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.User_LogInEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoginRepository extends JpaRepository<User_LogInEntity,Long> {

    Optional<User_LogInEntity> findByEmail(String email);
}
