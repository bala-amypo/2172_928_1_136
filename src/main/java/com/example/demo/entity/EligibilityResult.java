package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "eligibility_results")
public class EligibilityResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "loan_request_id")
    private LoanRequest loanRequest;

    @Column(name = "is_eligible")
    private boolean isEligible;

    private String riskLevel;

    private String rejectionReason;

    private double maxEligibleAmount;

    private double estimatedEmi;

    // ===== GETTERS =====

    public Long getId() {
        return id;
    }

    public LoanRequest getLoanRequest() {
        return loanRequest;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public double getMaxEligibleAmount() {
        return maxEligibleAmount;
    }

    public double getEstimatedEmi() {
        return estimatedEmi;
    }

    // ===== SETTERS (CRITICAL FIX) =====

    public void setLoanRequest(LoanRequest loanRequest) {
        this.loanRequest = loanRequest;
    }

    public void setIsEligible(boolean eligible) {
        this.isEligible = eligible;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public void setMaxEligibleAmount(double maxEligibleAmount) {
        this.maxEligibleAmount = maxEligibleAmount;
    }

    public void setEstimatedEmi(double estimatedEmi) {
        this.estimatedEmi = estimatedEmi;
    }
}
