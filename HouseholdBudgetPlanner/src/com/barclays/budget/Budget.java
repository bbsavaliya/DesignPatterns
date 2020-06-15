package com.barclays.budget;

public abstract class Budget {
	private double budgetAmount;
	private BudgetCategory budgetCategory;
	private double totalSpentAmount;
	private Duration duration;
	
	public Budget() {
		// TODO Auto-generated constructor stub
	}
	
	public Budget(double budgetAmount, BudgetCategory budgetCategory, Duration duration) {
		this.budgetAmount = budgetAmount;
		this.budgetCategory = budgetCategory;
		this.duration = duration;
	}
	
	public double getBudgetAmount() {
		return budgetAmount;
	}
	
	public BudgetCategory getBudgetCategory() {
		return budgetCategory;
	}
	
	public Duration getDuration() {
		return duration;
	}

	public double getRemainingBudgetAmount() {
		return this.budgetAmount - this.totalSpentAmount;
	}

	public double getTotalSpentAmount() {
		return totalSpentAmount;
	}

	public void addSpentOnBudget(double spentAmount) {
		this.totalSpentAmount = this.totalSpentAmount + spentAmount;
	}
	
	public abstract void add(Budget budget);
	
	public abstract double getTotalBudgetAmount(Duration duration);
	
	public abstract double getTotalSpentAmount(Duration duration);
}