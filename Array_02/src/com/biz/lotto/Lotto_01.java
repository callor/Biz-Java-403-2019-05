package com.biz.lotto;

import java.util.Random;

public class Lotto_01 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 선언및초기화(생성)하고
		// 1부터 45까지의 임의의 정수를 1개씩 배열에 채우시오
		
		int[] num = new int[6];
		
		Random rnd = new Random();
		for(int i = 0 ; i < num.length;i++ ) {
			num[i] = rnd.nextInt(45) + 1;
		}
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + "\t");
		}
		
		
		// 또다른 임의숫자(1부터 45)를 하나 생성해서
		// num 배열에 담겨 있는지 검사
		// 있으면 있다
		// 없으면 없다 라고 표시
		
		int intR = rnd.nextInt(45)+1;
		int index;
		for(index=0;index<num.length;index++) {
			if(num[index] == intR) {
				break;
			}
		}
		if(index >= num.length) {
			System.out.println("값이 없음");
		}else {
			System.out.println("값이 있음");
		}
		
		
	}

}
