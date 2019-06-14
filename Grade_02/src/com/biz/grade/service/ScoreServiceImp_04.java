package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.grade.model.ScoreVO;

public class ScoreServiceImp_04 implements ScoreService {

	private ScoreVO[] scArray;
	private FileReader fileReader;
	private BufferedReader buffer;

	public ScoreServiceImp_04() {
		// this(10);
	}

	public ScoreServiceImp_04(int arrLen, String scoreFile) throws FileNotFoundException {

		scArray = new ScoreVO[arrLen];
		fileReader = new FileReader(scoreFile);
		buffer = new BufferedReader(fileReader);

	}

	@Override
	public boolean inputScore(int number) throws NumberFormatException {

		String reader = "";
		try {
			
			int index = 0;
			while (true) {
				reader = buffer.readLine();
				if (reader == null) break;
				
				String[] scores = reader.split(":");
				int intNum = Integer.valueOf(scores[0]);
				int intKor = Integer.valueOf(scores[1]);
				int intEng = Integer.valueOf(scores[2]);
				int intMath = Integer.valueOf(scores[3]);
				
				ScoreVO vo = new ScoreVO();
				vo.setNumber(intNum);
				vo.setKor(intKor);
				vo.setEng(intEng);
				vo.setMath(intMath);
				
				scArray[index++] = vo;
				
			}
		} catch (IOException e) {
			return true;
		}
		return false;
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewList() {

		System.out.println("빅데이터반 성적표");
		System.out.println("====================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for(ScoreVO vo : scArray) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAverage() + "\t");
			
			// 한줄을 표시한 마지막 출력문은 끝에 \n을 붙이거나
			// println()을 사용한다
			System.out.println(vo.getRank());
		}
		System.out.println("====================================");
		
	}

	@Override
	public int deptAvg() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deptAvgView() {
		// TODO Auto-generated method stub

	}

}
