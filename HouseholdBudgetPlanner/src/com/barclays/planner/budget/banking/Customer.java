package com.barclays.planner.budget.banking;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {
	private final List<Budget> budgetList;
	private final long customerId;
	
	public Customer(long customerId, List<Budget> budgetList) {
		this.customerId = customerId;
		this.budgetList = budgetList;
	}
	
	@Override
	public void update(Observable bank, Object arg) {
	}
	
}