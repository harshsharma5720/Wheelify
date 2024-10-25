package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.Order;
import com.nexonsolution.My.project.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByCustomer(UserEntity customer);
}
