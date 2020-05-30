package com.recharge.product;

public class ValuePack {
	private int basePrice;
	private int localMins;
	private int stdMins;
	private int internetData;
	
	public int getBasePrice() {
		return basePrice;
	}
	
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	
	public int getLocalMins() {
		return localMins;
	}
	
	public void setLocalMins(int localMins) {
		this.localMins = localMins;
	}
	
	public int getStdMins() {
		return stdMins;
	}
	
	public void setStdMins(int stdMins) {
		this.stdMins = stdMins;
	}
	
	public int getInternetData() {
		return internetData;
	}
	
	public void setInternetData(int internetData) {
		this.internetData = internetData;
	}

	@Override
	public String toString() {
		return "ValuePack [basePrice=" + basePrice + ", localMins=" + localMins + ", stdMins=" + stdMins
				+ ", internetData=" + internetData + "]";
	}
}