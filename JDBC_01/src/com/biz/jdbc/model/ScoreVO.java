package com.biz.jdbc.model;

public class ScoreVO {

	/*
	 * DB와 연동하는 VO의 경우
	 * 일련번호 칼럼의 값이 NUMBER형일 경우
	 * java에서는 long형으로 선언하는 것이 좋다.
	 */
	private long sc_seq;		//	number
	private String sc_date;		//	varchar2(10 byte)
	private String sc_st_no;	//	char(3 byte)
	private int sc_score;		//	number
	private String sc_sb_no;	//	char(3 byte)
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
	public int getSc_score() {
		return sc_score;
	}
	public void setSc_score(int sc_score) {
		this.sc_score = sc_score;
	}
	public String getSc_sb_no() {
		return sc_sb_no;
	}
	public void setSc_sb_no(String sc_sb_no) {
		this.sc_sb_no = sc_sb_no;
	}
	@Override
	public String toString() {
		return "ScoreVO [sc_seq=" + sc_seq + ", sc_date=" + sc_date + ", sc_st_no=" + sc_st_no + ", sc_score="
				+ sc_score + ", sc_sb_no=" + sc_sb_no + "]";
	}
	
	
	
	
}
