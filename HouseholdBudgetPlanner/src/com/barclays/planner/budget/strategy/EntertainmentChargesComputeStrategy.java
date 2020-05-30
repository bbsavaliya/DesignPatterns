package com.barclays.planner.budget.strategy;

import java.util.List;

import com.barclays.planner.budget.banking.budget.Item;

public class EntertainmentChargesComputeStrategy implements MonthlyBudgetComputeStrategy {
	@Override
	public double compute(List<Item> items) {
		return items.stream().map(item -> item.getItemCharge()).reduce(0.0, (a,b) -> a + b);
	}
}