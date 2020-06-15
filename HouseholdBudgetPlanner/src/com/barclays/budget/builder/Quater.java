package com.barclays.budget.builder;

import java.util.HashMap;
import java.util.Map;

public enum Quater {
	FIRST_QUATER(4, 6),
	SECOND_QUATER(7, 9),
	THIRD_QUATER(10, 12),
	FOURTH_QUATER(1, 3);
	
	private final int quaterStart;
	private final int quaterEnd;
	private static final Map<Integer, Quater> quaterMapByStart;
	
	static {
		quaterMapByStart = new HashMap<Integer, Quater>();
		for(Quater quater: Quater.values()) {
			quaterMapByStart.put(quater.getQuaterStart(), quater);
		}
	}
	
	private Quater(int quaterStart, int quaterEnd) {
		this.quaterStart = quaterStart;
		this.quaterEnd = quaterEnd;
	}
	
	public int getQuaterStart() {
		return quaterStart;
	}

	public int getQuaterEnd() {
		return quaterEnd;
	}
	
	public static Quater getQuaterFromStart(int quaterStart) {
		return quaterMapByStart.get(quaterStart);
	}
}