package com.biz.exec;

public class Exec_01 {

	public static void main(String[] args) {

		JavaService js = new JavaService();
		
		int ret ;
		// ret = js.add();
		ret = js.add(100);
		ret = js.add(200,500);
		
		int aaa = js.add(500,600);
		int sum = js.add(1000,2000);
		
		
	}

}
