package com.barclays.planner.budget.banking.budget;

	public double actualBudgetAmount;
	
	public Budget(double spentAmount, double actualBudgetAmount) {
		this.actualBudgetAmount = actualBudgetAmount;
	}

	public double getActualBudgetAmount() {
		return actualBudgetAmount;
	}
	
	public void transactAgainstBudget(double spentAmount) {
		this.actualBudgetAmount = this.actualBudgetAmount - spentAmount;
	}
}