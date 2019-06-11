package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_01 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 sVO 객체를 생성
		
		// ScoreVO 클래스를 이용해서 sVO 객체를 선언
		//			  sVO 객체를 사용할수 있도록 초기화
		ScoreVO sVO = new ScoreVO();
		
		// sVO에 값을 저장
		sVO.setNumber("1");
		sVO.setName("홍길동");
		sVO.setKor(90);
		sVO.setEng(80);
		sVO.setMath(88);
		
		// sVO의 필드에 값들이 잘 저장되었는지 확인
		System.out.println(sVO.getNumber());
		System.out.println(sVO.getName());
		System.out.println(sVO.getKor());
		System.out.println(sVO.getEng());
		System.out.println(sVO.getMath());
		
		System.out.println(sVO.getTotal());
		
		System.out.println(sVO.toString());
		
	}

}
