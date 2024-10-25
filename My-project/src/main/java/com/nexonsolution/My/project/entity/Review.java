package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "accessory_id")
    private Accessory accessory;

    private String reviewerName;
    private String reviewText;
    private int rating;  // Rating out of 5

}
