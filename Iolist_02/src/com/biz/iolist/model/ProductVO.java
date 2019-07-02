package com.biz.iolist.model;

public class ProductVO {
	private String p_code;		// varchar2(5 byte)
	private String p_name;		// nvarchar2(50 char)
	private int p_iprice;		// number
	private int p_oprice;	// number
	
	// getter, setter, toString, 2개의 생성자
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductVO(String p_code, String p_name, int p_iprice, int p_oprice) {
		super();
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_iprice = p_iprice;
		this.p_oprice = p_oprice;
	}

	public String getP_code() {
		return p_code;
	}
	public void setP_code(String p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_iprice() {
		return p_iprice;
	}
	public void setP_iprice(int p_iprice) {
		this.p_iprice = p_iprice;
	}
	public int getP_oprice() {
		return p_oprice;
	}
	public void setP_oprice(int p_oprice) {
		this.p_oprice = p_oprice;
	}
	@Override
	public String toString() {
		return "ProductVO [p_code=" + p_code + ", p_name=" + p_name + ", p_iprice=" + p_iprice + ", p_oprice="
				+ p_oprice + "]";
	}
	

	
	
	
}
