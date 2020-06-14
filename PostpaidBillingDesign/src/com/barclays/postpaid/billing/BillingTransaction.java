package com.barclays.postpaid.billing;

import java.util.ArrayList;
import java.util.List;

public class BillingTransaction {
	private List<LocalMinuteSession> localMinuteSessions;
	private List<STDMinutesSession> stdMinutesSessions;
	private List<InternetDataSession> internetDataSessions;
	
	public BillingTransaction() {
		this.localMinuteSessions = new ArrayList<>();
		this.stdMinutesSessions = new ArrayList<>();
		this.internetDataSessions = new ArrayList<>();
	}
	
	public void addLocalMinutesUsage(LocalMinuteSession localMinuteSession) {
		this.localMinuteSessions.add(localMinuteSession);
	}
	
	public void addSTDMinutesUsage(STDMinutesSession stdMinutesSession) {
		this.stdMinutesSessions.add(stdMinutesSession);
	}
	
	public void addInternetDataUsage(InternetDataSession internetDataSession) {
		this.internetDataSessions.add(internetDataSession);
	}

	public List<LocalMinuteSession> getLocalMinuteSessions() {
		return localMinuteSessions;
	}

	public List<STDMinutesSession> getStdMinutesSessions() {
		return stdMinutesSessions;
	}

	public List<InternetDataSession> getInternetDataSessions() {
		return internetDataSessions;
	}
}