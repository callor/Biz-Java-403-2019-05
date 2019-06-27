package com.biz.jdbc.model;

public class ScoreVO {
	// sc_seq는 tbl_score의 PK로 설정되어 있고,
	// 많은 학생의 성적이 입력될 예정이다.
	// 이럴때 sc_seq의 자동증가 성질에 의해서 값이 계속 증가 된다.
	// 이러한 칼럼일 경우 언젠가 int형의 데이터 범위를 넘어갈수도 있다
	// 그래서 이러한 칼럼은 int보다 long 형으로 설정하는것을 권장
	private long sc_seq;		// number
	private String sc_date;		// varchar2(10 byte)
	private String sc_st_no;	// char(3 byte)
	private String sc_subject;	// nvarchar2(20 char)
	private int sc_score;		// number
	public long getSc_seq() {
		return sc_seq;
	}
	public void setSc_seq(long sc_seq) {
		this.sc_seq = sc_seq;
	}
	public String getSc_date() {
		return sc_date;
	}
	public void setSc_date(String sc_date) {
		this.sc_date = sc_date;
	}
	public String getSc_st_no() {
		return sc_st_no;
	}
	public void setSc_st_no(String sc_st_no) {
		this.sc_st_no = sc_st_no;
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
	@Override
	public String toString() {
		return "ScoreVO [sc_seq=" + sc_seq + ", sc_date=" + sc_date + ", sc_st_no=" + sc_st_no + ", sc_subject="
				+ sc_subject + ", sc_score=" + sc_score + "]";
	}



}
