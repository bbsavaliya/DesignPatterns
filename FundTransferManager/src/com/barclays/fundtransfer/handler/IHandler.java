package com.barclays.fundtransfer.handler;

import com.barclays.fundtransfer.request.IServiceRequest;

public interface IHandler {
	public boolean handle(IServiceRequest serviceRequest);
	
	public void setNextRequestHandler(IHandler requestHandler);
}