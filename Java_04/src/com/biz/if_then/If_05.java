package com.biz.if_then;

public class If_05 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에서
		// 최초로 나타나는 6의 배수만 보고 싶다.
		for(int i = 1 ; i < 100 ; i++) {
			// i를 6으로 나누었을때 나머지가 0인 수
			// ==> 6의 배수
			if(i % 6 == 0) {
				System.out.println(i + "는 6의 배수입니다");

				// for 반복문을 중단
				break;
			}
		}
	}

}
