package com.barclays.postpaid.component;

public class Usage {
	private final int localMins;
	private final int stdMins;
	private final int internetData;
	
	public Usage(int localMins, int stdMins, int internetData) {
		this.localMins = localMins;
		this.stdMins = stdMins;
		this.internetData = internetData;
	}

	public int getLocalMins() {
		return localMins;
	}

	public int getStdMins() {
		return stdMins;
	}

	public int getInternetData() {
		return internetData;
	}

	@Override
	public String toString() {
		return "Usage [localMins=" + localMins + ", stdMins=" + stdMins + ", internetData=" + internetData + "]";
	}
}