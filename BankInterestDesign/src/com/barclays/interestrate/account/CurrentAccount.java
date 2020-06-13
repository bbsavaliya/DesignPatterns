package com.barclays.interestrate.account;

import com.barclays.interestrate.slabs.InterestRateSlabRule;

public class CurrentAccount extends Account {
	public CurrentAccount(long accountId, double balance) {
		super(accountId, balance);
	}

	public double calculateInterest(double balance, InterestRateSlabRule interestRateSlabRule) {
		return interestRateSlabRule.calculateInterest(balance);
	}
}