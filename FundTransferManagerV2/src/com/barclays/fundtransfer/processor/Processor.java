package com.barclays.fundtransfer.processor;

import com.barclays.fundtransfer.request.Request;
import com.barclays.fundtransfer.request.Response;

public interface Processor {
	public Response process(Request request);
}