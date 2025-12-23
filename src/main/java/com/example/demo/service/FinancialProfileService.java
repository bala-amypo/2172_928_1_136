package com.example.demo.service.impl;

import com.example.demo.entity.FinancialProfile;
import com.example.demo.repository.FinancialProfileRepository;
import com.example.demo.service.FinancialProfileService;
import org.springframework.stereotype.Service;

@Service
public class FinancialProfileServiceImpl implements FinancialProfileService {

    private final FinancialProfileRepository profileRepository;

    public FinancialProfileServiceImpl(FinancialProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public FinancialProfile create(FinancialProfile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public FinancialProfile getById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }
}
