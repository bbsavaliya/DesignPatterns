package com.barclays.fundtransfer.request;

public class Response {
	private final long sourceAccountId;
	private final long destinationAccountId;
	private final boolean transferStatus;
	
	public Response(long sourceAccountId, long destinationAccountId, boolean transferStatus) {
		this.sourceAccountId = sourceAccountId;
		this.destinationAccountId = destinationAccountId;
		this.transferStatus = transferStatus;
	}

	public long getSourceAccountId() {
		return sourceAccountId;
	}

	public long getDestinationAccountId() {
		return destinationAccountId;
	}

	public boolean getTransferStatus() {
		return transferStatus;
	}

	@Override
	public String toString() {
		return "Response [sourceAccountId=" + sourceAccountId + ", destinationAccountId=" + destinationAccountId
				+ ", transferStatus=" + transferStatus + "]";
	}
}