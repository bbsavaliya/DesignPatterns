package com.barclays.planner.budget.banking.budget;

import com.barclays.planner.budget.banking.budget.builder.BudgetBuilder;
import com.barclays.planner.budget.banking.budget.builder.BudgetBuilderImpl;
import com.barclays.planner.budget.banking.budget.builder.Director;

public class HouseholdBudgetTest {
	public static void main(String[] args) {
		final BudgetBuilder builder = new BudgetBuilderImpl();
		final Director director = new Director(builder);
		
		final Budget houseHoldBudget = director.buildBudget(new Duration(1, 2020), 10000.00);
		final Budget entertainmentBudget = director.buildBudget(new Duration(1, 2020), 8000.00);
		final Budget utilitiesBudget = director.buildBudget(new Duration(1, 2020), 5000.00);
		
		houseHoldBudget.addSpentAmount(2500);
		entertainmentBudget.addSpentAmount(3000);
		utilitiesBudget.addSpentAmount(1500);
		
		final Budget monthlyBudget = director.buildBudget(new Duration(1, 2020), 23000.00);
		monthlyBudget.add(houseHoldBudget);
		monthlyBudget.add(entertainmentBudget);
		monthlyBudget.add(utilitiesBudget);
		
		double totalSpentAmount = monthlyBudget.getTotalSpentAmount(new Duration(1, 2020));
		System.out.println("Monthly Total Spent :" + totalSpentAmount);
		
		System.out.println("Total Monthly Budget : " + monthlyBudget.getBudgetAmount());
		
		
	}
}