package com.barclays.postpaid.builder;

import com.barclays.postpaid.composite.InternetData;
import com.barclays.postpaid.composite.LocalMin;
import com.barclays.postpaid.composite.RecharchPack;
import com.barclays.postpaid.composite.RechargeComponentType;
import com.barclays.postpaid.composite.STDMin;

public class RechargePackDirector {
	private final Builder builder;
	
	public RechargePackDirector(Builder builder) {
		this.builder = builder;
	}
	
	public RecharchPack construct300RechargePack() {
		return this.builder.setBasePrice(300)
							.addLocalMinComponent(new LocalMin(1000, 0.5, RechargeComponentType.LOCAL))
							.addSTDMinComponent(new STDMin(300, 1, RechargeComponentType.STD))
							.addInternetDataComponent(new InternetData(1000, 3, RechargeComponentType.INTERNET_DATA))
							.build();
	}
}