package com.biz.mybatis.model;

/*
 * scope : 영향을 미치는 범위
 * public : 어디에서나 누구나 접근(읽기, 쓰기)이 가능
 * private
 * 		class 필드(지역)변수 : class scope라고 하며
 * 			class에 선언 메서드에서만 접근이 가능
 * 		method  (지역)변수 : method scope라고 하며
 * 			메스드 내에서만 접근이 가능하고
 * 			메서드 실행이 종료되면 모두 소멸된다.
 */



public class ScoreVO {
	private long sc_seq;		//number
	private String sc_st_num;	//	varchar2(5 byte)
	private String sc_subject;	//	nvarchar2(20 char)
	private int sc_score;		//	number

	
	/*
	 * myabatis 환경하에서의 VO는
	 * getter와 setter 그리고 생성자가 필수적이다
	 * 
	 * select와 관련된 mapper를 실행하면
	 * 생성자를 호출하여 vo에 값을 담아주고
	 * 
	 * insert, update와 관련된 mapper를 실행하면
	 * getter를 호출하여 값을 읽고
	 * sql문을 생성해 준다.
	 */
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}






	public ScoreVO(long sc_seq, String sc_st_num, String sc_subject, int sc_score) {
		super();
		this.sc_seq = sc_seq;
		this.sc_st_num = sc_st_num;
		this.sc_subject = sc_subject;
		this.sc_score = sc_score;
	}






	@Override
	public String toString() {
		return "ScoreVO [sc_seq=" + sc_seq + ", sc_st_num=" + sc_st_num + ", sc_subject=" + sc_subject + ", sc_score="
				+ sc_score + "]";
	}






	public long getSc_seq() {
		return sc_seq;
	}






	public void setSc_seq(long sc_seq) {
		this.sc_seq = sc_seq;
	}






	public String getSc_st_num() {
		return sc_st_num;
	}






	public void setSc_st_num(String sc_st_num) {
		this.sc_st_num = sc_st_num;
	}






	public String getSc_subject() {
		return sc_subject;
	}






	public void setSc_subject(String sc_subject) {
		this.sc_subject = sc_subject;
	}






	public int getSc_score() {
		return sc_score;
	}






	public void setSc_score(int sc_score) {
		this.sc_score = sc_score;
	}






	public void add() {
		int num = 0;
		System.out.println(this.sc_subject);
	}


}
