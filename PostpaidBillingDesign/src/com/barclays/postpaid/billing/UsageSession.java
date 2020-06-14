package com.barclays.postpaid.billing;

public interface UsageSession<T> {
	public void addUsageSession(T usage);
}