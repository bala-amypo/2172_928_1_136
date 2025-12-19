package com.example.demo.dto;

import java.time.LocalDateTime;

public class RiskAssessmentLogDto {

    private Long id;
    private Long loanRequestId;
    private Double dtiRatio;
    private String creditCheckStatus;
    private LocalDateTime timestamp;

    public RiskAssessmentLogDto() {}

    public Long getId() {
        return id;
    }

    public Long getLoanRequestId() {
        return loanRequestId;
    }

    public Double getDtiRatio() {
        return dtiRatio;
    }

    public String getCreditCheckStatus() {
        return creditCheckStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoanRequestId(Long loanRequestId) {
        this.loanRequestId = loanRequestId;
    }

    public void setDtiRatio(Double dtiRatio) {
        this.dtiRatio = dtiRatio;
    }

    public void setCreditCheckStatus(String creditCheckStatus) {
        this.creditCheckStatus = creditCheckStatus;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
