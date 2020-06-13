package com.barclays.postpaid.strategy;

import com.barclays.postpaid.component.Usage;

public interface Billing {
	public double calculateBill(final Usage usage);
}