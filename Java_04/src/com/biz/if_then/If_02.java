package com.biz.if_then;

public class If_02 {

	public static void main(String[] args) {

		// 0부터 35까지 
		for(int i = 0 ; i < 35;i++) {
			System.out.println(i);
		}
		
		for(int i = 0 ; i < 35 ;i++) {
			if(i % 2 == 0) {
				System.out.println(i + "는 짝수입니다");
			}
		}
		/*
		 * 0부터 100까지의 숫자중
		 * 2로 나눈 나머지가 0인 숫자(짝수)들의 합계 계산
		 */
		int intSum = 0;
		for(int i = 0 ; i <=100;i++) {
			if(i % 2 == 0) {
				intSum += i;
			}
		}
		System.out.println("짝수의 합:" + intSum);
	}

}
