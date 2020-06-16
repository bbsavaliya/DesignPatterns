package com.design.postpaid.billing;

import java.util.function.DoubleConsumer;

public class BillingAddition implements DoubleConsumer {
	private double total = 0;
	
	@Override
	public void accept(double value) {
		total += value; 
	}
	
	public void combine(BillingAddition other) {
        total += other.total;
    }
	
	public double total(int freeUsage, double extraCharge) {
		double totalUsage = total - freeUsage;
		return totalUsage > 0 ? totalUsage * extraCharge : 0;
	}
}