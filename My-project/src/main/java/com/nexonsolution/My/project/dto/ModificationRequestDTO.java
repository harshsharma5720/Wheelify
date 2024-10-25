package com.nexonsolution.My.project.dto;

import java.util.Date;
import java.util.List;

public class ModificationRequestDTO {
    private Long modificationRequestId;
    private List<String> requestedModifications;
    private String modificationPriority;
    private double estimatedCost;
    private Date estimatedCompletionTime;
    private String modificationStatus;
    private String assignedMechanic;
    private Long carId;

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

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
}
