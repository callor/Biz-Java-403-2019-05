package com.biz.exec;

public class Exec_06 {

	public static void main(String[] args) {

		Object object = new Object();
		// object라는 객체(변수)가 생성되어 저장된 기억장소의 주소를
		// return 해주는 method
		String addr = object.toString();
		
		System.out.println(addr);
		
	}

}
