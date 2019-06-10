package com.biz.market;

public class Market_Exec_01 {

	public static void main(String[] args) {

		RiceMarket rm = new RiceMarket();
		
		rm.iprice = 1000;
		rm.oprice = 1200;
		
		rm.margin();
	}
}
