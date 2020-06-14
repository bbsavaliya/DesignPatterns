package com.barclays.postpaid.billing;

import com.barclays.postpaid.composite.RecharchPack;

public class PostpaidBillingEngine implements BillingEngine {
	private final BillingTransaction billingTranscation;
	
	public PostpaidBillingEngine(BillingTransaction billingTranscation) {
		this.billingTranscation = billingTranscation;
	}
	
	@Override
	public double processBilling(RecharchPack recharchPack) {
		int localUsage = this.findLocalUsage();
		int stdUsage = this.findSTDUsage();
		int internetUsage = this.internetUsage();
		
		return 0.0;
	}
	
	private int findLocalUsage() {
		return this.billingTranscation
				.getLocalMinuteSessions()
				.stream()
				.mapToInt(localMinute -> localMinute.getLocalMinutesUsage())
				.sum();
	}
	
	private int findSTDUsage() {
		return this.billingTranscation
				.getStdMinutesSessions()
				.stream()
				.mapToInt(stdMinute -> stdMinute.getStdMinutesUsage())
				.sum();
	}
	
	private int internetUsage() {
		return this.billingTranscation
				.getInternetDataSessions()
				.stream()
				.mapToInt(internetData -> internetData.getInternetDataUsage())
				.sum();
	}
}