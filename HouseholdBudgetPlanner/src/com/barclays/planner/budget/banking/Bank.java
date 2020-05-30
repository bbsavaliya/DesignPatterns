package com.barclays.planner.budget.banking;

import java.util.Map;
import java.util.Observable;

import com.barclays.planner.budget.banking.budget.Budget;

public class Bank extends Observable {
	private final Map<Long, Budget> customerBudgetMap;
	
	public Bank(Map<Long, Budget> customerBudgetMap) {
		this.customerBudgetMap = customerBudgetMap;
	}
	
	public void transactAgainstTotalBudget(Long customerId) {
		
	}
}