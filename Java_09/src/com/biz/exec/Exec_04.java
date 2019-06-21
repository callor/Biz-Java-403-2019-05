package com.biz.exec;

public class Exec_04 {

	public static void main(String[] args) {

		// 1 ~ 100까지 정수를 덧셈하여 콘솔에 결과를 출력
		// 1+2+3+4+ ... + 100
		int intSum = 0;
		for(int i = 1 ; i<= 100;i++) {
			// intSum = intSum + i;
			intSum += i;
		}
		System.out.println("덧셈결과:" + intSum);
		
	}

}
