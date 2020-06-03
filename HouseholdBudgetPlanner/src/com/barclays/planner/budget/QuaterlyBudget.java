package com.barclays.planner.budget;

import java.util.ArrayList;
import java.util.List;

public class QuaterlyBudget {
	private final List<Budget> budgetList;
	
	public QuaterlyBudget(BudgetCategory category, double budgetAmount, Duration duration) {
		budgetList = new ArrayList<Budget>();
	}
	
	public void add(Budget budget) {
		this.budgetList.add(budget);
	}
	
	public double getTotalSpentAmount(Duration from, Duration to) {
		return this.budgetList.stream()
							  .filter(
									  budget -> budget.getDuration().getMonth() >= from.getMonth() &&
									  budget.getDuration().getMonth() <= to.getMonth()
									 ).mapToDouble(budget -> budget.getSpentAmount())
								      .sum();
	}
}