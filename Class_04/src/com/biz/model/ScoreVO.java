package com.biz.model;

public class ScoreVO {

	private String number;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
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
	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ "]";
	}
	
	
	
}
