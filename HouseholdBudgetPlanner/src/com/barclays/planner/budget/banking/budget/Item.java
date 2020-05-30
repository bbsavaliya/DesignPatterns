package com.barclays.planner.budget.banking.budget;

public class Item {
	private final String itemName;
	private final double itemCharge;
	
	public Item(String itemName, double itemCharge) {
		this.itemName = itemName;
		this.itemCharge = itemCharge;
	}

	public String getItemName() {
		return itemName;
	}

	public double getItemCharge() {
		return itemCharge;
	}
}