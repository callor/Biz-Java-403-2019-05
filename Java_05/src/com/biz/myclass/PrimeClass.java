package com.biz.myclass;

public class PrimeClass {

	/*
	 * lastNum변수는 Oop_04에서
	 * pc.prime(50) 이라고 명령을 실행하면
	 * 50이라는 값을 받는 일종의 바구니 역할을 한다.
	 * 
	 * 이러한 변수를 특별히 매개변수, argument라고 한다.
	 * 이 변수는 Oop_04에서 pc.primt()메서드를 
	 * 임의로 변경하는 것과 같은 효과를 낼수 있도록 한다.
	 */
	public void prime(int lastNum) {
		for(int i = 1; i <= lastNum;i++) {
			int index = 0;
			for(index = 2; index <= i; index++) {
				if(i % index == 0) {
					break;
				}
			}
			if(index >= i) {
				System.out.println(i + "는 소수");
			}
		}
	}

	
	public void prime() {
		for(int i = 1; i <= 100;i++) {
			int index = 0;
			for(index = 2; index <= i; index++) {
				if(i % index == 0) {
					break;
				}
			}
			if(index >= i) {
				System.out.println(i + "는 소수");
			}
		}
	}

}
