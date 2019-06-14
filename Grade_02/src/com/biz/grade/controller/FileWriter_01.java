package com.biz.grade.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_01 {

	public static void main(String[] args) {
		String scoreFile = "src/com/biz/grade/data/score_01.txt";
		
		FileWriter fileWriter;
		PrintWriter printer;
		
		try {
			
			fileWriter = new FileWriter(scoreFile);
			printer = new PrintWriter(fileWriter);
		
			for(int i = 0 ; i < 100;i++) {
				printer.println(i);
			}
			/*
			 * 파일 쓰기(기록) 기능은
			 * 내용을 기록하는 코드가 수행되더라도
			 * 실제 파일에 내용을 저장하지 않는다.
			 * 
			 * 그래서
			 * 파일 내용을 강제로 저장하도록 메서드를 실행 해 주어야 한다.
			 */
			printer.flush(); // 반드시
			printer.close(); // 반드시
			fileWriter.close(); // 선택적
			System.out.println("파일 기록 완료!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("알수없는 이유로 파일 생성 못함!!!");
		}
		
		
		
	}

}
