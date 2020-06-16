package com.design.interestrate;

import com.design.interestrate.account.Account;
import com.design.interestrate.dao.AccountDAO;
import com.design.interestrate.factory.AccountFactory;
import com.design.interestrate.factory.SavingAccountFactory;

public class BankInterestRateCalculationTest {
	public static void main(String[] args) {
		AccountDAO accountDAO = AccountDAO.getInstance();
		AccountFactory accountFactory = new SavingAccountFactory();
		accountFactory.createAccount();
		Account account = accountDAO.findByAccountId(1L);
		
		double interest = account.calculateInterest();
		System.out.println("Monthly Interest To be Paid: " + interest);
	}
}