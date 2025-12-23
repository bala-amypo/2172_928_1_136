package com.example.demo.service;

import com.example.demo.entity.FinancialProfile;

public interface FinancialProfileService {

    FinancialProfile create(FinancialProfile profile);

    FinancialProfile getById(Long id);
}
