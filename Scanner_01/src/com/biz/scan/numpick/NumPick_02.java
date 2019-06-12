package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_02 {

	/*
	 * 일반적으로 main() 메서드가 없는 클래스들은
	 * 다양한 method 들을 정의하여 외부에서 사용할수 있도록
	 * 코드가 만들어진다.
	 * 
	 * 이때,
	 * 클래스에 정의된 method 들이
	 * 공통으로 사용할 변수들은 member 변수 영역에 선언한다.
	 * 
	 * member 변수 영역에 선언된 변수중에
	 * Primetive(기본형변수 int, float, String, boolean)들은
	 * 자동으로 초기화가 되어 사용준비가 된다.
	 * 
	 * 하지만
	 * reference(참조형변수 배열, 객체 등)들은
	 * 자동으로 초기화가 되지 않아 사용준비가 되지 않는다.
	 */
	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; //  초기화코드(= new Random();)를 생성자로... 
	private Scanner scan ;
	
	/*
	 * member 변수 영역에 선된 참조형변수들을
	 * 사용할수 있도록 초기화(생성)코드는
	 * 생성자 메서드에 그 코드를 작성해주어야 한다.
	 */
	public NumPick_02() {
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	
}
