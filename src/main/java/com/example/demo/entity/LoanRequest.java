package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LoanRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private Integer tenure;

    private LocalDateTime requestedAt = LocalDateTime.now();

    @ManyToOne
    private User user;

    // Getters and Setters
}
