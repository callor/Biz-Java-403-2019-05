package com.biz.grade.model;

public class ScoreVO {

	private int number;
	private int kor;
	private int eng;
	private int math;
	
	private int total;
	private int average;
	
	private int rank;

	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(int number, int kor, int eng, int math) {
		super();
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public ScoreVO(int number, int kor, int eng, int math, int total, int average, int rank) {
		super();
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.average = average;
		this.rank = rank;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", average=" + average + ", rank=" + rank + "]";
	}

	
	
	
}
