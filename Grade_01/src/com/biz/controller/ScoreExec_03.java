package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		ScoreVO[] scArray = new ScoreVO[5];
		
		scArray[0] = new ScoreVO("1",100,92,69);
		scArray[1] = new ScoreVO("2",80,93,79);
		scArray[2] = new ScoreVO("3",70,91,59);
		scArray[3] = new ScoreVO("4",88,90,69);
		scArray[4] = new ScoreVO("5",76,89,79);
		
		for(int i = 0 ; i < scArray.length ; i++) {
			int intTotal = scArray[i].getKor();
			intTotal += scArray[i].getEng();
			intTotal += scArray[i].getMath();
			
			scArray[i].setTotal(intTotal);
			scArray[i].setAverage(intTotal/3);
		}
		
		for(ScoreVO vo : scArray) {
			System.out.println(vo.toString());
		}
		
		
		
		
	}

}
