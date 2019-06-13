package com.biz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreService_02 implements ScoreService {

	private List<ScoreVO> scoreList;
	private Scanner scann ;

	public ScoreService_02() {
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
		Random rnd = new Random();
		int intKor = rnd.nextInt(50)+51;
		int intEng = rnd.nextInt(50)+51;
		int intMath = rnd.nextInt(50)+51;
		
		scoreList.add(new ScoreVO(""+number,intKor,intEng,intMath));
		return true;
		
	}
	
	public void calcTotal() {
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
	
	public void processRank() {

		List<String> s = new ArrayList<String>();
		Collections.sort(s);
		Collections.sort(scoreList,new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO sI, ScoreVO sJ) {
				
				if(sI.getTotal() > sJ.getTotal()) return -1;
				else if(sI.getTotal() < sJ.getTotal()) return 1;
				else return 0;

			}
		});		
		
		int listLen = scoreList.size();
		for(int i = 0 ; i < listLen;i++) {
			scoreList.get(i).setRank(i+1);
		}
	
	}
	
	public void viewScore() {
		
		System.out.println("빅데이터반 성적표");
		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("----------------------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAverage() + "\t");
			System.out.print(vo.getRank() + "\n");
		}
		System.out.println("==============================================");		
	}

	@Override
	public void makeTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeRank() {
		// TODO Auto-generated method stub
		
	}
}





