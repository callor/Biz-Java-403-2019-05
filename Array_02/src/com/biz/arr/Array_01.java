package com.biz.arr;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intKor = new int[5];
		
		Random rnd = new Random();
		for(int i = 0; i < intKor.length;i++) {
			// 51부터 100까지 임의 수를 생성
			int intRnd = rnd.nextInt(50) + 51;
			intKor[i] = intRnd;
		}
		
		for(int i = 0 ; i < intKor.length;i++) {
			System.out.print(intKor[i]);
			
			if((i+1) % 5 == 0) System.out.println();
			else System.out.print(", ");
			
		}
		
		// 5개의 배열에 담긴 숫자 리스트를
		// 오름차순정렬(작은수부터 큰수 순서로) 정렬(sort)해서 
		// 나열

		//  70, 60, 51, 90, 77 이라고 가정 
		// 	leftI	RighI	intKor[leftI]	intKor[rightI]
		// 	0		1		intKor[0]:70	intKor[1]:60
		//							70 > 60				
		//  60, 70, 51, 90, 77 이라고 가정
		//  0		2		intKor[0]:60	intKor[2]:51
		//							60 > 51
		//  51, 70, 60, 90, 77 이라고 가정 
		
		// 반복적으로 인접한 배열에 담긴 값과 비교하여 
		// 자리바꿈을 실행하면서
		// 작은수부터 큰수 순서로 나열하는 코드
		for(int leftI = 0 ; leftI < intKor.length; leftI ++) {
			for(int rightI = leftI + 1 ; rightI < intKor.length ; rightI++) {
				if(intKor[leftI] > intKor[rightI]) {
					int _temp = intKor[leftI];
					intKor[leftI] = intKor[rightI];
					intKor[rightI] = _temp;
				}
			}
		}
		
		for(int i = 0 ; i < intKor.length;i++) {
			System.out.print(intKor[i]);
			
			if((i+1) % 5 == 0) System.out.println();
			else System.out.print(", ");
			
		}
	}

}
