package com.nexonsolution.My.project.service;

import com.nexonsolution.My.project.entity.Order;
import com.nexonsolution.My.project.entity.UserEntity;
import com.nexonsolution.My.project.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> getMyOrders(UserEntity customer) {
        return orderRepository.findByCustomer(customer);
    }

}
