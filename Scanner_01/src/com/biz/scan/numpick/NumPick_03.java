package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; //  초기화코드(= new Random();)를 생성자로... 
	private Scanner scan ;

	// 생성자 메서드
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	
	public void pickup() {
		
		int intRnd = rnd.nextInt(10)+1; 
		int intCount = 0;
		while(true) {
			System.out.print("숫자(1~10)입력, 종료(--END) >> ");
			String strKey = scan.nextLine();
			
			if(strKey.equals("--END")) break;
			
			int intKey = Integer.valueOf(strKey.trim());
			++intCount;

			if(intKey == intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(intCount + "번만에 맞추었네요");
				intRnd = rnd.nextInt(10)+1; 
				intCount = 0;

			} else {
				if(intKey > intRnd) {
					System.out.println("큰수를 입력했군요");
				} else if(intKey < intRnd) {
					System.out.println("작은수를 입력했군요");
				}
			}
		}
		System.out.println("GAME Over!!");
	}
}
