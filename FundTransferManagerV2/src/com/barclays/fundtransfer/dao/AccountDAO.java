package com.barclays.fundtransfer.dao;

import com.barclays.fundtransfer.model.Account;

public abstract class AccountDAO {
	private static final AccountDAO accountDAO = new SavingAccountDAO();

	public abstract Account findByAccountId(long accountId);
	
	public static AccountDAO getInstance() {
		return accountDAO;
	}
}