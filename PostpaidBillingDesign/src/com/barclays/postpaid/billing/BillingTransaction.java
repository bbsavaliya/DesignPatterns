package com.barclays.postpaid.billing;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
		this.sessionEndTime = LocalDateTime.now().plusSeconds(100);
		this.totalSessionTime = (int) ChronoUnit.SECONDS.between(this.sessionStartTime, this.sessionEndTime);
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