package com.barclays.interestrate;

import java.util.Arrays;

import com.barclays.interestrate.account.Account;
import com.barclays.interestrate.account.AverageBalance;
import com.barclays.interestrate.dao.AccountDAO;
import com.barclays.interestrate.factory.InterestRateSlabRuleFactory;
import com.barclays.interestrate.factory.SavaingAccountInterestRateSlabRuleFactory;
import com.barclays.interestrate.slabs.InterestRateSlabRule;

public class BankInterestRateCalculationTest {
	public static void main(String[] args) {
		AccountDAO accountDAO = AccountDAO.getInstance();
		
		InterestRateSlabRuleFactory interestRateSlabRuleFactory = new SavaingAccountInterestRateSlabRuleFactory();
		InterestRateSlabRule interestRateSlabRule = interestRateSlabRuleFactory.createInterestRateSlabRule();
		
		Account account = accountDAO.findByAccountId(1L);
		double monthlyAverageBalance = Arrays.stream(account.getMonthlyAverageBalance())
			    							.collect(AverageBalance::new, AverageBalance::accept, AverageBalance::combine)
			    							.average();
		
		
		double interest = account.calculateInterest(monthlyAverageBalance, interestRateSlabRule);
		System.out.println("Interest Rate: " + interest);
	}
}