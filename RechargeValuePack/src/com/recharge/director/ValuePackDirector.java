package com.recharge.director;

import com.recharge.builder.ValuePackBuilder;
import com.recharge.product.ValuePack;

public class ValuePackDirector {
	public ValuePack constructValuePack(ValuePackBuilder builder) {
		builder.createValuePack();
		
		builder.setBasePrice();
		builder.setLocalMins();
		builder.setStdMins();
		builder.setInternetData();
		
		return builder.getValuePack();
	}
}