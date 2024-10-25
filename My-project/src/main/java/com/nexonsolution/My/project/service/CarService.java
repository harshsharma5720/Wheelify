package com.nexonsolution.My.project.service;

import com.nexonsolution.My.project.dto.CarDTO;
import com.nexonsolution.My.project.entity.CarEntity;
import com.nexonsolution.My.project.entity.UserEntity;
import com.nexonsolution.My.project.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelMapper modelMapper;

    public String addCar(CarDTO carDTO){
        CarEntity myEntry = convertToEntity(carDTO);
        carRepository.save(myEntry);
        return "Your car has been added";
    }
//    public CarDTO getCar(Long id){
//        CarDTO dto = carRepository.findById(id);
//        return dto;
//    }

    public List<CarEntity> getCarsByCustomer(UserEntity customer) {
        return carRepository.findByUser(customer);
    }


    private CarDTO convertToDTO(CarEntity carEntity) {
        CarDTO dto = this.modelMapper.map(carEntity, CarDTO.class);
        return dto;
    }

    private CarEntity convertToEntity(CarDTO carDTO) {
        CarEntity entry = this.modelMapper.map(carDTO , CarEntity.class);
        return entry;
    }
}
