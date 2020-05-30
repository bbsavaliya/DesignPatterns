package com.barclays.calculator;

import java.util.Map;

public class Income {
	private final double totalIncome;
	private final Map<INVESTMENT, Double> savings;
	
	public Income(double totalIncome, Map<INVESTMENT, Double> savings) {
		this.totalIncome = totalIncome;
		this.savings = savings;
	}

	public double getTotalIncome() {
		return totalIncome;
	}

	public Map<INVESTMENT, Double> getSavings() {
		return savings;
	}
}