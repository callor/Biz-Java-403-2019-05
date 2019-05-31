package com.biz.for_each;

public class For_06 {

	public static void main(String[] args) {
		/*
		 * 여러줄의 주석
		 * 
		 * intMin 부터, intMax까지의
		 * 1. 전체합
		 * 2. 짝수의 합
		 * 3. 홀수의 합
		 * 
		 */ 
		
		int intMin = 0;
		int intMax = 10;
		
		int intSum = 0;
		int intEvenSum = 0;
		int intOddSum = 0;
		
		for(int i = intMin ; i <= intMax;i++) {
			intSum += i;
		}
		
		// 짝수의 시작값 계산
		int intEven = intMin + intMin%2;
		for(int i = intEven; i<=intMax;i+=2) {
			intEvenSum += i;
		}
		
		// 홀수의 시작값 계산
		int intOdd = intMin + ((intMin+1)%2) ;
		for(int i = intOdd; i<=intMax ; i+=2) {
			intOddSum += i;
		}
		System.out.println("전체합:" + intSum);
		System.out.println("짝수합:" + intEvenSum);
		System.out.println("홀수합:" + intOddSum);
		
	}

}
