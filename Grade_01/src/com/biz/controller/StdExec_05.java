package com.biz.controller;

import com.biz.service.StudentService;

public class StdExec_05 {

	public static void main(String[] args) {

		StudentService stdSvr = new StudentService();
		
		for(int i = 0 ; i < 3 ; i++) {
			stdSvr.inputStudent(i);	
		}
		stdSvr.viewStudents();
		
	}

}
