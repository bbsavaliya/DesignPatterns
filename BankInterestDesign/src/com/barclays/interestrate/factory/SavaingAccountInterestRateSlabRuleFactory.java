package com.barclays.interestrate.factory;

import java.util.ArrayList;
import java.util.List;

import com.barclays.interestrate.slabs.InterestRateSlab;
import com.barclays.interestrate.slabs.InterestRateSlabRule;
import com.barclays.interestrate.slabs.SavingAccountInterestRateSlabRule;

public class SavaingAccountInterestRateSlabRuleFactory implements InterestRateSlabRuleFactory {

	@Override
	public InterestRateSlabRule createInterestRateSlabRule() {
		List<InterestRateSlab> interestRateSlabs = new ArrayList<>();
		interestRateSlabs.add(new InterestRateSlab(0, 10000 , 0.04));
		interestRateSlabs.add(new InterestRateSlab(10001, 100000 , 0.06));
		interestRateSlabs.add(new InterestRateSlab(100001, 1000000 , 0.05));

		return new SavingAccountInterestRateSlabRule(interestRateSlabs);
	}

}