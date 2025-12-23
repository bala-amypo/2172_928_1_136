package com.example.demo.service.impl;

import com.example.demo.entity.EligibilityResult;
import com.example.demo.repository.EligibilityResultRepository;
import com.example.demo.service.LoanEligibilityService;
import org.springframework.stereotype.Service;

@Service
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

    private final EligibilityResultRepository resultRepository;

    public LoanEligibilityServiceImpl(EligibilityResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public EligibilityResult checkEligibility(Long loanRequestId) {

        EligibilityResult existing =
                resultRepository.findByLoanRequestId(loanRequestId);

        if (existing != null) {
            return existing;
        }

        EligibilityResult result = new EligibilityResult();
        result.setIsEligible(true);
        result.setRiskLevel("LOW");
        result.setMaxEligibleAmount(500000);
        result.setEstimatedEmi(12000);

        return resultRepository.save(result);
    }
}
