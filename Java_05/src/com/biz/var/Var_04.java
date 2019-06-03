package com.biz.var;

public class Var_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKor = 83;
		int intEng = 72;
		int intMath = 75;
		
		int intSum = intKor + intEng + intMath;
		System.out.println("총점:" + intSum);
		System.out.println("평균:" + intSum / 3);
		
		// 실수형의 기본값은 double형으로 8byte 크기
		System.out.println("평균:" + intSum / 3.0);
		System.out.println("평균:" + (double)intSum / 3.0);
		
		// f를 붙여주면 float으로 4byte크기
		System.out.println("평균:" + intSum / 3.0f);
		System.out.println("평균:" + (float)intSum / 3.0f);

	}

}
