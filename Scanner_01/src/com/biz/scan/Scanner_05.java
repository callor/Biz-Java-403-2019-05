package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_05 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고
		 * 키보드로부터 1부터 10까지 숫자를 입력받아서
		 * 난수를 맞추는 게임 작성
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10)+1; 
		
		Scanner scan = new Scanner(System.in);

		// 몇번만에 숫자를 맞추었는지 알아보고
		// 숫자를 맞추면
		// * 번만에 맞추었네요 라고 메시지를 보여주기
		
		int intCount = 0;
		while(true) {
			System.out.print("숫자(1~10)입력 >> ");
			String strKey = scan.nextLine();
			int intKey = Integer.valueOf(strKey.trim());
			++intCount;
			
			if(intKey == intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(intCount + "번만에 맞추었네요");
				break;
			}
			if(intKey > intRnd) {
				System.out.println("큰수를 입력했군요");
			} else if(intKey < intRnd) {
				System.out.println("작은수를 입력했군요");
			}
		

		}
		System.out.println("GAME Over!!");
	}

}
