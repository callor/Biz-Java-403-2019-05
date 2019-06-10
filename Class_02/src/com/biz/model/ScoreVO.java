package com.biz.model;

/*
 * VO : value Object
 * 사용자 정의 변수라고 하며
 * 맴버변수에 값들을 담아서 다른 메서드에 보내거나
 * 메서드에서 리턴하는 값을 받는 용도로 사용된다.
 * 
 * extends Object
 * -- 개발자가 어떤 클래스를 선언하면
 * -- 코드를 직접작성하지 않아도
 * -- 자동으로 생성되는 보이지 않는 코드
 * -- 자바에 기본적으로 들어있는 Object라는 클래스의
 * -- method 들을 사용할수 있도록 해주는 구문
 * 
 */
public class ScoreVO extends Object{

	// private : 아무나 함부로 맴버변수에
	//		접근(저장, 읽기모두)하지 말라
	private String number;
	
	private int kor;
	private int eng;
	private int math;
	
	private int total;
	private int avg;
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public void setKor(int kor) {
		if(kor > 100 || kor < 0) {
			System.out.printf("국어점수(%d)는 0점이상 100점 이하만 가능!!\n",kor);
		} else {
			this.kor = kor;	
		}
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public String toString() {
		return "학번:" + this.number
				+ "국어:" + this.kor
				+ "영어:" + this.eng
				+ "수학:" + this.math;
				
	}
	
}
