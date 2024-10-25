package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;

@Entity
@Builder
public class UserEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNo;
    private String customerAddress;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id", referencedColumnName = "id")  // Specifies the foreign key column
    private CarEntity customersCar;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CarEntity> cars;
    public UserEntity() {
    }
    public UserEntity(Long customerId, String customerName, String customerEmail , String customerPhoneNo, String customerAddress, CarEntity customersCar){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
        this.customerAddress = customerAddress;
        this.customersCar = customersCar;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CarEntity getCustomersCar() {
        return customersCar;
    }

    public void setCustomersCar(CarEntity customersCar) {
        this.customersCar = customersCar;
    }

    public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }
}
