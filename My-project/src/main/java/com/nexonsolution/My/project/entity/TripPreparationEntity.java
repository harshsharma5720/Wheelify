package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class TripPreparationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripPreparationId;

    private String tripType;
    private String specialRequirements;

    @OneToOne
    @JoinColumn(name = "car_id")
    private CarEntity carEntity;

    public TripPreparationEntity() {
    }

    public TripPreparationEntity(Long tripPreparationId, String tripType, String specialRequirements, CarEntity carEntity) {
        this.tripPreparationId = tripPreparationId;
        this.tripType = tripType;
        this.specialRequirements = specialRequirements;
        this.carEntity = carEntity;
    }

    public Long getTripPreparationId() {
        return tripPreparationId;
    }

    public void setTripPreparationId(Long tripPreparationId) {
        this.tripPreparationId = tripPreparationId;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements;
    }

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }
}
