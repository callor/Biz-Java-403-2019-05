package com.biz.model;

import java.util.Random;

import com.biz.model.Student;

public class StudentArray {

	/*
	 * Student 클래스를 객체배열로 생성하고
	 * 가상의 학생 성적데이터를 만들어서
	 * return 하는 method로 변경
	 */
	public Student[] makeScore(int stdLen) {

		// 숫자형배열은
		// 배열을 초기화하면 각 개별값이 0으로 생성
		int[] intA = new int[10]; 
		
		// 문자열형배열은
		// 배열을 초기화하면 각 개별값이 ""으로 생성
		String[] strA = new String[10];

		// Student 클래스 객체 배열 10개를 예약하라
		// 아직 예약만 되어있고
		// 사용할 준비가 되지 않은상태
		Student[] stdScore = new Student[stdLen];
		
		// 기타 다른 클래스들을 이용한
		// 객체 배열은 사용(읽기, 쓰기)전에
		// 각 배열 요소를 개별적으로 초기화하는 코드를 수행해야 한다.
		
		// 가상의 성적을 만들기위해 난수발생기를 사용한다.
		Random rnd = new Random();
		
		// for 반복문을 사용해서 같은 코드를 10번 수행했다.
		for(int i = 0 ; i <stdScore.length;i++) {
	
			stdScore[i] = new Student();
			stdScore[i].intNum = i + 1;
			
			stdScore[i].intKor = rnd.nextInt(50) + 51;
			stdScore[i].intEng= rnd.nextInt(50) + 51;
			stdScore[i].intMath= rnd.nextInt(50) + 51;
			
		}
		return stdScore;
	} // makeScore 끝나는 부분
	
	public void viewScore(Student[] stdScore) {
		
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		for(int i = 0 ; i < stdScore.length ; i++) {
			
			int intSum = stdScore[i].intKor;
			intSum += stdScore[i].intEng;
			intSum += stdScore[i].intMath;
			
			float fAvg = intSum / 3.0f;
						
			System.out.print(stdScore[i].intNum+"\t");
			
			System.out.print(stdScore[i].intKor +"\t");
			System.out.print(stdScore[i].intEng +"\t");
			System.out.print(stdScore[i].intMath + "\t");
			
			System.out.print(intSum + "\t");
			System.out.print(fAvg+ "\t");
			System.out.println();
		}
		System.out.println("====================================================");
		
		
	}
}
