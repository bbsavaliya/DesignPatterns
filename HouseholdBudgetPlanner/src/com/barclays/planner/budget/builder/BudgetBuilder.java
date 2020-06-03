package com.barclays.planner.budget.builder;

import com.barclays.planner.budget.Budget;
import com.barclays.planner.budget.Duration;

public interface BudgetBuilder {
	Budget build();
	
	BudgetBuilder setBudgetAmount(double amount);
	
	BudgetBuilder setDuration(Duration duration);
}