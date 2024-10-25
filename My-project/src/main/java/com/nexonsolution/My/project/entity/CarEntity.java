package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;

@Entity
@Builder
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;
    private String carName;
    private int carYear;
    private String variant;
    private String carLicencePlateNumber;
    private int carCurrentMileage;
    private String carEngineType;
    private String carTransmissionType;
    private String carColour;
    private String carsCurrentCondition;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<ModificationRequestEntity> modificationRequests;
    public CarEntity(){

    }
    public CarEntity(int carId, String carName, int carYear,String variant , String carLicencePlateNumber, int carCurrentMileage, String carEngineType, String carTransmissionType, String carColour, String carsCurrentCondition){
        this.carId = carId;
        this.carName = carName;
        this.carYear = carYear;
        this.variant = variant;
        this.carLicencePlateNumber = carLicencePlateNumber;
        this.carCurrentMileage = carCurrentMileage;
        this.carEngineType = carEngineType;
        this.carTransmissionType = carTransmissionType;
        this.carColour = carColour;
        this.carsCurrentCondition = carsCurrentCondition;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getCarLicencePlateNumber() {
        return carLicencePlateNumber;
    }

    public void setCarLicencePlateNumber(String carLicencePlateNumber) {
        this.carLicencePlateNumber = carLicencePlateNumber;
    }

    public int getCarCurrentMileage() {
        return carCurrentMileage;
    }

    public void setCarCurrentMileage(int carCurrentMileage) {
        this.carCurrentMileage = carCurrentMileage;
    }

    public String getCarEngineType() {
        return carEngineType;
    }

    public void setCarEngineType(String carEngineType) {
        this.carEngineType = carEngineType;
    }

    public String getCarTransmissionType() {
        return carTransmissionType;
    }

    public void setCarTransmissionType(String carTransmissionType) {
        this.carTransmissionType = carTransmissionType;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarsCurrentCondition() {
        return carsCurrentCondition;
    }

    public void setCarsCurrentCondition(String carsCurrentCondition) {
        this.carsCurrentCondition = carsCurrentCondition;
    }
}
