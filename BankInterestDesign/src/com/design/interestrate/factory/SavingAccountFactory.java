package com.design.interestrate.factory;

import com.design.interestrate.dao.AccountDAO;

public class SavingAccountFactory implements AccountFactory {
	AccountDAO accountDAO = AccountDAO.getInstance();
	
	@Override
	public void createAccount() {
		 this.accountDAO.create(new SavaingAccountInterestRateSlabRuleFactory().createInterestRateSlabRule());
	}
}