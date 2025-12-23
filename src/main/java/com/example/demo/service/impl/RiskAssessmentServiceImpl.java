package com.example.demo.service.impl;

import com.example.demo.entity.RiskAssessmentLog;
import com.example.demo.repository.RiskAssessmentLogRepository;
import com.example.demo.service.RiskAssessmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskAssessmentServiceImpl implements RiskAssessmentService {

    private final RiskAssessmentLogRepository repository;

    public RiskAssessmentServiceImpl(RiskAssessmentLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public RiskAssessmentLog assessRisk(Long loanRequestId) {

        RiskAssessmentLog log = new RiskAssessmentLog();
        log.setLoanRequestId(loanRequestId);

        double dtiRatio = 0.35; // sample calculation
        log.setDtiRatio(dtiRatio);

        if (dtiRatio < 0.4) {
            log.setCreditCheckStatus("LOW_RISK");
        } else {
            log.setCreditCheckStatus("HIGH_RISK");
        }

        return repository.save(log);
    }

    @Override
    public List<RiskAssessmentLog> getAll() {
        return repository.findAll();
    }
}
