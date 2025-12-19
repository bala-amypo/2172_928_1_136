package com.example.demo.dto;

import java.time.LocalDateTime;

public class LoanDtos {

    private LoanDtos() {
        // utility wrapper
    }

    // ---------- LoanRequestDto ----------
    public static class LoanRequestDto {

        private Long id;
        private Long userId;
        private Double requestedAmount;
        private Integer tenureMonths;
        private String purpose;
        private String status;
        private LocalDateTime appliedAt;

        public LoanRequestDto() {}

        public Long getId() {
            return id;
        }

        public Long getUserId() {
            return userId;
        }

        public Double getRequestedAmount() {
            return requestedAmount;
        }

        public Integer getTenureMonths() {
            return tenureMonths;
        }

        public String getPurpose() {
            return purpose;
        }

        public String getStatus() {
            return status;
        }

        public LocalDateTime getAppliedAt() {
            return appliedAt;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public void setRequestedAmount(Double requestedAmount) {
            this.requestedAmount = requestedAmount;
        }

        public void setTenureMonths(Integer tenureMonths) {
            this.tenureMonths = tenureMonths;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setAppliedAt(LocalDateTime appliedAt) {
            this.appliedAt = appliedAt;
        }
    }

    // ---------- FinancialProfileDto ----------
    public static class FinancialProfileDto {

        private Long id;
        private Long userId;
        private Double monthlyIncome;
        private Double monthlyExpenses;
        private Double existingLoanEmi;
        private Integer creditScore;
        private Double savingsBalance;
        private LocalDateTime lastUpdatedAt;

        public FinancialProfileDto() {}

        public Long getId() {
            return id;
        }

        public Long getUserId() {
            return userId;
        }

        public Double getMonthlyIncome() {
            return monthlyIncome;
        }

        public Double getMonthlyExpenses() {
            return monthlyExpenses;
        }

        public Double getExistingLoanEmi() {
            return existingLoanEmi;
        }

        public Integer getCreditScore() {
            return creditScore;
        }

        public Double getSavingsBalance() {
            return savingsBalance;
        }

        public LocalDateTime getLastUpdatedAt() {
            return lastUpdatedAt;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public void setMonthlyIncome(Double monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
        }

        public void setMonthlyExpenses(Double monthlyExpenses) {
            this.monthlyExpenses
