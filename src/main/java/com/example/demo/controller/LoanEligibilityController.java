package com.example.demo.controller;

import com.example.demo.entity.EligibilityResult;
import com.example.demo.service.LoanEligibilityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eligibility")
public class LoanEligibilityController {

    private final LoanEligibilityService service;

    public LoanEligibilityController(LoanEligibilityService service) {
        this.service = service;
    }

    @PostMapping("/check/{loanRequestId}")
    public ResponseEntity<EligibilityResult> checkEligibility(
            @PathVariable Long loanRequestId) {
        return ResponseEntity.ok(service.checkEligibility(loanRequestId));
    }
}
