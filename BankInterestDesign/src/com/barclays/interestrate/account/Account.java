package com.barclays.interestrate.account;

import java.util.Arrays;

public abstract class Account {
	private final long accountId;
	private final double balance;
	private Double[] monthlyAverageBalance;
	
	public Account(long accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
		monthlyAverageBalance = new Double[31];
	}

	public long getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}
	
	public Double[] getMonthlyAverageBalance() {
		for(int i=0;i<31;i++) {
			monthlyAverageBalance[i] = Math.random() * (50000 - 10000) + 10000;
		}
		return monthlyAverageBalance;
	}
	
	public double getAverageBalance() {
		return Arrays.stream(this.getMonthlyAverageBalance())
					.collect(AverageBalance::new, AverageBalance::accept, AverageBalance::combine)
					.average();
	}

	public abstract double calculateInterest();
}