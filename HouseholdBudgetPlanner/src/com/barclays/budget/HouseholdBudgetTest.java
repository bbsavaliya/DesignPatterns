package com.barclays.budget;

import com.barclays.budget.builder.BudgetBuilder;
import com.barclays.budget.builder.Director;

public class HouseholdBudgetTest {
	public static void main(String[] args) {
		final Budget houseHoldBudget = new MonthlyBudget(10000, BudgetCategory.HOUSEHOLD, new Duration(1, 2020));
		final Budget entertainmentBudget = new MonthlyBudget(8000, BudgetCategory.ENTERTAINMENT, new Duration(1, 2020));
		final Budget utilitiesBudget = new MonthlyBudget(5000, BudgetCategory.UTILITIES, new Duration(1, 2020));

		final Director director = new Director(new BudgetBuilder());
		final MonthlyBudget monthlyBudget = director.buildMonthlyBudget(new Duration(1, 2020), 
																			houseHoldBudget, 
																			entertainmentBudget, 
																			utilitiesBudget);
		
		monthlyBudget.addSpentOnBudget(2500, BudgetCategory.HOUSEHOLD);
		monthlyBudget.addSpentOnBudget(1500, BudgetCategory.ENTERTAINMENT);
		monthlyBudget.addSpentOnBudget(500, BudgetCategory.UTILITIES);
		monthlyBudget.addSpentOnBudget(1000, BudgetCategory.UTILITIES);
		monthlyBudget.addSpentOnBudget(2000, BudgetCategory.ENTERTAINMENT);
		monthlyBudget.addSpentOnBudget(4000, BudgetCategory.HOUSEHOLD);
		
		double totalSpentAmount = monthlyBudget.getTotalSpentAmount(new Duration(1, 2020));
	//	double totalBudgetAmount = monthlyBudget.getTotalBudgetAmount();
		
	//	System.out.println("Monthly Total Budget Amount: " + totalBudgetAmount);
		System.out.println("Monthly Total Spent : " + totalSpentAmount);
	}
}