package com.biz.scan;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름>");
		String strName = scan.nextLine(); // 문자열을 입력하라
		
		System.out.print("국어점수>");
		int intKor = scan.nextInt();
		
		// nextInt() 에서 키보드로 숫자+Enter를 누르면
		// 숫자는 intKor 변수에 담고 Enter키를 키보드 저장공간에서
		// 삭제를 해주어야 하는데
		// 그렇지 않고 계속 남겨둔다
		
		// 다음번 nextLine()에서는 사용자가 무엇인가 입력하고
		// Enter를 눌렀다고 생각해 버린다.
		// 그래서 입력을 기다리지 않고 다음으로 진행해 버린다.
		System.out.print("전화번호>");
		String strTel = scan.nextLine();
		
		System.out.println("이름 : " + strName );
		System.out.println("국어 : " + intKor);
		System.out.println("전화번호 : " + strTel);
		
	}

}
