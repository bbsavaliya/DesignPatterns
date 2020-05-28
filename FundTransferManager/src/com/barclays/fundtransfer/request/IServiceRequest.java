package com.barclays.fundtransfer.request;

public interface IServiceRequest {
	public long getUserId();
	
	public String getPassword();
	
	public long getFromAccId();
	
	public long getToAccId();
	
	public double getAmount();
}