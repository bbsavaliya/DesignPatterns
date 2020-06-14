package com.barclays.interestrate;

import com.barclays.interestrate.account.Account;
import com.barclays.interestrate.dao.AccountDAO;
import com.barclays.interestrate.factory.AccountFactory;
import com.barclays.interestrate.factory.SavingAccountFactory;

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