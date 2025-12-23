package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class LoanRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private double requestedAmount;
    private int tenureMonths;
    private String status;

    // ✅ getters & setters
    public User getUser() { return user; }
    public double getRequestedAmount() { return requestedAmount; }
    public int getTenureMonths() { return tenureMonths; }

    public void setUser(User user) { this.user = user; }
    public void setStatus(String status) { this.status = status; }
}
