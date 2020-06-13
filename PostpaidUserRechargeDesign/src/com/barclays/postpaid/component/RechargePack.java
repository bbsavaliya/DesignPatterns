package com.barclays.postpaid.component;

public class RechargePack {
	private final LocalMin localMins;
	private final STDMin stdMins;
	private final InternetData internetData;
	private final double basePrice;
	
	public RechargePack(LocalMin localMins, STDMin stdMins, InternetData internetData, double basePrice) {
		this.localMins = localMins;
		this.stdMins = stdMins;
		this.internetData = internetData;
		this.basePrice = basePrice;
	}
	
	public LocalMin getLocalMins() {
		return localMins;
	}
	
	public STDMin getStdMins() {
		return stdMins;
	}
	
	public InternetData getInternetData() {
		return internetData;
	}
	
	public double getBasePrice() {
		return basePrice;
	}

	@Override
	public String toString() {
		return "RechargePack [localMins=" + localMins + ", stdMins=" + stdMins + ", internetData=" + internetData
				+ ", basePrice=" + basePrice + "]";
	}
}