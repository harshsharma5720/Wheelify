package com.nexonsolution.My.project.dto;

public class TripPreparationDTO {
    private Long tripPreparationId;
    private String tripType;
    private String specialRequirements;

    public Long getTripPreparationId() {
        return tripPreparationId;
    }

    public void setTripPreparationId(Long tripPreparationId) {
        this.tripPreparationId = tripPreparationId;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements;
    }
}
