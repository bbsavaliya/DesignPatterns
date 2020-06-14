package com.barclays.interestrate.factory;

import com.barclays.interestrate.dao.AccountDAO;

public class SavingAccountFactory implements AccountFactory {
	AccountDAO accountDAO = AccountDAO.getInstance();
	
	@Override
	public void createAccount() {
		 this.accountDAO.create(new SavaingAccountInterestRateSlabRuleFactory().createInterestRateSlabRule());
	}
}