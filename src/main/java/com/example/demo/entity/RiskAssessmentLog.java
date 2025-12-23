package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RiskAssessmentLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long loanRequestId;

    private double dtiRatio;

    private String creditCheckStatus;

    // getters
    public Long getId() {
        return id;
    }

    public Long getLoanRequestId() {
        return loanRequestId;
    }

    public double getDtiRatio() {
        return dtiRatio;
    }

    public String getCreditCheckStatus() {
        return creditCheckStatus;
    }

    // setters (FIX)
    public void setLoanRequestId(Long loanRequestId) {
        this.loanRequestId = loanRequestId;
    }

    public void setDtiRatio(double dtiRatio) {
        this.dtiRatio = dtiRatio;
    }

    public void setCreditCheckStatus(String creditCheckStatus) {
        this.creditCheckStatus = creditCheckStatus;
    }
}
