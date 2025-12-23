package com.example.demo.service.impl;

import com.example.demo.entity.EligibilityResult;
import com.example.demo.entity.FinancialProfile;
import com.example.demo.entity.LoanRequest;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EligibilityResultRepository;
import com.example.demo.repository.FinancialProfileRepository;
import com.example.demo.repository.LoanRequestRepository;
import com.example.demo.service.LoanEligibilityService;
import org.springframework.stereotype.Service;

@Service
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

    private final LoanRequestRepository loanRequestRepository;
    private final FinancialProfileRepository profileRepository;
    private final EligibilityResultRepository resultRepository;

    public LoanEligibilityServiceImpl(LoanRequestRepository loanRequestRepository,
                                      FinancialProfileRepository profileRepository,
                                      EligibilityResultRepository resultRepository) {
        this.loanRequestRepository = loanRequestRepository;
        this.profileRepository = profileRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public EligibilityResult checkEligibility(Long loanRequestId) {

        if (resultRepository.findByLoanRequestId(loanRequestId).isPresent()) {
            throw new BadRequestException("Eligibility already evaluated");
        }

        LoanRequest request = loanRequestRepository.findById(loanRequestId)
                .orElseThrow(() -> new ResourceNotFoundException("Loan request not found"));

        FinancialProfile profile = profileRepository.findByUserId(request.getUser().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Financial profile not found"));

        double existingEmi = profile.getExistingLoanEmi() != null
                ? profile.getExistingLoanEmi()
                : 0.0;

        double dti = (profile.getMonthlyExpenses() + existingEmi)
                / profile.getMonthlyIncome();

        EligibilityResult result = new EligibilityResult();
        result.setLoanRequest(request);

        if (profile.getCreditScore() < 600 || dti > 0.6) {
            result.setIsEligible(false);
            result.setRiskLevel("HIGH");
            result.setRejectionReason("High DTI or low credit score");
            result.setMaxEligibleAmount(0);
            result.setEstimatedEmi(0);
        } else {
            double maxAmount = profile.getMonthlyIncome() * 10;
            double emi = maxAmount / request.getTenureMonths();

            result.setIsEligible(true);
            result.setRiskLevel(dti < 0.3 ? "LOW" : "MEDIUM");
            result.setMaxEligibleAmount(maxAmount);
            result.setEstimatedEmi(emi);
        }

        return resultRepository.save(result);
    }
}
