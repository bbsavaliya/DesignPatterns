package com.barclays.interestrate.slabs;

import java.util.List;
import java.util.stream.Collectors;

public class InterestRateSlabRule {
	private final List<InterestRateSlab> interestRateSlabs;
	
	public InterestRateSlabRule(List<InterestRateSlab> interestRateSlabs) {
		this.interestRateSlabs = interestRateSlabs;
	}
	
	protected InterestRateSlab findSlabForTheBalance(double balance) {
		return this.interestRateSlabs.stream()
									 .filter(interestRateSlab -> interestRateSlab.getMinBalance() <= balance && interestRateSlab.getMaxBalance() >= balance)
									 .collect(Collectors.toList()).get(0);
	}
	
	public double calculateInterest(double balance) {
		final InterestRateSlab interestRateSlab = this.findSlabForTheBalance(balance);
		return balance * interestRateSlab.getSlabPercentage();
	}
}