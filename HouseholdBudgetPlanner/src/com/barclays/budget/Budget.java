package com.barclays.budget;

public class Budget {
	private final double budgetAmount;
	private final BudgetCategory budgetCategory;
	private double totalSpentAmount;
	
	public Budget(double budgetAmount, BudgetCategory budgetCategory) {
		this.budgetAmount = budgetAmount;
		this.budgetCategory = budgetCategory;
	}
	
	public double getBudgetAmount() {
		return budgetAmount;
	}
	
	public BudgetCategory getBudgetCategory() {
		return budgetCategory;
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
}