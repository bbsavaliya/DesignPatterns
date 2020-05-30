package com.barclays.slabs;

public class TaxSlab {
	private final double minIncome;
	private final double maxIncome;
	private final double slabPercentage;
	
	public TaxSlab(double minIncome, double maxIncome, double slabPercentage) {
		this.minIncome = minIncome;
		this.maxIncome = maxIncome;
		this.slabPercentage = slabPercentage;
	}

	public double getMinIncome() {
		return minIncome;
	}

	public double getMaxIncome() {
		return maxIncome;
	}

	public double getSlabPercentage() {
		return slabPercentage;
	}
}