package com.barclays.interestrate.slabs;

import java.util.List;

public class SavingAccountInterestRateSlabRule extends InterestRateSlabRule {

	public SavingAccountInterestRateSlabRule(List<InterestRateSlab> interestRateSlabs) {
		super(interestRateSlabs);
	}
	
	
	@Override
	public double calculateInterest(double balance) {
		final InterestRateSlab interestRateSlab = this.findSlabForTheBalance(balance);
		return balance * interestRateSlab.getSlabPercentage();
	}
}