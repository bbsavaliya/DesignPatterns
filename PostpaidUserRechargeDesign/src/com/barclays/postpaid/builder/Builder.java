package com.barclays.postpaid.builder;

import com.barclays.postpaid.component.InternetData;
import com.barclays.postpaid.component.LocalMin;
import com.barclays.postpaid.component.RechargePack;
import com.barclays.postpaid.component.STDMin;

public interface Builder {
	public Builder setLocalMins(LocalMin localMins);
	
	public Builder setStdMins(STDMin stdMins);
	
	public Builder setInternetData(InternetData internetData);
	
	public Builder setBasePrice(double price);
	
	public RechargePack build();
}