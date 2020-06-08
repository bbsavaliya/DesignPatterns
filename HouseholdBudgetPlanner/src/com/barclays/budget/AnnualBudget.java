package com.barclays.budget;

import java.util.List;

public class AnnualBudget {
	private final List<QuaterlyBudget> annualBudget;
	
	public AnnualBudget(List<QuaterlyBudget> annualBudget) {
		this.annualBudget = annualBudget;
	}
	
	public double getTotalSpentAmount(Duration duration) {
		return 0.0;
	}
}