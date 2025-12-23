package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class FinancialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    private double monthlyIncome;
    private double monthlyExpenses;
    private double existingLoanEmi;
    private int creditScore;

    private LocalDateTime lastUpdatedAt;

    // ✅ getters & setters
    public Long getId() { return id; }
    public User getUser() { return user; }
    public double getMonthlyIncome() { return monthlyIncome; }
    public double getMonthlyExpenses() { return monthlyExpenses; }
    public double getExistingLoanEmi() { return existingLoanEmi; }
    public int getCreditScore() { return creditScore; }

    public void setUser(User user) { this.user = user; }
    public void setLastUpdatedAt(LocalDateTime time) { this.lastUpdatedAt = time; }
}
