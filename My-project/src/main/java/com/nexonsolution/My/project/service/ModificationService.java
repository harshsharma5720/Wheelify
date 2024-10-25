package com.nexonsolution.My.project.service;

import com.nexonsolution.My.project.entity.CarEntity;
import com.nexonsolution.My.project.entity.ModificationRequestEntity;
import com.nexonsolution.My.project.repository.ModificationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModificationService {

    @Autowired
    private ModificationRequestRepository modificationRequestRepository;

    public List<ModificationRequestEntity> getSuggestionsForCar(CarEntity car) {
        return modificationRequestRepository.findSuggestionsByCarDetails(car.getCarName(), car.getCarYear());
    }
}
