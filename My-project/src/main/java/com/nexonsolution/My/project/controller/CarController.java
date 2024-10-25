package com.nexonsolution.My.project.controller;

import com.nexonsolution.My.project.dto.CarDTO;
import com.nexonsolution.My.project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/add")
    public ResponseEntity<String> addCar(@RequestBody CarDTO carDTO) {
        carService.addCar(carDTO);
        return ResponseEntity.ok("Car information saved successfully");
    }

    @GetMapping("/suggestions")
    public ResponseEntity<List<Accessory>> getAccessorySuggestions(@AuthenticationPrincipal Customer customer) {
        // Logic to provide relevant accessory suggestions
        List<Accessory> suggestions = carService.getSuggestionsForCustomerCars(customer);
        return ResponseEntity.ok(suggestions);
    }
}
