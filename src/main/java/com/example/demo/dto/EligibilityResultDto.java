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

    public EligibilityResultDto() {}

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

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoanRequestId(Long loanRequestId) {
        this.loanRequestId = loanRequestId;
    }

    public void setIsEligible(Boolean isEligible) {
        this.isEligible = isEligible;
    }

    public void setMaxEligibleAmount(Double maxEligibleAmount) {
        this.maxEligibleAmount = maxEligibleAmount;
    }

    public void setEstimatedEmi(Double estimatedEmi) {
        this.estimatedEmi = estimatedEmi;
    }

    public void setRiskLevel(String riskLevel) {
        t
