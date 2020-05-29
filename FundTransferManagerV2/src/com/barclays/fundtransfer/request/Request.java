package com.barclays.fundtransfer.request;

public class Request {
	private final long userId;
	private final String password;
	private final long sourceAccountId;
	private final long destinationAccountId;
	private final double transferAmount;
	
	public Request(long userId, String password, long sourceAccountId, long destinationAccountId, double transferAmount) {
		this.userId = userId;
		this.password = password;
		this.sourceAccountId = sourceAccountId;
		this.destinationAccountId = destinationAccountId;
		this.transferAmount = transferAmount;
	}

	public long getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public long getSourceAccountId() {
		return sourceAccountId;
	}

	public long getDestinationAccountId() {
		return destinationAccountId;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	@Override
	public String toString() {
		return "Request [userId=" + userId + ", password=" + password + ", sourceAccountId=" + sourceAccountId
				+ ", destinationAccountId=" + destinationAccountId + ", transferAmount=" + transferAmount + "]";
	}
}