package com.biz.exec;

public class FibNumEx_03 {

	/*
	 * 피보나치 수열중 짝수이면서 400만 이하인 항들의 합계
	 */
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		
		int sum = num2;
		while(true) {
			
			int fNum = num1 + num2;
			if(fNum > 4000000) break;
			
			if(fNum % 2 == 0) sum += fNum;
			
			num1 = num2;
			num2 = fNum;
			System.out.println(fNum);
		}
		
		System.out.println("최종확인:" + sum);
		
	}

}
