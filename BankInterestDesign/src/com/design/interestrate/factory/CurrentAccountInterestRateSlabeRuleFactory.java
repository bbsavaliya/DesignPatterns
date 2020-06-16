package com.design.interestrate.factory;

import java.util.ArrayList;
import java.util.List;

import com.design.interestrate.slabs.CurrentAccountInterestRateSlabRule;
import com.design.interestrate.slabs.InterestRateSlab;
import com.design.interestrate.slabs.InterestRateSlabRule;

public class CurrentAccountInterestRateSlabeRuleFactory implements InterestRateSlabRuleFactory {

	@Override
	public InterestRateSlabRule createInterestRateSlabRule() {
		List<InterestRateSlab> interestRateSlabs = new ArrayList<InterestRateSlab>();
		interestRateSlabs.add(new InterestRateSlab(0, 10000 , 0.05));
		interestRateSlabs.add(new InterestRateSlab(10001, 100000 , 0.07));
		interestRateSlabs.add(new InterestRateSlab(100001, 1000000 , 0.06));
		
		return new CurrentAccountInterestRateSlabRule(interestRateSlabs);
	}

}