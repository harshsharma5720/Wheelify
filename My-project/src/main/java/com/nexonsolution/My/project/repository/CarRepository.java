package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.CarEntity;
import com.nexonsolution.My.project.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long> {

    List<CarEntity> findByUser(UserEntity customer);
}
