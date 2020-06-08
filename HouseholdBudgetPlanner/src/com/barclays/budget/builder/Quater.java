package com.barclays.budget.builder;

public enum Quater {
	FIRST_QUATER(4, 6),
	SECOND_QUATER(7, 9),
	THIRD_QUATER(10, 12),
	FOURTH_QUATER(1, 3);
	
	private final int quaterStart;
	private final int quaterEnd;

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
	
	public Quater getQuaterFromStart(int quatertart) {
		return null;
	}
}