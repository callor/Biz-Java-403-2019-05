package com.biz.var;

public class Var_03 {

	public static void main(String[] args) {

		float fNum1 = 0;
		float fNum2 = 0;
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		// 정수 + 정수를 실수형 변수에 저장을 하면
		// 자동으로 실수형으로 변환되어 저장된다.
		fNum1 = intNum1 + intNum2;
		System.out.println(fNum1);
		
		// 정수 + 실수를 실수형변수에 저장을 하면
		// 자동으로 실수형으로 변환되어 저장된다.
		fNum1 = intNum1 + fNum2;
		
		// 실수 + 정수를 정수형 변수에 저장을 하려면
		// 먼저 실수형을 정수형으로 강제 형 변환 해야 한다.
		intNum2 = (int)fNum1 + intNum1;
		
		
		
		
	}

}
