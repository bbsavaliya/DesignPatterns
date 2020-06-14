package com.barclays.postpaid.billing;

public class LocalMinuteSession {
	private int localMinutesUsage;
	
	public void addUsageSession(Integer localMinutes) {
		this.localMinutesUsage += localMinutes;
	}

	public int getLocalMinutesUsage() {
		return localMinutesUsage;
	}
}