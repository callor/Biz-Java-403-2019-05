package com.biz.intarray;

public class IntArray_03 {

	public static void main(String[] args) {

		/*
		 * 정수값을 저장할수 있는 기억공간을 30개 예약하고
		 * 그 기억공간에 대표이름 intKor를 붙여라
		 * 
		 * ==> int형(type) 배열 30개를 만들고
		 * 	대표이름으로 intKor를 붙여라
		 * 
		 * ==>30개의 연속된 기억공간을 예약하고,
		 * 처음시작 공간에 0을 시작하여
		 * 각 공간에 십진수 고유의 주소값을 붙여 나간다.
		 */
		int[] intKor = new int[30];
		
		// 30개의 호수가 있는 intKor에 각각 값들을 대입
		intKor[0] = 90;
		intKor[1] = 80;
		intKor[2] = 70;
		intKor[3] = 88;
		intKor[4] = 66;
		intKor[5] = 89;
		intKor[6] = 85;
		intKor[7] = 90;
		
		// 배열은 일반 변수와 달리
		// 그 배열을 활용할때 for 반복문을 사용할수 있는 특징
		int intSum = 0;
		for(int i = 0 ; i < 8 ;i++) {
			intSum += intKor[i];
		}
		
		intSum = 0;
		intSum += intKor[0];
		intSum += intKor[1];
		intSum += intKor[2];
		intSum += intKor[3];
		intSum += intKor[4];
		intSum += intKor[5];
		intSum += intKor[6];
		intSum += intKor[7];
		
	}

}
