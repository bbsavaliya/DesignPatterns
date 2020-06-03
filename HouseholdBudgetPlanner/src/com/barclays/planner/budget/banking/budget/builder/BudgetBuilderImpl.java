package com.barclays.planner.budget.banking.budget.builder;

import com.barclays.planner.budget.banking.budget.Budget;
import com.barclays.planner.budget.banking.budget.Duration;
import com.barclays.planner.budget.banking.budget.MonthlyBudget;

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