package com.biz.exec;

public class FibNumEx_01 {

	/*
	 * 피보나치 수열
	 * 앞에나온 2개의 숫자를 더해서 다음 수를 만드는 수열
	 * 1 2 3 5 8 13 21 34 이런 순서로 이어지는 수열
	 */
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i = 0 ; i < 30 ; i++) {
			
			// num1과 num2를 사용해서 피보나치 수열을 생성
			int fNum = num1 + num2;
			System.out.println(fNum);
			
			num1 = num2;
			num2 = fNum;
			
		}
		
		
		
	}

}
