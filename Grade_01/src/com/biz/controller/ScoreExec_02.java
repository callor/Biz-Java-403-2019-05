package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO("1",90,80,100,0,0,0);
		int intTotal = sVO.getKor();
		intTotal += sVO.getEng();
		intTotal += sVO.getMath();
		
		sVO.setTotal(intTotal);
		
		sVO = new ScoreVO("1",90,80,100);
		
		
	}

}
