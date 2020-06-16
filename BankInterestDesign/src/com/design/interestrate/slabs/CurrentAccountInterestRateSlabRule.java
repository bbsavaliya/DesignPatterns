package com.design.interestrate.slabs;

import java.util.List;

public class CurrentAccountInterestRateSlabRule extends InterestRateSlabRule {

	public CurrentAccountInterestRateSlabRule(List<InterestRateSlab> interestRateSlabs) {
		super(interestRateSlabs);
	}
	
	@Override
	public double calculateInterest(double balance) {
		final InterestRateSlab interestRateSlab = this.findSlabForTheBalance(balance);
		return balance * interestRateSlab.getSlabPercentage();
	}
}