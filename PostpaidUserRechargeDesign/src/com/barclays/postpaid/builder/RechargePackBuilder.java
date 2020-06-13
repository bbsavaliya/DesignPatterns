package com.barclays.postpaid.builder;

import com.barclays.postpaid.component.RechargePack;
import com.barclays.postpaid.strategy.InternetData;
import com.barclays.postpaid.strategy.LocalMin;
import com.barclays.postpaid.strategy.STDMin;

public class RechargePackBuilder implements Builder {
	private LocalMin localMins;
	private STDMin stdMins;
	private InternetData internetData;
	private double basePrice;
	
	@Override
	public Builder setLocalMins(LocalMin localMins) {
		this.localMins = localMins;
		return this;
	}
	@Override
	public Builder setStdMins(STDMin stdMins) {
		this.stdMins = stdMins;
		return this;
	}
	@Override
	public Builder setInternetData(InternetData internetData) {
		this.internetData = internetData;
		return this;
	}
	@Override
	public Builder setBasePrice(double price) {
		this.basePrice = price;
		return this;
	}
	
	public RechargePack build() {
		return new RechargePack(this.localMins, this.stdMins, this.internetData, this.basePrice);
	}
}