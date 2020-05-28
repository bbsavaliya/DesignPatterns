package com.barclays.fundtransfer.service.auditservice.audiserviceimpl;

import com.barclays.fundtransfer.handler.IHandler;
import com.barclays.fundtransfer.request.IServiceRequest;
import com.barclays.fundtransfer.service.auditservice.IAuditHandler;

public class AuditHandlerImpl implements IAuditHandler {
	private IHandler handler;

	@Override
	public boolean handle(IServiceRequest serviceRequest) {
		System.out.println("Audit Service");
		return handler == null ? true : handler.handle(serviceRequest);
	}

	@Override
	public void setNextRequestHandler(IHandler requestHandler) {
		this.handler = requestHandler;
	}
}