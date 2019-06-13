package com.biz.controller;

import com.biz.service.ScoreService_01;

public class ScoreExec_09 {

	public static void main(String[] args) {

		ScoreService_01 ss = new ScoreService_01();
		
		for(int i=0;i<3;i++){
			try {
				if(!ss.inputScore(i)) break;	
			} catch (Exception e) {
				System.out.println("점수 입력 오류!!!");
				System.out.println((i+1) + "번째 다시 입력");
				i--;
				continue;
			}
		}
		ss.makeTotal();
		ss.makeRank();
		ss.viewScore();
		
	}

}
