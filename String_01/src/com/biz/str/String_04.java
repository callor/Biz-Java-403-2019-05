package com.biz.str;

public class String_04 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		char[] c = strNation.toCharArray();
		
		// strNation 변수에 담긴 문자열을 모두 소문자로 변환
		String str1 = strNation.toLowerCase();
		
		// strNation 변수에 담긴 문자열을 모두 대문자로 변환
		String str2 = strNation.toUpperCase();
		
		System.out.println("소문자 : " + str1);
		System.out.println("대문자 : " + str2);
		
		
	}

}
