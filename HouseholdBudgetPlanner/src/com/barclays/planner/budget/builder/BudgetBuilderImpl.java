package com.barclays.planner.budget.builder;

import com.barclays.planner.budget.Budget;
import com.barclays.planner.budget.Duration;
import com.barclays.planner.budget.MonthlyBudget;

public class BudgetBuilderImpl implements BudgetBuilder {
	private double budgetAmount;
	private Duration duration;
	
	@Override
	public Budget build() {
		Budget budget = new MonthlyBudget();
		budget.setBudgetAmount(this.budgetAmount);
		budget.setDuration(duration);
		return budget;
	}

	@Override
	public BudgetBuilder setBudgetAmount(double amount) {
		this.budgetAmount = amount;
		return this;
	}

	@Override
	public BudgetBuilder setDuration(Duration duration) {
		this.duration = duration;
		return this;
	}
}