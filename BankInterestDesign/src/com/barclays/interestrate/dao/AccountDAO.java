package com.barclays.interestrate.dao;

import com.barclays.interestrate.account.Account;
import com.barclays.interestrate.slabs.InterestRateSlabRule;

public abstract class AccountDAO {
	private static final AccountDAO accountDAO = new SavingAccountDAO();

	public abstract Account findByAccountId(long accountId);
	
	public abstract void create(InterestRateSlabRule interestRateSlabRule);
	
	public static AccountDAO getInstance() {
		return accountDAO;
	}
}