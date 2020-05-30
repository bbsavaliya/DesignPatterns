package com.recharge.billing.user.usage.impl;

import com.recharge.billing.user.usage.IUsage;

public class Usage implements IUsage{
	private int localMins;
	private int stdMins;
	private int internetData;

	public Usage(int localMins, int stdMins,int internetData) {
		this.setLocalMins(localMins);
		this.setStdMins(stdMins);
		this.setInternetData(internetData);
	}
	
	@Override
	public int getLocalMins() {
		return this.localMins;
	}

	private void setLocalMins(int localMins) {
		this.localMins = localMins;
	}

	@Override
	public int getStdMins() {
		return this.stdMins;
	}

	private void setStdMins(int stdMins) {
		this.stdMins = stdMins;
	}

	@Override
	public int getInternetData() {
		return this.internetData;
	}

	private void setInternetData(int internetData) {
		this.internetData = internetData;
	}
}