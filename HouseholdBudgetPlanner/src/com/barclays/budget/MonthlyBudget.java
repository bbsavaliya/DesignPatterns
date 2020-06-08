package com.barclays.budget;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MonthlyBudget {
	private final List<Budget> monthlyBudget;
	private Duration duration;
	
	public MonthlyBudget() {
		this.monthlyBudget = new ArrayList<>();
	}
	
	public List<Budget> getMonthlyBudgetList() {
		return monthlyBudget;
	}
	
	public void addBudget(Budget budget) {
		this.monthlyBudget.add(budget);
	}
	
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Duration getDuration() {
		return duration;
	}
	
	public void addSpentOnBudget(double spentAmount, BudgetCategory budgetCategory) {
		this.monthlyBudget.stream()
						  .filter(budget -> budget.getBudgetCategory() == budgetCategory)
						  .collect(Collectors.toList())
						  .get(0)
						  .addSpentOnBudget(spentAmount);
	}
	
	public double getTotalBudgetAmount() {
		return this.monthlyBudget.stream()
								 .mapToDouble(budget -> budget.getBudgetAmount())
								 .sum();
	}

	public double getTotalSpentAmount(Duration duration) {
		return this.monthlyBudget
				   .stream()
				   .filter(
						   budget -> this.getDuration().getMonth() == duration.getMonth() &&
						   			 this.getDuration().getYear() == duration.getYear()
					).mapToDouble(budget -> budget.getTotalSpentAmount())
					 .sum();
	}
}