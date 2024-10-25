package com.nexonsolution.My.project.controller;

import com.nexonsolution.My.project.entity.*;
import com.nexonsolution.My.project.service.AccessoryService;
import com.nexonsolution.My.project.service.ModificationService;
import com.nexonsolution.My.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private AccessoryService accessoryService;
    @Autowired
    private ModificationService modificationService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/recommended-accessories")
    public ResponseEntity<List<Accessory>> getRecommendedAccessories(@AuthenticationPrincipal UserEntity customer) {
        CarEntity customerCar = customer.getCustomersCar(); // Assuming one car per customer
        List<Accessory> recommendedAccessories = accessoryService.getRecommendedAccessories(customerCar);
        return ResponseEntity.ok(recommendedAccessories);
    }
    @GetMapping("/modification-suggestions")
    public ResponseEntity<List<ModificationRequestEntity>> getModificationSuggestions(@AuthenticationPrincipal UserEntity customer) {
        CarEntity customerCar = customer.getCustomersCar();
        List<ModificationRequestEntity> suggestions = modificationService.getSuggestionsForCar(customerCar);
        return ResponseEntity.ok(suggestions);
    }

    @GetMapping("/my-orders")
    public ResponseEntity<List<Order>> getMyOrders(@AuthenticationPrincipal UserEntity customer) {
        List<Order> orders = orderService.getMyOrders(customer);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/filter-accessories")
    public ResponseEntity<List<Accessory>> filterAccessoriesByCategory(@RequestParam String category) {
        List<Accessory> filteredAccessories = accessoryService.filterAccessoriesByCategory(category);
        return ResponseEntity.ok(filteredAccessories);
    }

}
