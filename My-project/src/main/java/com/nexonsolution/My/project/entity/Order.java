package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private UserEntity customer;  // Reference to the customer who placed the order

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItems> orderItems;  // List of items (accessories) in the order

    private LocalDate orderDate;  // Date when the order was placed
    private String status;  // e.g., processing, shipped, delivered
    private double totalPrice;

    public Order() {
    }

    public Order(Long id, UserEntity customer, List<OrderItems> orderItems, LocalDate orderDate, String status, double totalPrice) {
        this.id = id;
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getCustomer() {
        return customer;
    }

    public void setCustomer(UserEntity customer) {
        this.customer = customer;
    }

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
