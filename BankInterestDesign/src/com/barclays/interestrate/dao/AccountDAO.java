package com.barclays.interestrate.dao;

import com.barclays.interestrate.account.Account;

public abstract class AccountDAO {
	private static final AccountDAO accountDAO = new SavingAccountDAO();

	public abstract Account findByAccountId(long accountId);
	
	public static AccountDAO getInstance() {
		return accountDAO;
	}
}