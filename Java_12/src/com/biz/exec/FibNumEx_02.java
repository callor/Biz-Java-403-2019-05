package com.biz.exec;

public class FibNumEx_02 {

	/*
	 * 30단위까지의 피보나치 수열중
	 * 2보다 큰값 중에서 짝수의 리스트만 보여라
	 * 단, 시작하는 1,2는 그냥 보이기
	 */
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 0 ; i < 30 ; i++) {
			
			int fNum = num1 + num2;
			if(fNum % 2 == 0)
				System.out.println(fNum);
			
			num1 = num2;
			num2 = fNum;
			
		}
		

	}

}
