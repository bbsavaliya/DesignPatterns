package com.barclays.fundtransfer.request.requestimpl;

import com.barclays.fundtransfer.request.IServiceRequest;

public class ServiceRequestImpl implements IServiceRequest {
	private final long userId;
	private final String password;
	private final long fromAccId;
	private final long toAccId;
	private final double amount;
	
	public ServiceRequestImpl(long userId, String password, long fromAccId, long toAccId, double amount) {
		this.userId = userId;
		this.password = password;
		this.fromAccId = fromAccId;
		this.toAccId = toAccId;
		this.amount = amount;
	}

	@Override
	public long getUserId() {
		return this.userId;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public long getFromAccId() {
		return this.fromAccId;
	}

	@Override
	public long getToAccId() {
		return this.toAccId;
	}

	@Override
	public double getAmount() {
		return this.amount;
	}
}