package com.biz.for_each;

public class For_02 {

	public static void main(String[] args) {

		int intGu = 2;
		System.out.println("====" + intGu + " 단 ====");
		for(int intEle = 2; intEle < 10 ;intEle++) {
			System.out.println(intGu+"x" + intEle+"="+intGu*intEle);	
		}
		
		intGu++;
		System.out.println("====" + intGu + " 단 ====");
		for(int intEle = 2; intEle < 10 ;intEle++) {
			System.out.println(intGu+"x" + intEle+"="+intGu*intEle);	
		}

		
		
	}

}
