package com.barclays.postpaid.builder;

import com.barclays.postpaid.component.RechargePack;
import com.barclays.postpaid.strategy.InternetData;
import com.barclays.postpaid.strategy.LocalMin;
import com.barclays.postpaid.strategy.STDMin;

public class Director {
	private final Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public RechargePack construct300RechargePack() {
		return this.builder.setBasePrice(300)
						 	.setLocalMins(new LocalMin(1000, 0.5))
						 	.setStdMins(new STDMin(300, 1))
						 	.setInternetData(new InternetData(1000, 3))
						 	.build();
						 	
	}
}