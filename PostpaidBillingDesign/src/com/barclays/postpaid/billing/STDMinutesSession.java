package com.barclays.postpaid.billing;

public class STDMinutesSession {
	private int stdMinutesUsage;
	
	public void addUsageSession(Integer stdMinuteusage) {
		this.stdMinutesUsage += stdMinuteusage;
	}

	public int getStdMinutesUsage() {
		return stdMinutesUsage;
	}
}