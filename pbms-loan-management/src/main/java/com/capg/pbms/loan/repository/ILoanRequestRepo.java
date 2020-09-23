package com.capg.pbms.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.loan.model.LoanRequest;

public interface ILoanRequestRepo extends JpaRepository<LoanRequest, Long> {

}
