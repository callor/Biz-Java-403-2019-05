package com.biz.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LeapYearService {

	List<Integer> leapYearList;
	
	public LeapYearService() {
		leapYearList = new ArrayList<Integer>();
	}
	
	public void makeLeapYearList(int startYear, int endYear) {
		for(int year = startYear ; year <= endYear ; year++) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				leapYearList.add(year);
			}
		}
		System.out.println("윤년 개수 : " + leapYearList.size());
		System.out.println("윤년 리스트를 만들었습니다");
	}
	
	public void writeLeapYearListFile(String leapFileName) {
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			fileWriter = new FileWriter(leapFileName);
			printWriter = new PrintWriter(fileWriter);
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(int year : leapYearList) {
			printWriter.println(year + "년");
		}
		printWriter.flush();
		printWriter.close();
		
		System.out.println("파일에 저장 완료!!!");
		
	}
	
	
	
}
