package com.barclays.fundtransfer.processor;

import com.barclays.fundtransfer.request.Request;
import com.barclays.fundtransfer.request.Response;

public class AuditProcessor implements Processor {
	private final Processor nextProcessor;
	
	public AuditProcessor(Processor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}
	
	@Override
	public Response process(Request request) {
		System.out.println("Request: " + request);
		Response response = null;
		if(nextProcessor != null) {
			response = this.nextProcessor.process(request);
		}
		System.out.println("Response : " + response);
		return response;
	}
}