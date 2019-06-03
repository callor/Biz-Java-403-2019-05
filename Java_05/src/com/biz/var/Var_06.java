package com.biz.var;

public class Var_06 {

	public static void main(String[] args) {

		/*
		 * 영문자, 숫자, 기호 등은 실제로 기억장치에 저장되거나
		 * 통신을 통해서 이동될때
		 * ASCII 코드라는 값으로 변환된다.
		 * char 형 변수는 1개의 글자를 저장하는 용도로 사용
		 * 
		 * 영문소문자 a는 ASCII 코드 97로 표현된다.
		 * 
		 *  97부터 26개의 숫자를 연속에서 char형으로변환하면
		 *  영문소문자들을 콘솔에서 볼수 있다.
		 *  
		 */
		for(int i = 97; i < (97+26) ; i++) {
			char a = (char)i;
			System.out.println(a);
		}
		
		// 작은따옴표로 묶인 1개의 글자는 
		// char형으로 
		// 보이기는 문자로 보이지만
		// 실제로는 1byte 크기의 숫자로 인식된다.
		for(int i = 'a' ; i <= 'z' ; i++) {
			System.out.print(i); // ASCII 코드값
			System.out.print(" : ");
			System.out.println((char)i); // ASCII 코드에 해당하는 문자
		}
		// println은 값을 콘솔에 표시하고 enter를 누른것처럼
		// 		줄바꿈을 하고
		// print는 줄바꿈을 하지 않는다.
		// print를 사용하면 여러줄의 명령결과를 한줄에 이어서 표시한다.
	}
}
