package com.barclays.postpaid.billing;

import com.barclays.postpaid.composite.RecharchPack;

public interface BillingEngine {
	public double processBilling(final RecharchPack recharchPack);
}
