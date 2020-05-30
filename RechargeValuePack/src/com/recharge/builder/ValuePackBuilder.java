package com.recharge.builder;

import com.recharge.product.ValuePack;

public abstract class ValuePackBuilder {
	protected ValuePack valuePack;
	
	public void createValuePack() {
		valuePack = new ValuePack();
	}
	
	public ValuePack getValuePack() {
		return this.valuePack;
	}
	
	public abstract void setBasePrice();
	
	public abstract void setLocalMins();
	
	public abstract void setStdMins();
	
	public abstract void setInternetData();
}