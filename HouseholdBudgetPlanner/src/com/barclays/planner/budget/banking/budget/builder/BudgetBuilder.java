package com.barclays.planner.budget.banking.budget.builder;

import com.barclays.planner.budget.banking.budget.Budget;
import com.barclays.planner.budget.banking.budget.Duration;

public interface BudgetBuilder {
	Budget build();
	
	BudgetBuilder setBudgetAmount(double amount);
	
	BudgetBuilder setDuration(Duration duration);
}