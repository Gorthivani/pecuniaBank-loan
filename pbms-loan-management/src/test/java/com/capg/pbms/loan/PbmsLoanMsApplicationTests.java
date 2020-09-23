package com.capg.pbms.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.capg.pbms.loan.service.LoanServiceImpl;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.capg.pbms.loan.exception.AccountException;
import com.capg.pbms.loan.model.LoanRequest;

import static org.junit.jupiter.api.Assertions.assertThrows;
@SpringBootTest
class PbmsLoanMsApplicationTests {
	@Autowired
	LoanServiceImpl service;
 		@Test
		public void testAccountId() {
			assertEquals(true, service.isValidAccountId(123456789012L));
		} 
		 
		@Test
		void testAddLoan1() {
			LoanRequest loanrequest=new LoanRequest(510744551037L, 2, "house loan", 3, 300.00, "Accepted", 500.00, 680);
			assertEquals("Rejected",service.addLoan(369487823202L, 650, 10000, loanrequest).getLoanStatus());
		}
		
		@Test
		void testAddLoan2() {
			LoanRequest loanrequest=new LoanRequest(510744551037L, 2, "house loan", 3, 300.00, "Accepted", 500.00, 680);
			assertEquals("Accepted",service.addLoan(369487823202L, 680, 10000, loanrequest).getLoanStatus());
		}

}