package com.example.demo.controller;

import com.example.demo.entity.FinancialProfile;
import com.example.demo.service.FinancialProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/financial-profiles")
public class FinancialProfileController {

    private final FinancialProfileService service;

    public FinancialProfileController(FinancialProfileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FinancialProfile> create(
            @RequestBody FinancialProfile profile) {
        return ResponseEntity.ok(service.create(profile));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinancialProfile> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
}
