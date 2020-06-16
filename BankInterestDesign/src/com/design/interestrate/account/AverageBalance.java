package com.design.interestrate.account;

import java.util.function.DoubleConsumer;

public class AverageBalance implements DoubleConsumer {
	private double total = 0;
	private double count = 0;
	
	@Override
	public void accept(double value) {
		total += value; 
		count++;
	}
	
	public void combine(AverageBalance other) {
        total += other.total;
        count += other.count;
    }
	
	public double average() {
	   return count > 0 ? ((double) total)/count : 0;
	}
}