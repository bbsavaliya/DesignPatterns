package com.barclays.interestrate.account;

public abstract class Account {
	private final long accountId;
	private final double balance;
	
	public Account(long accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}

	public long getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}
}