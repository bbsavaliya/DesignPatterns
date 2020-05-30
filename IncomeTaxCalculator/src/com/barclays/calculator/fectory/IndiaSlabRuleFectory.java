package com.barclays.calculator.fectory;

import java.util.ArrayList;
import java.util.List;

import com.barclays.slabs.IndiaSlabRule;
import com.barclays.slabs.SlabRule;
import com.barclays.slabs.TaxSlab;

public class IndiaSlabRuleFectory implements SlabRuleFectory {
	@Override
	public SlabRule createSlabRule() {
		List<TaxSlab> taxSlabs = new ArrayList<>();
		taxSlabs.add(new TaxSlab(0, 250000 , 0.10));
		taxSlabs.add(new TaxSlab(250001, 500000 , 0.10));
		taxSlabs.add(new TaxSlab(500001, 2000000 , 0.30));

		return new IndiaSlabRule(taxSlabs);
	}
}
