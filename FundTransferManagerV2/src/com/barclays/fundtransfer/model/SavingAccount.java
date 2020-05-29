package com.barclays.fundtransfer.model;

public class SavingAccount extends Account {
	private final double interestReate;
	
	public SavingAccount(long accountId, double balance, double interestRate) {
		super(accountId, balance);
		this.interestReate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return this.interestReate;
	}
}