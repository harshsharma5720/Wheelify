package com.nexonsolution.My.project.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;
import java.util.Date;

@Entity
@Builder
public class ModificationRequestEntity//modificationsuggetion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modificationRequestId;

    @ElementCollection
    private List<String> requestedModifications;

    private String modificationPriority;
    private double estimatedCost;
    private Date estimatedCompletionTime;
    private String modificationStatus;
    private String assignedMechanic;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private CarEntity carEntity;
    public ModificationRequestEntity() {

    }

    public ModificationRequestEntity(Long modificationRequestId, List<String> requestedModifications, String modificationPriority, double estimatedCost, Date estimatedCompletionTime, String modificationStatus, String assignedMechanic, CarEntity carEntity) {
        this.modificationRequestId = modificationRequestId;
        this.requestedModifications = requestedModifications;
        this.modificationPriority = modificationPriority;
        this.estimatedCost = estimatedCost;
        this.estimatedCompletionTime = estimatedCompletionTime;
        this.modificationStatus = modificationStatus;
        this.assignedMechanic = assignedMechanic;
        this.carEntity = carEntity;
    }

    public Long getModificationRequestId() {
        return modificationRequestId;
    }

    public void setModificationRequestId(Long modificationRequestId) {
        this.modificationRequestId = modificationRequestId;
    }

    public List<String> getRequestedModifications() {
        return requestedModifications;
    }

    public void setRequestedModifications(List<String> requestedModifications) {
        this.requestedModifications = requestedModifications;
    }

    public String getModificationPriority() {
        return modificationPriority;
    }

    public void setModificationPriority(String modificationPriority) {
        this.modificationPriority = modificationPriority;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public Date getEstimatedCompletionTime() {
        return estimatedCompletionTime;
    }

    public void setEstimatedCompletionTime(Date estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
    }

    public String getModificationStatus() {
        return modificationStatus;
    }

    public void setModificationStatus(String modificationStatus) {
        this.modificationStatus = modificationStatus;
    }

    public String getAssignedMechanic() {
        return assignedMechanic;
    }

    public void setAssignedMechanic(String assignedMechanic) {
        this.assignedMechanic = assignedMechanic;
    }

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }
}
