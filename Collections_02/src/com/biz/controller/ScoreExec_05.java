package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_05 {

	public static void main(String[] args) {

		// 일단 비어있는(리스트가 없는) 자료구조(Data Structure)를 생성하고
		// 필요에 따라 내용(리스트)를 추가해서 사용할 수 있는
		// 자바의 독득한 기능
		// 자바 1.8이상에서만 정상 작동된다.
		// List scList = new ArrayList();
		
		// 호환성을 위해서 사용하는 표준문법
		// 1. ScoreVO(성적표)를 담을 비어있는 List를 생성
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		Random rnd = new Random();
		
		// 2. List에 담을 개인성적표 생성하고 값을 대입
		// 홍길동 학생의 개인 성적표 생성, 값을 대입
		ScoreVO sVO = new ScoreVO();
		sVO.setNumber("1");
		sVO.setName("홍길동");
		sVO.setKor(rnd.nextInt(50) + 51);
		sVO.setEng(rnd.nextInt(50) + 51);
		sVO.setMath(rnd.nextInt(50) + 51);
		
		// 3. 개인성적표를 List에 추가
		// scList에 추가를 해야한다.
		scList.add(sVO);
		
		// 성춘향 학생의 성적표를 생성하고 값을 대입한후
		sVO = new ScoreVO();
		sVO.setNumber("2");
		sVO.setName("성춘향");
		sVO.setKor(rnd.nextInt(50) + 51);
		sVO.setEng(rnd.nextInt(50) + 51);
		sVO.setMath(rnd.nextInt(50) + 51);

		// List에 추가
		scList.add(sVO);
		
		
		
		
	}

}
