package com.biz.exec;

import com.biz.model.ScoreVO;
import com.biz.model.StudentVO;

public class Exec_02 {

	public static void main(String[] args) {

		StudentVO stVO = new StudentVO();
		ScoreVO scVO = new ScoreVO();
		
		stVO.number = "1";
		
		scVO.setKor(120);
		int intKor = scVO.getKor();
		
		scVO.setKor(-50);
		intKor = scVO.getKor();
		
		System.out.println("국어점수 : " + intKor);
		
		
	}

}
