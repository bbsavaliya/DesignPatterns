package com.barclays.interestrate.account;

import com.barclays.interestrate.slabs.InterestRateSlabRule;

public class CorporateAccount extends Account {
	
	public CorporateAccount(long accountId, double balance) {
		super(accountId, balance);
	}

	@Override
	public double calculateInterest(double balance, InterestRateSlabRule interestRateSlabRule) {
		return interestRateSlabRule.calculateInterest(balance);
	}
}