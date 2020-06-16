package com.design.postpaid.composite;

import java.util.ArrayList;
import java.util.List;

public class RecharchPack {
	private List<ValuePackComponent> valuePack;
	private double basePrice;
	
	public RecharchPack() {
		this.valuePack = new ArrayList<ValuePackComponent>();
	}
	
	public void addComponent(ValuePackComponent valuePackComponent) {
		this.valuePack.add(valuePackComponent);
	}

	public List<ValuePackComponent> getValuePack() {
		return valuePack;
	}
	
	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
}