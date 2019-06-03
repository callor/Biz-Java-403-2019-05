package com.biz.algo;

public class Prime_01 {

	public static void main(String[] args) {

		int intNum = 11;
		int index = 2;
		for(index=2; index < intNum ;index++) {
			if(intNum % index == 0) {
				// System.out.println(intNum + "는 소수가 아님");
				break;
			}
		}
		if(index >= intNum) {
			System.out.println(intNum + "는 소수입니다");
		} else {
			System.out.println(intNum + "는 소수가 아님");
		}
		
		
		
		
	}

}
