package com.biz.mybatis.model;

public class StudentVO {

	private String st_num;	//varchar2(5 byte)
	private String st_name;	//nvarchar2(50 char)
	private String st_tel;	//varchar2(20 byte)
	private int st_grade;	//number
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentVO(String st_num, String st_name, String st_tel, int st_grade) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_tel = st_tel;
		this.st_grade = st_grade;
	}
	
	public String getSt_num() {
		return st_num;
	}
	public void setSt_num(String st_num) {
		this.st_num = st_num;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_tel() {
		return st_tel;
	}
	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}
	public int getSt_grade() {
		return st_grade;
	}
	public void setSt_grade(int st_grade) {
		this.st_grade = st_grade;
	}
	@Override
	public String toString() {
		return "StudentVO [st_num=" + st_num + ", st_name=" + st_name + ", st_tel=" + st_tel + ", st_grade=" + st_grade
				+ "]";
	}
	
	
	
	
}
