package com.nexonsolution.My.project.dto;

public class CarDTO {
    private int carId;
    private String carName;
    private int carYear;
    private String carLicencePlateNumber;
    private int carCurrentMileage;
    private String carEngineType;
    private String carTransmissionType;
    private String carColour;
    private String carsCurrentCondition;

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
