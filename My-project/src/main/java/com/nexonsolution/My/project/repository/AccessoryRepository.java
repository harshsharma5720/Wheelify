package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccessoryRepository extends JpaRepository<Accessory, Long > {

    List<Accessory> findByCarDetails(String make, Integer model, String variant);
    List<Accessory> findByCategory(String category);
}
