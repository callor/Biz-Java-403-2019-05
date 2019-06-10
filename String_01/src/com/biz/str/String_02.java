package com.biz.str;

public class String_02 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		int intNationLength = 0;
		
		// length : 길이, 크기와 관련된 keyword
		// 배열.length : 배열의 전체 개수 : 맴버변수
		// 문자열.length() : 문자열의 개수를 알려주는 method
		intNationLength = strNation.length();
		System.out.println("Nation 개수 : " + intNationLength);
		
		
		/*
		 * 배열의 개수를 알수있는 배열.length는 맴버변수이고
		 * 문자열의 개수를 알수있는 문자열.length()는 method이다
		 * 따라서 배열의 개수를 알수있는 맴버변수의 값을 읽는것보다
		 * 문자열의 개수를 읽는 method를 실행하는 시간이 더 걸릴 것이다.
		 */
		
	}

}
