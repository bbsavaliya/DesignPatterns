package com.barclays.postpaid.billing;

public class InternetDataSession {
	private int internetDataUsage;
	
	public void addUsageSession(Integer internetDataUsage) {
		this.internetDataUsage += internetDataUsage;
	}

	public int getInternetDataUsage() {
		return internetDataUsage;
	}
}