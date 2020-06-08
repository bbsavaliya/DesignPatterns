package com.barclays.budget.builder;

import com.barclays.budget.Budget;
import com.barclays.budget.Duration;
import com.barclays.budget.MonthlyBudget;

public class BudgetBuilder implements Builder {
	private final MonthlyBudget monthlyBudget;
	
	public BudgetBuilder() {
		this.monthlyBudget = new MonthlyBudget();
	}
	
	@Override
	public Builder addBudget(Budget budget) {
		this.monthlyBudget.addBudget(budget);
		return this;
	}
	
	@Override
	public Builder setDuration(Duration duration) {
		this.monthlyBudget.setDuration(duration);
		return this;
	}
	
	@Override
	public MonthlyBudget build() {
		return this.monthlyBudget;
	}
}