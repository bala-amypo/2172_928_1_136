package com.example.demo.service;

import com.example.demo.entity.LoanRequest;
import java.util.List;

public interface LoanRequestService {

    LoanRequest create(LoanRequest request);

    List<LoanRequest> getByUserId(Long userId);
}
