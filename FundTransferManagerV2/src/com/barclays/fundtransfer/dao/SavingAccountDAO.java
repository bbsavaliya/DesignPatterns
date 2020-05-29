package com.barclays.fundtransfer.dao;

import java.util.HashMap;
import java.util.Map;

import com.barclays.fundtransfer.model.Account;
import com.barclays.fundtransfer.model.SavingAccount;

public class SavingAccountDAO extends AccountDAO {
	private final static Map<Long, Account> accountMap;
	
	static {
		accountMap = new HashMap<>();
		accountMap.put(1L, new SavingAccount(1L, 15000 , 3.5));
		accountMap.put(2L, new SavingAccount(2L, 20000 , 3.5));
	}
	
	@Override
	public Account findByAccountId(long accountId) {
		return accountMap.get(accountId);
	}
}