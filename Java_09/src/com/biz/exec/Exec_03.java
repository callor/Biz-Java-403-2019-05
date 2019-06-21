package com.biz.exec;

import java.util.Random;

public class Exec_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int num = rnd.nextInt(100);
		if(num % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		
	}

}
