package com.barclays.postpaid.billing;

import java.time.LocalDateTime;

import com.barclays.postpaid.composite.RecharchPack;

public interface BillingEngine {
	public double processBilling(final RecharchPack recharchPack, LocalDateTime localDateTime);
}
