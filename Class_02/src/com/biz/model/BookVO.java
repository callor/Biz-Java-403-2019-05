package com.biz.model;

public class BookVO {

	private String title;
	private String auth;
	private String comp;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * toString() 메서드는 원래 Object클래스에 내장된 method이다
	 * 이 method는 객체가 저장되는 메모리의 주소를 알려주는 용도이다.
	 * 
	 * BookVO 클래스를 만든 개발자는
	 * Object로부터 물려받은 toString() 메서드를
	 * 다시 정의하여(생성하여) 필드에 입력된 값들을 보여주는 문자열로
	 * 생성하고, 그 문자열을 return하는 메서도로 만들었다.
	 * 
	 * 이렇게 어떤 클래스로 부터 물려받은 method를 다시 정의하는 것을
	 * Override라고 한다.
	 *
	 */
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", auth=" + auth + ", comp=" + comp + ", price=" + price + "]";
	}
	
	
	
	
	
}
