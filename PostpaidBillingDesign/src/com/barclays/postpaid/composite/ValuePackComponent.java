package com.barclays.postpaid.composite;

public abstract class ValuePackComponent {
	private double basePrice;

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
}