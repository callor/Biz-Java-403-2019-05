package com.biz.grade.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {

	public static void main(String[] args) {

		String scoreFile = "src/com/biz/grade/data/score_02.txt";
		
		FileWriter fileWriter;
		PrintWriter printWriter;
		Random rnd = new Random();
		
		try {
			fileWriter = new FileWriter(scoreFile);
			printWriter = new PrintWriter(fileWriter);
			
			for(int i = 0 ; i < 100 ;i++) {
				
				int intNum = i+1;
				int intKor = rnd.nextInt(50) + 51;
				int intEng = rnd.nextInt(50) + 51;
				int intMath = rnd.nextInt(50) + 51;
				
				// 1:90:80:70 형식으로 문자열을 생성하여 파일에 기록
				printWriter.printf("%d:%d:%d:%d\n"
						,intNum,intKor,intEng,intMath);
			}
			printWriter.flush();
			printWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
