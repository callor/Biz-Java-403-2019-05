package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_05 {

	public static void main(String[] args) {

		String scoreFile = "src/com/biz/grade/data/score.txt";
		FileReader fileReader ;
		BufferedReader buffer;
		
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			int intTotal = 0;
			System.out.println("빅데이터반 성적표");
			System.out.println("===================================");
			System.out.println("학번\t국어\t영어\t수학\t총점");
			System.out.println("-----------------------------------");
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break;
				
				// score.txt 파일의 한줄에
				// 콜론을 기준으로 4개의 값이 있으므로
				// scores는 4개짜리 배열로 생성된다.
				String[] scores = reader.split(":");

				String number = scores[0];
				int intKor = Integer.valueOf(scores[1]);
				int intEng = Integer.valueOf(scores[2]);
				int intMath = Integer.valueOf(scores[3]);
				int intSum = intKor + intEng + intMath;
				
				intTotal = intSum;
				System.out.printf("%s\t%d\t%d\t%d\t%d\n",
							number,intKor,intEng,intMath,intSum);
			}
			System.out.println("===================================");
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
