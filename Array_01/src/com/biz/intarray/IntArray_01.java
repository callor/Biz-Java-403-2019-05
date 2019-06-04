package com.biz.intarray;

public class IntArray_01 {

	public static void main(String[] args) {

		int intKor_01 = 90;
		int intKor_02 = 70;
		int intKor_03 = 80;
		int intKor_04 = 77;
		int intKor_05 = 90;
		int intKor_06 = 78;
		int intKor_07 = 60;
		
		int intSum = 0;
		intSum += intKor_01;
		intSum += intKor_02;
		intSum += intKor_03;
		intSum += intKor_04;
		intSum += intKor_05;
		intSum += intKor_06;
		intSum += intKor_07;
		System.out.println("국어점수 총점:" + intSum);
		
		float fAvg = 0;
		fAvg = intSum / 7.0f;
		
		System.out.println("국어점수 학급평균 : " + fAvg);
		
		

	}

}
