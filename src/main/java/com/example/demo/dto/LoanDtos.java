package com.example.demo.dto;

import java.time.LocalDateTime;

public class LoanDtos {

    private LoanDtos() {
    }

    // ================= LoanRequestDto =================
    public static class LoanRequestDto {

        private Long id;
        private Long userId;
        private Double requestedAmount;
        private Integer tenureMonths;
        private String purpose;
        private String status;
        private LocalDateTime appliedAt;

        public LoanRequestDto() {
        }

        public LoanRequestDto(
                Long id,
                Long userId,
                Double requestedAmount,
                Integer tenureMonths,
                String purpose,
                String status,
                LocalDateTime appliedAt
        ) {
            this.id = id;
            this.userId = userId;
            this.requestedAmount = requestedAmount;
            this.tenureMonths = tenureMonths;
            this.purpose = purpose;
            this.status = status;
            this.appliedAt = appliedAt;
        }

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
    }

    // ================= FinancialProfileDto =================
    public static class FinancialProfileDto {

        private Long id;
        private Long userId;
        private Double monthlyIncome;
        private Double monthlyExpenses;
        private Double existingLoanEmi;
        private Integer creditScore;
        private Double savingsBalance;
        private LocalDateTime lastUpdatedAt;

        public FinancialProfileDto() {
        }

        public FinancialProfileDto(
                Long id,
                Long userId,
                Double monthlyIncome,
                Double monthlyExpenses,
                Double existingLoanEmi,
                Integer creditScore,
                Double savingsBalance,
                LocalDateTime lastUpdatedAt
        ) {
            this.id = id;
            this.userId = userId;
            this.monthlyIncome = monthlyIncome;
            this.monthlyExpenses = monthlyExpenses;
            this.existingLoanEmi = existingLoanEmi;
            this.creditScore = creditScore;
            this.savingsBalance = savingsBalance;
            this.lastUpdatedAt = lastUpdatedAt;
        }

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
    }
}
