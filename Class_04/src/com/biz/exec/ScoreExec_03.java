package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		ScoreVO[] sVOs = new ScoreVO[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < sVOs.length ; i++) {
			System.out.print("입력방법 : 학번,국어,영어,수학 >>");
			String strKeyInput = scan.nextLine();
			
			String[] strKeys = strKeyInput.split(",");
			
			String strNumber = strKeys[0];
			int intKor = Integer.valueOf(strKeys[1]);
			int intEng = Integer.valueOf(strKeys[2]);
			int intMath = Integer.valueOf(strKeys[3]);
			
			ScoreVO sVO = new ScoreVO();
			sVO.setNumber(strNumber);
			sVO.setKor(intKor);
			sVO.setEng(intEng);
			sVO.setMath(intMath);
			
			sVOs[i] = sVO;
			
		}
	}
}
