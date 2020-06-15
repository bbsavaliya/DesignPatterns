package com.barclays.postpaid.billing;

import java.time.LocalDate;

public interface BillingEngine {
	public double processBilling(LocalDate startDate, LocalDate endDate);
}
