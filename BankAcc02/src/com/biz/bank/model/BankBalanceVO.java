package com.biz.bank.model;

public class BankBalanceVO {

	private String acc;
	private int balance;
	private String date;
	
	public BankBalanceVO(String acc, int balance, String date) {
		super();
		this.acc = acc;
		this.balance = balance;
		this.date = date;
	}
	public BankBalanceVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BankBalanceVO [acc=" + acc + ", balance=" + balance + ", date=" + date + "]";
	}
	
	// getter와 setter toString 
	// 기본생성자, 필드생성자
	
	
	
}
