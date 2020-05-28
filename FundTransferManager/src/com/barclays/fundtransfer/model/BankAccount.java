package com.barclays.fundtransfer.model;

public class BankAccount {
	private long acc_id;
	private double balance;
	private User owner;
	private String type;
	
	public BankAccount(long acc_id, double balance, User owner, String type) {
		this.acc_id = acc_id;
		this.balance = balance;
		this.owner = owner;
		this.type = type;
	}

	public long getAcc_id() {
		return acc_id;
	}

	public double getBalance() {
		return balance;
	}

	public User getOwner() {
		return owner;
	}

	public String getType() {
		return type;
	}
}