package com.barclays.planner.budget.strategy;

import java.util.List;

import com.barclays.planner.budget.banking.budget.Item;

public interface MonthlyBudgetComputeStrategy {
	public double compute(List<Item> items);
}