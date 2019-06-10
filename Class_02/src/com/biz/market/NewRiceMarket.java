package com.biz.market;

public class NewRiceMarket extends RiceMarket{

	@Override
	public void margin() {

		// 판매금액 /1.1을 실행하면 부가세를 뺀 실제 판매 금액
		float oprice = (float)(this.oprice/1.1);
		
		// 매입금액 /1.1을 실행하면 부가세를 뺀 실제 매입 금액
		float iprice = (float)(this.iprice/1.1);
				
		int oVat = this.oprice - (int)oprice;
		int iVat = this.iprice - (int)iprice;
	
		System.out.printf("판매금액 : %f \n",  oprice);
		System.out.printf("매입금액 : %f \n",  iprice);
		System.out.printf("이익금 : %f \n",oprice - iprice);
		System.out.printf("납부할 VAT : %d \n", oVat - iVat);
	
	}
	
}
