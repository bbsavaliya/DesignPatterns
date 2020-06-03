package com.barclays.planner.budget;

public class Duration {
	private final int month;
	private final int year;
	
	public Duration(int month, int year) {
		this.month = month;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
}