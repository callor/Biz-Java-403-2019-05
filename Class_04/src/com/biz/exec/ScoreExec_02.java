package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		/*
		 * ScoreVO 배열을 5개 생성하고
		 * 키보드로부터 5명 학생의 학번, 국어, 영어 수학 점수를 입력받고
		 * 각 배열에 저장한 후
		 * 리스트를 toString()으로 보이시오
		 */
		
		ScoreVO[] sVOs = new ScoreVO[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < sVOs.length;i++) {
			System.out.print("학번>");
			String strNum = scan.nextLine();
			
			System.out.print("국어>");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.print("영어>");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.print("수학>");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath );
			
			sVOs[i] = new ScoreVO();
			
			// sVO에 실제 담겨있는 값은 주소이다.
			ScoreVO sVO = new ScoreVO();
			sVO.setNumber(strNum);
			sVO.setKor(intKor);
			sVO.setEng(intEng);
			sVO.setMath(intMath);
			
			// sVO에 담긴 주소를
			// sVOs[i] i번째 위치에 복사(대입)하라
			sVOs[i] = sVO;
			
		}
		
	}

}
