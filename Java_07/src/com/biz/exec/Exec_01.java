package com.biz.exec;

import java.util.Random;

public class Exec_01 {

	public static void main(String[] args) {

		/*
		 * 비교판단문
		 * 어떤결과가 true, false를 판단해서
		 * 코드의 흐름을 변경하는 것
		 * 
		 */
		
		Random rnd = new Random();
		
		while(true) {
			int intR = rnd.nextInt(100);
			if(intR%2 == 0) {
				// intR을 2로 나머지 연산을 수행하여
				// 결과가 0 이냐?
				System.out.println(intR + "은 짝수입니다");
				System.out.println(intR + "은 2의 배수입니다");
			} 
			if(intR%3 == 0) {
				System.out.println(intR + "은 3의 배수입니다");
			}
			
			int intNum = intR % 5;
			if(intNum == 0) System.out.println(intNum + "5의 배수");
			if(intNum == 1) System.out.println("나머지가 1");
			if(intNum == 2) System.out.println("나머지가 1");
			if(intNum == 3) System.out.println("나머지가 1");
			if(intNum == 4) System.out.println("나머지가 1");
			
			switch (intNum) {
			case 0:
				System.out.println("나머지가 0");
				break;
			case 1:
				System.out.println("나머지가 1");
				break;
			case 2:
				System.out.println("나머지가 2");
				break;
			case 3:
				System.out.println("나머지가 3");
				break;
			case 4:
				System.out.println("나머지가 4");
				break;

			default:
				break;
			}
			
			
			
			
		}
		
		
	}

}













