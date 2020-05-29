package com.barclays.fundtransfer;

import com.barclays.fundtransfer.processor.AuditProcessor;
import com.barclays.fundtransfer.processor.AuthenticationProcessor;
import com.barclays.fundtransfer.processor.FundTransferProcessor;
import com.barclays.fundtransfer.processor.Processor;
import com.barclays.fundtransfer.request.Request;
import com.barclays.fundtransfer.request.Response;

public class FundTransferTest {
	public static void main(String[] args) {
		final Request request = new Request(1L, "Brijesh", 1L, 2L, 1000);
		final Processor processor = new AuthenticationProcessor(
										new AuditProcessor(
											new FundTransferProcessor(null)
										)
									);
		
		final Response response = processor.process(request);
	}
}