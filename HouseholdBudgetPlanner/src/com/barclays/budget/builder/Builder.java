package com.barclays.budget.builder;

import com.barclays.budget.Budget;
import com.barclays.budget.Duration;
import com.barclays.budget.MonthlyBudget;

public interface Builder {
	Builder addBudget(Budget budget);
	
	Builder setDuration(Duration duration);
	
	MonthlyBudget build();
}