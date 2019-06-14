package com.biz.grade.controller;

import java.io.FileNotFoundException;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp_05;

public class ScoreExec_03 {

	public static void main(String[] args) {
		String scoreFile = "src/com/biz/grade/data/score_02.txt";

		/*
		 * try 문으로 묶어야되는 명령문이 있을경우
		 * try 문 안에서 객체나, 변수를 생성하면
		 * try 문안에 모든 코드를 집중시켜야 한다.
		 * 
		 * 그래서 선언문과 생성문을 별도로 분리하는 것이 좋다.
		 */
		ScoreService sService = null; //선언문
		try {
			// 생성문
			sService = new ScoreServiceImp_05(scoreFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sService.inputScore(0);
		sService.viewList();
		
		
		
		
	}

}
