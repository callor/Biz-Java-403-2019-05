package com.biz.model;

/*
 * VO : Value Object 클래스
 * 1객체의(사람, 책, )의 데이터를 저장해서
 * 메서드간, 클래스간에 이동할때 바구니처럼
 * 사용하는 클래스
 * 
 * Dto(Data Transfer Object)
 */
public class ScoreVO {
	
	/*
	 *  vo 패턴 특징
	 *  1. 맴버변수(필드)는 꼭 필요한 용도가 아니면 대체로
	 *  	private으로 선언을 한다.
	 *  2. 맴버변수를 외부에서 접근(저장, 읽기)할수 있도록
	 *  	getter와 setter 메서드를 생성해서 사용한다.
	 *  	== 데이터의 은닉(감추기)해서 데이터를 보호하는 목적
	 *  3. toString() 메서드를 재 정의(Override)해서
	 *  	필드에 저장된 값을 외부에서 확인할수 있도록 한다. 
	 */
	private String number; 	// strNumber
	private String name; 	// strName
	private int kor;		// intKor
	private int eng;		// intEng
	private int math;		// intMath

	private int total;
	private int average;
	
	private int rank;

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

	// toString()은 원래 Object 클래스에 정의되어 있는 method이며
	// 객체가 저장된 메모리 주소를 알려주는 method이다
	// 이 method를 각 필드의 값을 확인시켜주는 용도로 변경
	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", average=" + average + ", rank=" + rank + "]";
	}

	
	
}
