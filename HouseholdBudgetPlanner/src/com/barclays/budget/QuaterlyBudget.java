package com.barclays.budget;

import java.util.ArrayList;
import java.util.List;

import com.barclays.budget.builder.Quater;

public class QuaterlyBudget extends Budget {
	private final List<Budget> quaterlyBudget;
	
	public QuaterlyBudget() {
		this.quaterlyBudget = new ArrayList<Budget>();
	}
	
	@Override
	public void add(Budget MonthlyBudget) {
		this.quaterlyBudget.add(MonthlyBudget);
	}

	@Override
	public double getTotalBudgetAmount(Duration duration) {
		Quater quater = Quater.getQuaterFromStart(duration.getMonth());
		return this.quaterlyBudget.stream()
						   .filter(budget -> budget.getDuration().getMonth() >= quater.getQuaterStart() 
						   				&& budget.getDuration().getMonth() <= quater.getQuaterEnd()
						   				&& budget.getDuration().getYear() == duration.getYear()
								   )
						   .mapToDouble(budget -> budget.getBudgetAmount())
						   .sum();
	}
	
	@Override
	public double getTotalSpentAmount(Duration duration) {
		Quater quater = Quater.getQuaterFromStart(duration.getMonth());
		return this.quaterlyBudget.stream()
						   .filter(budget -> budget.getDuration().getMonth() >= quater.getQuaterStart() 
						   				&& budget.getDuration().getMonth() <= quater.getQuaterEnd()
						   				&& budget.getDuration().getYear() == duration.getYear()
								   )
						   .mapToDouble(budget -> budget.getTotalSpentAmount())
						   .sum();
	}
}