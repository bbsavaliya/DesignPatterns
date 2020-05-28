package com.barclays.fundtransfer.service.authservice;

import com.barclays.fundtransfer.handler.IHandler;
import com.barclays.fundtransfer.request.IServiceRequest;

public interface IAuthServiceHandler extends IHandler {
	public boolean isAuthenticated(final IServiceRequest request);
}