package com.barclays.postpaid.builder;

import com.barclays.postpaid.composite.InternetData;
import com.barclays.postpaid.composite.LocalMin;
import com.barclays.postpaid.composite.RecharchPack;
import com.barclays.postpaid.composite.STDMin;

public interface Builder {
	public Builder setBasePrice(double basePrice);
	
	public Builder addLocalMinComponent(LocalMin localMin);
	
	public Builder addSTDMinComponent(STDMin stdMin);
	
	public Builder addInternetDataComponent(InternetData internetData);
	
	public RecharchPack build();
}