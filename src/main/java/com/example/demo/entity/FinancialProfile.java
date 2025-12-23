package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class FinancialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double income;
    private Integer creditScore;

    private LocalDateTime updatedAt = LocalDateTime.now();

    @OneToOne
    private User user;

    // Getters and Setters
}
