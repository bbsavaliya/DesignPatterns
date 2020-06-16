package com.design.interestrate.slabs;

public class InterestRateSlab {
	private final double minBalance;
	private final double maxBalance;
	private final double slabPercentage;
	
	public InterestRateSlab(double minBalance, double maxBalance, double slabPercentage) {
		this.minBalance = minBalance;
		this.maxBalance = maxBalance;
		this.slabPercentage = slabPercentage;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public double getMaxBalance() {
		return maxBalance;
	}

	public double getSlabPercentage() {
		return slabPercentage;
	}
}