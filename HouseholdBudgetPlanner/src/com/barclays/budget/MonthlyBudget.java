package com.barclays.budget;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MonthlyBudget extends Budget {
	private List<Budget> monthlyBudget;
	private Duration duration;
	
	public MonthlyBudget() {
		this.monthlyBudget = new ArrayList<>();
	}
	
	public MonthlyBudget(double budgetAmount, BudgetCategory budgetCategory, Duration duration) {
		super(budgetAmount, budgetCategory, duration);
	}
	
	public List<Budget> getMonthlyBudgetList() {
		return monthlyBudget;
	}
	
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	
	@Override
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
	
	@Override
	public void add(Budget budget) {
		this.monthlyBudget.add(budget);
	}
	
	@Override
	public double getTotalBudgetAmount(Duration duration) {
		return this.monthlyBudget.stream()
								 .filter(budget -> budget.getDuration().getMonth() == duration.getMonth() &&
										 	budget.getDuration().getYear() == duration.getYear()
										 )
								 .mapToDouble(budget -> budget.getBudgetAmount())
								 .sum();
	}

	@Override
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