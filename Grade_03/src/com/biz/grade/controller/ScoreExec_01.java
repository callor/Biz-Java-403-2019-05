package com.biz.grade.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.grade.service.ScoreService;

public class ScoreExec_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/grade/성적표.txt";
		
		ScoreService sService ;
		try {
			sService = new ScoreService(fileName);
			sService.readFile();
			sService.viewList();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
