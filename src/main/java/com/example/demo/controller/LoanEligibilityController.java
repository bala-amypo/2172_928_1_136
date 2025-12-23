package com.example.demo.controller;

import com.example.demo.entity.EligibilityResult;
import com.example.demo.service.LoanEligibilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eligibility")
public class LoanEligibilityController {

    private final LoanEligibilityService service;

    public LoanEligibilityController(LoanEligibilityService service) {
        this.service = service;
    }

    @GetMapping("/{loanRequestId}")
    public EligibilityResult checkEligibility(@PathVariable Long loanRequestId) {
        return service.checkEligibility(loanRequestId);
    }
}
