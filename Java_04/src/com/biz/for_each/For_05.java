package com.biz.for_each;

public class For_05 {

	public static void main(String[] args) {

		int intMax = 10;
		int intSum = 0;
		
		for(int i = 0; i <= intMax;i++) {
			System.out.println(i);
			intSum += i;
		}
		System.out.println("0부터 " + intMax + " 까지의 합");
		
		for(int i = 0; i <= intMax;i+=2) {
			System.out.println(i);
			intSum += i;
		}
		System.out.println("0부터 " + intMax + " 까지 짝수의 합");

		
		
	}

}
