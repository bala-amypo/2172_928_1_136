package com.example.demo.controller;

import com.example.demo.service.LoanEligibilityService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eligibility")
@Tag(name = "Eligibility")
public class EligibilityController {

    private final LoanEligibilityService eligibilityService;

    public EligibilityController(LoanEligibilityService eligibilityService) {
        this.eligibilityService = eligibilityService;
    }

    @PostMapping("/evaluate/{loanRequestId}")
    public ResponseEntity<?> evaluate(
            @PathVariable Long loanRequestId) {
        return ResponseEntity.ok(
                eligibilityService.evaluateEligibility(loanRequestId));
    }

    @GetMapping("/result/{loanRequestId}")
    public ResponseEntity<?> getResult(
            @PathVariable Long loanRequestId) {
        return ResponseEntity.ok(
                eligibilityService.getByLoanRequestId(loanRequestId));
    }
}
