package com.barclays.postpaid;

import com.barclays.postpaid.builder.Director;
import com.barclays.postpaid.builder.RechargePackBuilder;
import com.barclays.postpaid.component.RechargePack;
import com.barclays.postpaid.component.Usage;

public class PostpaidUserDesignTest {
	public static void main(String[] args) {
		final Director rechargePackDirector = new Director(new RechargePackBuilder());
		final Usage usage = new Usage(1100, 400, 900);
		final RechargePack rechargePack = rechargePackDirector.construct300RechargePack();
		
		System.out.println(rechargePack);
		System.out.println(usage);
		
		double totalBill = rechargePack.getBasePrice() + rechargePack.getLocalMins().calculateBill(usage)
														+ rechargePack.getStdMins().calculateBill(usage)
														+ rechargePack.getInternetData().calculateBill(usage);
		
		System.out.println("Total Bill : " + totalBill);
	}
}