package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_01 {

	public static void main(String[] args) {

		/*
		 * ScoreVO 클래스를 이용한 sVO 객체를 생성하고
		 * 키보드에서 학번, 이름, 국어, 영어, 수학 점수를
		 * 각각 입력받아 sVO 객체의 각 필드에 대입(저장)하고
		 * 저장된 값을 콘솔에 보이시오
		 */
		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번>");
		String strNum = scan.nextLine();
		
		System.out.print("이름(영문)>");
		String strName = scan.nextLine();
		
		System.out.print("국어점수>");
		String strKor = scan.nextLine();
		int intKor = Integer.valueOf(strKor);
		
		System.out.print("영어점수>");
		String strEng = scan.nextLine();
		int intEng = Integer.valueOf(strEng);

		System.out.print("수학점수>");
		String strMath = scan.nextLine();
		int intMath = Integer.valueOf(strMath);

		sVO.setNumber(strNum);
		sVO.setName(strName);
		sVO.setKor(intKor);
		sVO.setEng(intEng);
		sVO.setMath(intMath);
		
		System.out.println(sVO.toString());
		
	}

}
