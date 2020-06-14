package com.barclays.interestrate.dao;

import java.util.HashMap;
import java.util.Map;

import com.barclays.interestrate.account.Account;
import com.barclays.interestrate.account.SavingAccount;
import com.barclays.interestrate.slabs.InterestRateSlabRule;

public class SavingAccountDAO extends AccountDAO {
	private final Map<Long, Account> accountMap;
	
	public SavingAccountDAO() {
		this.accountMap = new HashMap<>();
	}
	
	@Override
	public Account findByAccountId(long accountId) {
		return this.accountMap.get(accountId);
	}

	@Override
	public void create(InterestRateSlabRule interestRateSlabRule) {
		this.accountMap.put(1L, new SavingAccount(1L, 15000, interestRateSlabRule));
		this.accountMap.put(2L, new SavingAccount(2L, 20000, interestRateSlabRule));
	}
}