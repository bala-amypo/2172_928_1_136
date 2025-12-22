package com.example.demo.dto;

import java.time.LocalDateTime;

public class EligibilityResultDto {

    private Long id;
    private Long loanRequestId;
    private Boolean isEligible;
    private Double maxEligibleAmount;
    private Double estimatedEmi;
    private String riskLevel;
    private String rejectionReason;
    private LocalDateTime calculatedAt;

    public EligibilityResultDto() {
    }

    public EligibilityResultDto(
            Long id,
            Long loanRequestId,
            Boolean isEligible,
            Double maxEligibleAmount,
            Double estimatedEmi,
            String riskLevel,
            String rejectionReason,
            LocalDateTime calculatedAt
    ) {
        this.id = id;
        this.loanRequestId = loanRequestId;
        this.isEligible = isEligible;
        this.maxEligibleAmount = maxEligibleAmount;
        this.estimatedEmi = estimatedEmi;
        this.riskLevel = riskLevel;
        this.rejectionReason = rejectionReason;
        this.calculatedAt = calculatedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getLoanRequestId() {
        return loanRequestId;
    }

    public Boolean getIsEligible() {
        return isEligible;
    }

    public Double getMaxEligibleAmount() {
        return maxEligibleAmount;
    }

    public Double getEstimatedEmi() {
        return estimatedEmi;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }
}
