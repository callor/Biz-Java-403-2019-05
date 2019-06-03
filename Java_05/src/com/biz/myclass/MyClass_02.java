package com.biz.myclass;

public class MyClass_02 {

	// MyClass_02의 맴버변수
	public int num1 = 0;
	public int num2 = 0;
	
	// void형 메서드
	// void형 메서드는 보통 return을 생략한다
	// 만약 return을 사용하려면 아무런 값이 없이 사용한다.
	public void add() {
		System.out.println(num1 + num2);
		return ;
	}

	// return type이 있는 메서드
	// return type이 있는 메서드는 반드시 return문이 있어야한다.
	// return되는 데이터형이 return type과 일치해야한다.
	// 또한 호출한곳에서 return되는 값을 사용하려면
	// 같은 type의 변수에 받야 한다.
	public String add(int num1, int num2) {
		// System.out.println(num1 + num2);
		return "" + (num1 + num2);
	}

	public String add(String s1, String s2) {
		return s1 + s2;
	}
	
	public float add(float f1, float f2) {
		return f1 + f2;
	}
	
	
	public void times() {
		System.out.println(num1 * num2);
		return ;
	}
	
	public void minus( ) {
		System.out.println(num1 - num2);
		return ;
	}
	
	
	
	
}
