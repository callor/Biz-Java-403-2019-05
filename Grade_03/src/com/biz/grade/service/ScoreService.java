package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.biz.grade.model.ScoreVO;

public class ScoreService {
	
	// main메서드가 없는 클래스에서는
	// 필드(맴버변수)들은 선언만하고,
	// 초기화(생성)은 클래스의 생성자 등에서 실행한다.
	List<ScoreVO> scList ;
	FileReader fileReader;
	BufferedReader buffer;

	/*
	 * 생성자에서는 선언된 맴버변수(필드)들을 
	 * 초기화 하는 코드를 작성
	 * 
	 * 생성자에서는 파일이름을 문자열 매개변수로
	 * 받는다
	 */
	public ScoreService(String fileName) 
			throws FileNotFoundException {

		scList = new LinkedList<ScoreVO>();
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
	
	}
	
	public void viewList() {
		for(ScoreVO vo : scList) {
			System.out.println(vo);
		}
	}
	
	public void readFile() throws IOException {
		String reader = "";
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			// 이름[0], 과목명[1], 점수[2]
			String[] scores = reader.split(",");
			
			// scList에서 학생이름을 검색하여
			// 값이 있는지 확인
			// 있으면 해당학생의 과목점수를 세팅
			int count = 0;
			int scSize = scList.size();
			// for(ScoreVO vo : scList) {

			for(count = 0 ; count < scSize ; count++) {
				
				// list에서 vo 추출
				ScoreVO vo = scList.get(count);
				String strName = vo.getName();
				
				// count++;
				if(strName.equals(scores[0].trim())) {
					int intScore = Integer.valueOf(scores[2]);
					String subject = scores[1];
					if(subject.equals("국어")) vo.setKor(intScore);
					if(subject.equals("영어")) vo.setEng(intScore);
					if(subject.equals("수학")) vo.setMath(intScore);
					if(subject.equals("국사")) vo.setHis(intScore);
					if(subject.equals("미술")) vo.setArt(intScore);
					if(subject.equals("과학")) vo.setSci(intScore);
					break;
				}
			}
			
			// scList에 학생 데이터가 없는경우
			if(count >= scList.size()) {
				
				ScoreVO vo = new ScoreVO();
				vo.setName(scores[0].trim());
				int intScore = Integer.valueOf(scores[2]);
				String subject = scores[1];
				
				if(subject.equals("국어")) vo.setKor(intScore);
				if(subject.equals("영어")) vo.setEng(intScore);
				if(subject.equals("수학")) vo.setMath(intScore);
				if(subject.equals("국사")) vo.setHis(intScore);
				if(subject.equals("미술")) vo.setArt(intScore);
				if(subject.equals("과학")) vo.setSci(intScore);
				
				scList.add(vo);
			}
		}
	}
	
}






