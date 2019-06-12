package com.biz.scan;

public class StringInt_01 {

	public static void main(String[] args) {

		System.out.println(30+40); // 70
		System.out.println("30+40"); // 30+40
		
		// "30"과 "40"은 문자열형 숫자라고 하며
		// 숫자 30과 숫자 40으로 변환시켜서
		// 4칙연산을 수행할 수도 있다.
		System.out.println("30" + "40");
		
		// 문자열을 정수로 변환하여 덧셈을 수행
		System.out.println(Integer.valueOf("30") 
						 + Integer.valueOf("40") );
		
		// 정수를 문자열로 변환하여 연결을 수행
		System.out.println(Integer.toString(30)
						 + Integer.toString(40) );
		
		System.out.println(Float.valueOf("30.0f"));
		
		// 30문자열 뒤에 white space가 있어서
		// 숫자(정수)로 변환할수 없다.
		// NumberFormat Exception
		System.out.println(Integer.valueOf("A30 ") );
		
		
	}

}
