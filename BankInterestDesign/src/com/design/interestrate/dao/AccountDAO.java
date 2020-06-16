package com.design.interestrate.dao;

import com.design.interestrate.account.Account;
import com.design.interestrate.slabs.InterestRateSlabRule;

public abstract class AccountDAO {
	private static final AccountDAO accountDAO = new SavingAccountDAO();

	public abstract Account findByAccountId(long accountId);
	
	public abstract void create(InterestRateSlabRule interestRateSlabRule);
	
	public static AccountDAO getInstance() {
		return accountDAO;
	}
}