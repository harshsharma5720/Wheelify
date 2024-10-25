package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;

@Entity
@Builder
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // Name of the accessory
    private String category;  // e.g., performance, aesthetics, comfort
    private String description;  // Short description of the accessory
    private double price;  // Price of the accessory
    private String brand;  // Brand of the accessory
    private String make;  // Car make compatibility (e.g., Toyota, Hyundai)
    private String model;  // Car model compatibility (e.g., Creta, Hilux)
    private String variant;// Engine type, transmission type compatibility
    private double rating;
    private String imageUrl;  // URL for accessory image (for frontend)

    // Add fields for reviews if needed
    @OneToMany(mappedBy = "accessory", cascade = CascadeType.ALL)
    private List<Review> reviews;  // Customer reviews for this accessory

    public Accessory() {
    }

    public Accessory(Long id, String name, String category, String description, double price, String make, String model, String variant, String imageUrl) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.make = make;
        this.model = model;
        this.variant = variant;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
