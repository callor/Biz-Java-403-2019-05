package com.biz.exec;

import com.biz.model.Student;

public class Exec_02 {

	public static void main(String[] args) {

		// 선언된 Student class를 사용해서
		// student 객체를 선언하고
		// 사용할수 있도록 초기화를 수행
		Student student1 = new Student();
		student1.intNum  = 1;
		student1.strName = "홍길동";
		student1.intGrade = 3;
		student1.strDetp = "컴공과";

		Student student2 = new Student();
		student2.intNum = 2;
		student2.strName = "이몽룡";
		student2.intGrade = 2;
		student2.strDetp = "물리학과";

		Student student3 = new Student();
		student2.intNum = 3;
		student2.strName = "성춘항";
		student2.intGrade = 4;
		student2.strDetp = "회계학과";
		
		view(student1);
		view(student2);
		view(student3);
		
	}
	
	// 한 학생의 정보를 매개변수로 받아서
	// 콘솔에 표시하는 method
	public static void view(Student std) {
		
		System.out.println("학번:" + std.intNum);
		System.out.println("이름:" + std.strName);
		System.out.println("학년:" + std.intGrade);
		System.out.println("학과:" + std.strDetp);
		
	}

}
