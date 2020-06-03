package com.barclays.planner.budget;

public abstract class Budget {
	private double budgetAmount;
	private Duration duration;
	private double spentAmount;
		
	public Budget() {
	}
	
	public double getBudgetAmount() {
		return budgetAmount;
	}

	public Duration getDuration() {
		return duration;
	}
	
	public void setBudgetAmount(double budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public void addSpentAmount(double spentAmount) {
		this.spentAmount = this.spentAmount + spentAmount;
	}
	
	public double getSpentAmount() {
		return this.spentAmount;
	}
	
	public abstract void add(Budget budget);
	
	public abstract double getTotalSpentAmount(Duration durations);
}