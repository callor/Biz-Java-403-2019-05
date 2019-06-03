package com.biz.algo;

import java.util.Random;

public class Star_04 {

	public static void main(String[] args) {

		int intNum = 0;
		// Random type의 변수를 선언
		// Random type의 변수는 초기화를 하는데
		// new 라는 키워드를 이용해서 초기화를 한다 
		Random rnd = new Random();
		
		// Random type을 이용해서 생성한 rnd라는 변수는
		// Random type에서 제공하는 다양한 명령들을 포함하는
		// 특별한 변수가 된다.
		// 이러한 변수들은 객체라고 한다.
		// 		또는 인스턴스라고 한다.
		intNum = rnd.nextInt(10);
		
		System.out.println(intNum);
		
		for(int i = 1; i <=intNum + 1;i++) {
			for(int j = 1; j <= i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
