package com.barclays.calculator.fectory;

import java.util.ArrayList;
import java.util.List;

import com.barclays.calculator.INVESTMENT;
import com.barclays.exemptions.Exemption;
import com.barclays.exemptions.ExemptionRule;
import com.barclays.exemptions.IndiaExemptionRule;

public class IndiaExemptionRuleFectory implements ExemptionRuleFectory {
	@Override
	public ExemptionRule createExemptionRule() {
		List<Exemption> exemptions = new ArrayList<Exemption>();
		exemptions.add(new Exemption(INVESTMENT.HOUSING_LOAN, 0.2));
		exemptions.add(new Exemption(INVESTMENT.INVESTMENT_IN_LIFE_INSURANCE, 0.15));
		exemptions.add(new Exemption(INVESTMENT.INVESTMENT_IN_PENSION_SCHEME, 0.1));
		exemptions.add(new Exemption(INVESTMENT.INVESTMENT_IN_TAX_SAVER_FUND, 0.1));

		return new IndiaExemptionRule(exemptions);
	}
}
