package com.nexonsolution.My.project.service;

import com.nexonsolution.My.project.entity.Accessory;
import com.nexonsolution.My.project.entity.CarEntity;
import com.nexonsolution.My.project.repository.AccessoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryService {
    @Autowired
    private AccessoryRepository accessoryRepository;

    public List<Accessory> getRecommendedAccessories(CarEntity car){
        return accessoryRepository.findByCarDetails(car.getCarName(), car.getCarYear(), car.getVariant());
    }

    public List<Accessory> filterAccessoriesByCategory(String category) {
        // Fetch accessories by category
        return accessoryRepository.findByCategory(category);
    }
}
