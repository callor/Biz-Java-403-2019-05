package com.biz.myclass;

public class PlusMinus {

	/*
	 * add() method는 두개의 정수형 매개변수를 선언하고 있으며
	 * 두개의 숫자를 바구니에 받아서 덧셈을 실행한 후
	 * 결과를 콘솔에 표시한다.
	 */
	public void add(int num1, int num2) {
		int intSum = num1 + num2;
		System.out.println(num1 + " 더하기 " 
					+ num2 + " 는 " +(num1 + num2) + " 입니다");
	}

	public void add(int num1) {
		System.out.println(num1);
	}
	
	public void add(float num1, float num2) {
		//  intSum = num1 + num2;
		System.out.println(num1 + " + " 
					+ num2 + " = " +(num1 + num2) + " 입니다");
	}

	
}
