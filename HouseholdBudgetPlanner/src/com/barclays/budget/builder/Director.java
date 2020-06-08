package com.barclays.budget.builder;

import com.barclays.budget.Budget;
import com.barclays.budget.Duration;
import com.barclays.budget.MonthlyBudget;

public class Director {
	private final BudgetBuilder builder;
	
	public Director(BudgetBuilder builder) {
		this.builder = builder; 
	}
	
	public MonthlyBudget buildMonthlyBudget(Duration duration, Budget houseHoldBudget, Budget entertainmentBudget, Budget utilitiesBudget) {
		return this.builder.setDuration(duration)
						   .addBudget(houseHoldBudget)
						   .addBudget(entertainmentBudget)
						   .addBudget(utilitiesBudget)
						   .build();
	}
	
	
}