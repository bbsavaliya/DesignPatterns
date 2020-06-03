package com.barclays.planner.budget.builder;

import com.barclays.planner.budget.Budget;
import com.barclays.planner.budget.Duration;

public class Director {
	private final BudgetBuilder builder;
	
	public Director(BudgetBuilder builder) {
		this.builder = builder; 
	}
	
	public Budget buildBudget(Duration duration, Double amount) {
		return this.builder.setBudgetAmount(amount)
							.setDuration(duration)
							.build();
	}
}