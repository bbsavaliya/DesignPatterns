package com.barclays.planner.budget.banking.budget;

import java.util.List;
import java.util.Map;

import com.barclays.planner.budget.strategy.MonthlyBudgetComputeStrategy;

public class MonthlyBudget {
	private final List<MonthlyBudgetComputeStrategy> strategies;
	
	public MonthlyBudget(List<MonthlyBudgetComputeStrategy> strategies) {
		this.strategies = strategies;
	}
	
	private MonthlyBudgetComputeStrategy findStrategyByItemCategory(ITEMCATEGORY itemcategory) {
		return this.strategies.
	}
	
	public double computeCharges(List<Item> items) {
		double totalCharges = 0.0;
		this.strategies.stream().iterator().forEachRemaining(strategy -> {
			strategy.compute(items);
		});
	}
}