package com.biz.controller;

import com.biz.service.ScoreService;
import com.biz.service.ScoreService_03;

public class ScoreExec_10 {

	public static void main(String[] args) {

		ScoreService ss = new ScoreService_03();
		
		for(int i = 0 ; i < 100; i++) {
			if(!ss.inputScore(i));
		}
		
		ss.makeTotal();
		ss.makeRank();
		ss.viewScore();
		
	}
}
