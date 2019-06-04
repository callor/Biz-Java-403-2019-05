package com.biz.stringarray;

public class StrArray_01 {

	public static void main(String[] args) {

		// 숫자형배열은 선언과 초기화를하면 모든 요소의 값이 0으로
		// 생성된다.
		int[] intKor = new int[5];
		
		// 문자열형배열은 선언과 초기화를 하면
		// 모든요소의 값이 "" 으로 생성된다,
		String[] strNames = new String[5];
		strNames[0] = "" ;

		// 아래에서 [0], [1], [2] .. 배열의 첨자라고 부른다
		// 		strNames 배열의 위치 주소값이다.
		strNames[0] = "홍길동";
		strNames[1] = "이몽룡";
		strNames[2] = "성춘향";
		strNames[3] = "장보고";
		strNames[4] = "임꺽정";
		
	}

}
