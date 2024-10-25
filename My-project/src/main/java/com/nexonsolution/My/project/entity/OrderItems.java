package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "accessory_id")
    private Accessory accessory;  // The accessory in this order item

    private int quantity;  // Quantity of the accessory ordered
    private double price; // Price of the accessory for this order

    public OrderItems() {
    }

    public OrderItems(Long id, Order order, Accessory accessory, int quantity, double price) {
        this.id = id;
        this.order = order;
        this.accessory = accessory;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
