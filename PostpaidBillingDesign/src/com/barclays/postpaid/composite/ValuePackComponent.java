package com.barclays.postpaid.composite;

public abstract class ValuePackComponent {
	public abstract int getFreeMinutes();
	
	public abstract double getExtraCharge();
	
	public abstract RechargeComponentType getRechargeComponentType();
}