package com.barclays.postpaid.strategy;

import com.barclays.postpaid.component.Usage;

public class InternetData implements Billing {
	private final int internetData;
	private final double internetDataCharge;
	
	public InternetData(int internetData, double internetDataCharge) {
		this.internetData = internetData;
		this.internetDataCharge = internetDataCharge;
	}

	public int getInternetData() {
		return internetData;
	}

	public double getInternetDataCharge() {
		return internetDataCharge;
	}

	@Override
	public double calculateBill(Usage usage) {
		int totalUsage = usage.getInternetData() - this.internetData;
		return totalUsage > 0 ? totalUsage * this.internetData : 0.0;
	}

	@Override
	public String toString() {
		return "InternetData [internetData=" + internetData + ", internetDataCharge=" + internetDataCharge + "]";
	}
}