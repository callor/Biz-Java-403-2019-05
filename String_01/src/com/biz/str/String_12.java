package com.biz.str;

public class String_12 {

	/*
	 * 정규화문법(Requla Expression)
	 * 문자열의 정규식
	 * -- (여러가지) 조건에 맞는 문자열이 있는지 검사하는 특별한 문법
	 * -- 프로그래밍 언어에 관계없이
	 * -- 대부분의 언어에서 취급하는 규칙
	 * 
	 */
	
	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// 대문자 R로 시작하고 뒤에 1글자가 있는 조건에 맞느냐?
		boolean bYes = strNation.matches("\bR./"); // treu
		
		// R로 시작하고 뒤에 3글자(...)가 있는 조건에 맞느냐?
		bYes = strNation.matches("R..."); // true
		
		// 숫자형문자열(0부터 9까지)가 포함되어 있느냐
		bYes = strNation.matches("[0-9]"); // false
		
		
		String strEmail = "callor@callor.com";
		
		// 가장간단히 email 주소가 올바르게 입력되었는지 검사하는 코드
		bYes = strEmail.matches("[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]+");
		System.out.println(bYes);
		
		
		
		
	}

}
