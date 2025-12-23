package com.example.demo.service;

import com.example.demo.entity.RiskAssessmentLog;
import java.util.List;

public interface RiskAssessmentService {

    RiskAssessmentLog assess(Long loanRequestId);

    List<RiskAssessmentLog> getAll();
}
