package com.biz.grade.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_02 {

	/*
	 * data.txt 파일을 읽어서 그 내용을 Console에 보이기
	 */
	public static void main(String[] args) {

		String strFile = "src/com/biz/grade/data/data.txt";
		FileReader fileReader;
		BufferedReader buffer;
		
			try {
				fileReader = new FileReader(strFile);
				buffer = new BufferedReader(fileReader);
				String reader = "" ;
				while(true) {
					reader = buffer.readLine();
					if(reader == null) break;
					System.out.println(reader);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("data.txt 파일이 없습니다");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("파일을 읽는중에 문제가 발생!!");
			}
		
		
	}

}







