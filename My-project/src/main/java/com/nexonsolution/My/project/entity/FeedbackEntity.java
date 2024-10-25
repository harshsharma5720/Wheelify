package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class FeedbackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;
    private String feedback;
    private int satisfactionRating;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private UserEntity userEntity;

    public FeedbackEntity() {
    }

    public FeedbackEntity(Long feedbackId, String feedback, int satisfactionRating, UserEntity userEntity) {
        this.feedbackId = feedbackId;
        this.feedback = feedback;
        this.satisfactionRating = satisfactionRating;
        this.userEntity = userEntity;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getSatisfactionRating() {
        return satisfactionRating;
    }

    public void setSatisfactionRating(int satisfactionRating) {
        this.satisfactionRating = satisfactionRating;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
