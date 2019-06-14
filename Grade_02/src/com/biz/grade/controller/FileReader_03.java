package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {

	public static void main(String[] args) {

		String scoreFile = "src/com/biz/grade/data/score.txt";
		FileReader fileReader ;
		BufferedReader buffer;
		
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break;
				
				// 파일에서 읽은 한줄의 문자열을 
				//	콜론(:)을 중심으로 분해하여
				// scores 문자열배열에 담는다.
				String[] scores = reader.split(":");
				System.out.printf("학번:%s\t점수:%s\n",scores[0],scores[1]);
			}
			
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
