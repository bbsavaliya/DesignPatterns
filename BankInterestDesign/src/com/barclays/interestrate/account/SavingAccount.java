package com.barclays.interestrate.account;

import com.barclays.interestrate.slabs.InterestRateSlabRule;

public class SavingAccount extends Account {
	public SavingAccount(long accountId, double balance) {
		super(accountId, balance);
	}

	public double calculateInterest(double balance, InterestRateSlabRule interestRateSlabRule) {
		return interestRateSlabRule.calculateInterest(balance);
	}
}