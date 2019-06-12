package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

/*
 * main() method가 없는 클래스는
 * helper 클래스라고도 하며
 * 		다른 클래스, method에서 객체로 생성하여
 * 		사용하는 클래스
 */
public class NumPick_01 {

	// 맴버변수 영역(scope), 필드변수 영역
	// rnd와 scan 객체를 각각의 클래스로 선언만
	//  rnd와 scan에 포함된 method들을 아직 사용할수 없다.
	private Random rnd ;
	private Scanner scan ;
	
	// 클래스의 생성자 메서드
	// 1. 클래스명과 똑같이(첫글자 대문자 등..) 이름을 정하고
	// 2. 리턴 type이 정의 되지 않는다.
	public NumPick_01() {
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	
	public Scanner getScan() {
		return scan;
	}
}
