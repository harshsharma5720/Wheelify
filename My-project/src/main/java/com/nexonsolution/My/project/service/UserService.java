package com.nexonsolution.My.project.service;

import com.nexonsolution.My.project.dto.UserDTO;
import com.nexonsolution.My.project.entity.UserEntity;
import com.nexonsolution.My.project.exception.ResourceNotFoundException;
import com.nexonsolution.My.project.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllCustomer(){
        return userRepository.findAll().stream()
                .map(userEntity -> modelMapper.map(userEntity,UserDTO.class))
                .collect(Collectors.toList());
    }
    public Optional<UserDTO> getCustomerById(Long customerId) {
        return userRepository.findById(customerId)
                .map(customer -> modelMapper.map(customer, UserDTO.class));
    }
    public UserDTO createCustomer(UserDTO userDTO) {
        UserEntity customer = modelMapper.map(userDTO, UserEntity.class);
        UserEntity savedCustomer = userRepository.save(customer);
        return modelMapper.map(savedCustomer, UserDTO.class);
    }
    public UserDTO updateCustomer(Long customerId, UserDTO customerDTO) {
        if (userRepository.existsById(customerId)) {
            UserEntity customer = modelMapper.map(customerDTO, UserEntity.class);
            customer.setCustomerId(customerId);
            UserEntity updatedCustomer = userRepository.save(customer);
            return modelMapper.map(updatedCustomer, UserDTO.class);
        }
        throw new ResourceNotFoundException("Customer not found with ID: " + customerId);
    }

    public void deleteCustomer(Long customerId) {
        if (userRepository.existsById(customerId)) {
            userRepository.deleteById(customerId);
        } else {
            throw new ResourceNotFoundException("Customer not found with ID: " + customerId);
        }
    }





}
