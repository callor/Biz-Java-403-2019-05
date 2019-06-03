package com.biz.var;

public class Var_05 {

	public static void main(String[] args) {

		String strNum1 = "30";
		String strNum2 = "40";
		
		// 문자열 덧셈은 문자열을 연결한다.
		System.out.println(strNum1 + strNum2);
		
		
		// Integer.valueOf("문자열형숫자")
		// 문자열형숫자를 정수형으로 변환시키는 명령
		int intSum = Integer.valueOf(strNum1);
		intSum += Integer.valueOf(strNum2);
		
		intSum = Integer.valueOf(strNum1) + Integer.valueOf(strNum2);
		
		System.out.println(intSum);
		
		System.out.println(Integer.valueOf("300") + 30);
		

	}

}
