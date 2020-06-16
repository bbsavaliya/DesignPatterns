package com.design.postpaid.builder;

import com.design.postpaid.composite.InternetData;
import com.design.postpaid.composite.LocalMin;
import com.design.postpaid.composite.RecharchPack;
import com.design.postpaid.composite.STDMin;

public class RechargePackBuilder implements Builder {
	private final RecharchPack rechargePack;
	
	public RechargePackBuilder() {
		this.rechargePack = new RecharchPack();
	}
	
	@Override
	public Builder setBasePrice(double basePrice) {
		this.rechargePack.setBasePrice(basePrice);
		return this;
	}

	@Override
	public Builder addLocalMinComponent(LocalMin localMin) {
		this.rechargePack.addComponent(localMin);
		return this;
	}
	
	@Override
	public Builder addSTDMinComponent(STDMin stdMin) {
		this.rechargePack.addComponent(stdMin);
		return this;
	}

	@Override
	public Builder addInternetDataComponent(InternetData internetData) {
		this.rechargePack.addComponent(internetData);
		return this;
	}

	@Override
	public RecharchPack build() {
		return this.rechargePack;
	}
}