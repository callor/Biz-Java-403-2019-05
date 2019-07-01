package com.biz.mybatis.exec;

import com.biz.mybatis.service.ScoreService;
import com.biz.mybatis.service.StdService;

public class LMSEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StdService stdService = new StdService();
		ScoreService scoreService = new ScoreService();
		
		while(true) {
	
			System.out.println("=======================");
			System.out.println("빛나리 고교 학사 관리");
			System.out.println("-----------------------");
			
			// 학번검사를 하여 없으면 등록 있으면 다음으로 계속
			//
			if(stdService.isNotStd()) stdService.insertStd();
			
			// 학번 변수 값을 가져오기
			String st_num = stdService.getSt_num();

			// 성적을 입력하기 위해서 학번을 ScoreService에 Setting
			scoreService.setSt_num(st_num);
			
			// 점수리스트보기
			scoreService.viewScore(st_num);
			
			// 점수 추가
			scoreService.insertScore(st_num);
		
		}
	}
}
