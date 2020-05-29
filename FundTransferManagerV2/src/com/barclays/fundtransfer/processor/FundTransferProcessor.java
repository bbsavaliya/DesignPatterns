package com.barclays.fundtransfer.processor;

import com.barclays.fundtransfer.dao.AccountDAO;
import com.barclays.fundtransfer.model.Account;
import com.barclays.fundtransfer.request.Request;
import com.barclays.fundtransfer.request.Response;

public class FundTransferProcessor implements Processor {
	private final Processor nextProcessor;

	public FundTransferProcessor(Processor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

	@Override
	public Response process(Request request) {
		boolean transferStatus = transfer(request);
		if (nextProcessor != null) {
			return this.nextProcessor.process(request);
		} else {
			return new Response(request.getSourceAccountId(), request.getDestinationAccountId(), transferStatus);
		}
	}

	private boolean transfer(final Request request) {
		AccountDAO accountDAO = AccountDAO.getInstance();
		Account srcAccount = accountDAO.findByAccountId(request.getSourceAccountId());
		Account destAccount = accountDAO.findByAccountId(request.getDestinationAccountId());
		srcAccount.debit(request.getTransferAmount());
		destAccount.credit(request.getTransferAmount());
		System.out.println("Transfer done");
		return true;
	}
}