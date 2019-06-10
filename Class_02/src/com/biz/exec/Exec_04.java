package com.biz.exec;

import com.biz.model.ScoreVO;

public class Exec_04 {

	public static void main(String[] args) {

		// scores는 ScoreVO 클래스를 20개의 배열로 예약만 한 상태
		ScoreVO[] scores = new ScoreVO[20];

		// 아직은 scores를 사용할수 없다.
		
		// scores[0].setNumber("1");
		
		
		// 클래스 배열은 예약만 한 상태에서는
		// 읽거나 쓰가 모두 불가능하다.
		// 배열 요소요소들을 모두 다시 초기화 시켜줘야 한다.
		for(int i = 0 ; i<scores.length;i++) {
			scores[i] = new ScoreVO();
		}
		
		
	}

}
