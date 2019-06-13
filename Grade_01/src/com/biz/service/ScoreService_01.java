package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreService_01 implements ScoreService {

	private List<ScoreVO> scoreList;
	private Scanner scann ;

	public ScoreService_01() {
		scoreList = new ArrayList<ScoreVO>();
		scann = new Scanner(System.in);
	}
	
	/*
	 * throws
	 * 혹시 메서드가 실행되는 과정에서
	 * Exception이 발생할 확률이 단 1%라도 존재하면
	 * 발생된 Exception을 throw 하여
	 * 호출한 곳에서 Exception을 처리하도록 하는 키워드
	 */
	public boolean inputScore(int number) throws NumberFormatException {

		number++;
		System.out.print(number + "번 국어점수(종료:EX)>");
		String strKor = scann.nextLine();
		if(strKor.equals("EX")) return false;
		
		int intKor = Integer.valueOf(strKor);
		
		System.out.print(number + "번 영어점수>");
		String strEng = scann.nextLine();
		int intEng = Integer.valueOf(strEng);
		
		System.out.print(number + "번 수학점수>");
		String strMath = scann.nextLine();
		int intMath = Integer.valueOf(strMath);
		
		ScoreVO vo = new ScoreVO("" + number,intKor,intEng,intMath);
		System.out.println(vo.toString());
		scoreList.add(vo);
		
		return true;
		
	}
	
	public void makeTotal() {
		int listLen = scoreList.size();
		for(int i = 0 ; i < listLen ; i++) {
			ScoreVO vo = scoreList.get(i);
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
		}
	}
	
	public void makeRank() {
		int listLen = scoreList.size();
		for(int i = 0 ; i < listLen;i++) {
			for(int j = i+1 ; j < listLen ;j++) {
				
				ScoreVO sI = scoreList.get(i);
				ScoreVO sJ = scoreList.get(j);

				if(sI.getTotal() < sJ.getTotal()) {
					ScoreVO _score = sI;
					scoreList.set(i,sJ);
					scoreList.set(j,_score);
				}
			}
		}
		for(int i = 0 ; i < listLen;i++) {
			scoreList.get(i).setRank(i+1);
		}
	}
	
	public void viewScore() {
		
		System.out.println("빅데이터반 성적표");
		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAverage() + "\n");
		}
		System.out.println("==============================================");		
	}
}





