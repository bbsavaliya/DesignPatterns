package com.design.interestrate.account;

import com.design.interestrate.slabs.InterestRateSlabRule;

public class CurrentAccount extends Account {
	private final InterestRateSlabRule interestRateSlabRule;
	public CurrentAccount(long accountId, double balance, InterestRateSlabRule interestRateSlabRule) {
		super(accountId, balance);
		this.interestRateSlabRule = interestRateSlabRule;
	}

	public InterestRateSlabRule getInterestRateSlabRule() {
		return interestRateSlabRule;
	}

	@Override
	public double calculateInterest() {
		return this.interestRateSlabRule.calculateInterest(this.getAverageBalance());
	}
}