package com.biz.exec;

import com.biz.model.Student;
import com.biz.model.StudentArray;

public class Exec_05 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		StudentArray sArray = new StudentArray();
		Student[] stdScore = sArray.makeScore(50);
		sArray.viewScore(stdScore);

	}

}
