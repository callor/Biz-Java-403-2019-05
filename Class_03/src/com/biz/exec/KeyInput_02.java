package com.biz.exec;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국가명(영문)입력 >> ");
		String keyStr = scan.nextLine();
		System.out.println(keyStr);
		
		if(keyStr.equalsIgnoreCase("KOREA")) {
			System.out.println("대한민국 사람이군요");
		} else if(keyStr.equalsIgnoreCase("USA")) {
			System.out.println("미국 사람이군요");
		} else {
			System.out.println("잘 모르는 곳이네요");
		}

	}

}
