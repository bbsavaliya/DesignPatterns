package com.barclays.planner.budget;

import java.util.ArrayList;
import java.util.List;

public class MonthlyBudget extends Budget {
	private final List<Budget> budgetList;
	
	public MonthlyBudget() {
		this.budgetList = new ArrayList<Budget>();
	}
	
	@Override
	public void add(Budget budget) {
		budgetList.add(budget);
	}
	
	public List<Budget> getMonthlyBudgetList() {
		return budgetList;
	}
	
	@Override
	public double getTotalSpentAmount(Duration duration) {
		return this.budgetList.stream()
				  .filter(
						  budget -> budget.getDuration().getMonth() == duration.getMonth()
						 ).mapToDouble(budget -> budget.getSpentAmount())
					      .sum();
	}
}