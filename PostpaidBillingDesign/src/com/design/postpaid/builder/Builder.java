package com.design.postpaid.builder;

import com.design.postpaid.composite.InternetData;
import com.design.postpaid.composite.LocalMin;
import com.design.postpaid.composite.RecharchPack;
import com.design.postpaid.composite.STDMin;

public interface Builder {
	public Builder setBasePrice(double basePrice);
	
	public Builder addLocalMinComponent(LocalMin localMin);
	
	public Builder addSTDMinComponent(STDMin stdMin);
	
	public Builder addInternetDataComponent(InternetData internetData);
	
	public RecharchPack build();
}