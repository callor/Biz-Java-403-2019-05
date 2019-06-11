package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ScoreVO sVO = new ScoreVO();
		
		System.out.print("학번 >> ");
		String strNumber = scan.nextLine();
		
		System.out.print("국어점수 >> ");
		String strKor = scan.nextLine();
		
		System.out.print("영어점수 >> ");
		String strEng = scan.nextLine();

		System.out.print("수학점수 >> ");
		String strMath = scan.nextLine();

		sVO.setNumber(strNumber);
		sVO.setKor(Integer.valueOf(strKor));
		sVO.setEng(Integer.valueOf(strEng));
		sVO.setMath(Integer.valueOf(strMath));
		
		System.out.println("===================");
		System.out.println("입력내용 확인");
		System.out.println("-------------------");
		System.out.println(sVO.toString());
		
	}

}
