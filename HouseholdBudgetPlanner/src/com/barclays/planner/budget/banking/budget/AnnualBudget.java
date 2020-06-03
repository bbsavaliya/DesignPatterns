package com.barclays.planner.budget.banking.budget;

import java.util.ArrayList;
import java.util.List;

public class AnnualBudget {
	private final List<Budget> budgetList;
	
	public AnnualBudget() {
		budgetList = new ArrayList<Budget>();
	}
	
	public void add(Budget budget) {
		this.budgetList.add(budget);
	}
	
	public double getTotalSpentAmount(Duration duration) {
		return this.budgetList.stream()
							  .filter(
									  budget -> budget.getDuration().getYear() == duration.getYear()
									 ).mapToDouble(budget -> budget.getSpentAmount())
								      .sum();
	}
}