package com.design.postpaid.billing;

import java.time.LocalDate;

public interface BillingEngine {
	public double processBilling(LocalDate startDate, LocalDate endDate);
}
