package com.biz.algo;

public class Star_02 {

	public static void main(String[] args) {

		for(int i = 1 ; i <= 5;i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("* "); // 한줄로 출력
			}
			System.out.println(); // 줄바꿈만 실행
		}
	}
}
