package com.biz.for_each;

public class Hello_01 {

	public static void main(String[] args) {

		int intGu = 2;
		int intEle = 1;
		for(; intEle <= 10 ;) {
			System.out.println("반복");
			System.out.println(intGu+"x"+ ++intEle+"="+intGu*intEle);	
		}
		
		

	}

}
