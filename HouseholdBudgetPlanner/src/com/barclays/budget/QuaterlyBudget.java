package com.barclays.budget;

import java.util.List;

public class QuaterlyBudget {
	private final List<MonthlyBudget> quaterlyBudget;
	
	public QuaterlyBudget(List<MonthlyBudget> quaterlyBudget) {
		this.quaterlyBudget = quaterlyBudget;
	}
	
	public double getTotalSpentAmount(Duration duration) {
		/*return this.quaterlyBudget
				   .stream()
				   .filter(
						   budget -> budget.getDuration().getMonth()
					).mapToDouble(budget -> budget.getTotalSpentAmount())
					 .sum();*/
		
		return 0.0;
	}
}