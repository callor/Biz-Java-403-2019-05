package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_04 {

	public static void main(String[] args) {

		String scoreFile = "src/com/biz/grade/data/score.txt";
		FileReader fileReader ;
		BufferedReader buffer;
		
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			int intTotal = 0;
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break;
				
				String[] scores = reader.split(":");
				
				// score.txt파일에서 문자열을 읽어서
				// 점수부분의 총합을 계산
				int intScore = Integer.valueOf(scores[1]);
				intTotal += intScore;
				System.out.printf("학번:%s\t점수:%s\n",
							scores[0],scores[1]);
			}
			System.out.println("=========================");
			System.out.println("총점:" + intTotal);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일이 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 중 오류발생");
		}
		
	}

}
