package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class EligibilityResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean eligible;
    private String reason;

    private LocalDateTime checkedAt = LocalDateTime.now();

    @OneToOne
    private LoanRequest loanRequest;

    // Getters and Setters
}
