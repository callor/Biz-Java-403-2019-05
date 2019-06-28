package com.biz.jdbc.model;

public class ScoreVO {
	private long sc_seq;		//number
	private String sc_date;		// varchar2(10 byte)
	private String sc_st_no;	// char(3 byte)
	private String sc_subject;	// nvarchar2(20 char)
	private int sc_score;		// number
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreVO(long sc_seq, String sc_date, String sc_st_no, String sc_subject, int sc_score) {
		super();
		this.sc_seq = sc_seq;
		this.sc_date = sc_date;
		this.sc_st_no = sc_st_no;
		this.sc_subject = sc_subject;
		this.sc_score = sc_score;
	}
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
