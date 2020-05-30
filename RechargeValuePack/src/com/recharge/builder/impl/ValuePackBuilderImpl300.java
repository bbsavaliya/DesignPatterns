package com.recharge.builder.impl;

import com.recharge.builder.ValuePackBuilder;

public class ValuePackBuilderImpl300 extends ValuePackBuilder {

	@Override
	public void setBasePrice() {
		getValuePack().setBasePrice(300);
	}

	@Override
	public void setLocalMins() {
		getValuePack().setLocalMins(1000);
	}

	@Override
	public void setStdMins() {
		getValuePack().setStdMins(300);
	}

	@Override
	public void setInternetData() {
		getValuePack().setInternetData(1000);
	}
}