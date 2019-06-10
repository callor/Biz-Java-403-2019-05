package com.biz.exec;

import com.biz.model.BookVO;
import com.biz.model.ScoreVO;

public class Exec_03 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		BookVO bVO = new BookVO();
		
		scVO.setNumber("1");
		scVO.setKor(90);
		scVO.setEng(80);
		scVO.setMath(70);
		
		bVO.setTitle("이것이자바다");
		bVO.setAuth("신용권");
		bVO.setComp("한빛미디어");
		bVO.setPrice(30000);
		

		System.out.printf("학번: %s \n",scVO.getNumber());
		System.out.printf("국어: %d \n",scVO.getKor());
		System.out.printf("영어: %d \n",scVO.getEng());
		System.out.printf("수학: %d \n",scVO.getMath());
		
		int intTotal = scVO.getKor();
		intTotal += scVO.getEng();
		intTotal += scVO.getMath();
		System.out.printf("총점: %d \n",intTotal);
		
		
		
	}

}
