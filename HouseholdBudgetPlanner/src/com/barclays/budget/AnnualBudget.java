package com.barclays.budget;

import java.util.ArrayList;
import java.util.List;

public class AnnualBudget extends Budget {
	private final List<Budget> annualBudget;
	
	public AnnualBudget(List<QuaterlyBudget> annualBudget) {
		this.annualBudget = new ArrayList<Budget>();
	}
	
	@Override
	public void add(Budget budget) {
		this.annualBudget.add(budget);
	}

	@Override
	public double getTotalBudgetAmount(Duration duration) {
		return this.annualBudget.stream()
						 .filter(budget -> budget.getDuration().getYear() == duration.getYear())
						 .mapToDouble(budget -> budget.getBudgetAmount())
						 .sum();
	}

	@Override
	public double getTotalSpentAmount(Duration duration) {
		return this.annualBudget.stream()
				 .filter(budget -> budget.getDuration().getYear() == duration.getYear())
				 .mapToDouble(budget -> budget.getTotalSpentAmount())
				 .sum();
	}
}