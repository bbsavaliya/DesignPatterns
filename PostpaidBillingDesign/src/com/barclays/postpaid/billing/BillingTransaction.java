package com.barclays.postpaid.billing;

import java.time.LocalDateTime;

import com.barclays.postpaid.composite.RechargeComponentType;

public class BillingTransaction {
	private RechargeComponentType rechargeComponentType;
	private LocalDateTime sessionStartTime;
	private LocalDateTime sessionEndTime;
	private int totalSessionTime;
	
	public BillingTransaction(RechargeComponentType rechargeComponentType) {
		this.rechargeComponentType = rechargeComponentType;
	}
	
	public void startSession() {
		this.sessionStartTime = LocalDateTime.now();
	}
	
	public void endSession() {
		this.sessionEndTime = LocalDateTime.now();
		this.totalSessionTime = this.sessionEndTime.getSecond() - this.sessionStartTime.getSecond();
		
		// Testing  puropse
		if(this.totalSessionTime < 1) {
			this.totalSessionTime = 1;
		}
	}

	public LocalDateTime getSessionStartTime() {
		return sessionStartTime;
	}

	public LocalDateTime getSessionEndTime() {
		return sessionEndTime;
	}

	public int getTotalSessionTime() {
		return totalSessionTime;
	}

	public RechargeComponentType getRechargeComponentType() {
		return rechargeComponentType;
	}
}