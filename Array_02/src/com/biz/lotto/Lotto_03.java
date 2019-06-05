package com.biz.lotto;

import java.util.Random;

public class Lotto_03 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 생성하고
		
		// 정수배열 개수만큼 반복을 하면서
		// 1. 임의 정수 1부터45까지 중 한개를 생성
		// 2. 생성한 수가 배열에 이미 담겨 있는지 검사
		// 3. 그렇지 않으면 배열에 임의 정수를 담기
		
		int[] lottoNum = new int[6];
		
		Random rnd = new Random();
		for(int 저장위치 = 0 ; 저장위치 < lottoNum.length;저장위치++){
			int intR = rnd.nextInt(45) + 1;
			
			// lottoNum 배열에 intR과 같은값이 있는지 검사
			int 찾을위치 = 0 ;
			for(찾을위치 = 0 ; 찾을위치 < lottoNum.length ; 찾을위치++) {
				if(lottoNum[찾을위치] == intR) {
					break;
				}
			}
			
			// 값을 못찾았다.
			if(찾을위치 >= lottoNum.length) {
				// 생성한 intR을 
				// lottoNum[저장위치] 에 대입(저장)해도 된다
				lottoNum[저장위치] = intR;
				
			// 찾았다
			} else {
				// 번호(intR)를 다시 생성해서
				// lottoNum[저장위치]에 저장을 해야한다.
				저장위치 --;
			}
			
			// lottoNum[저장위치] = intR;
		}
		for(int i = 0 ; i < lottoNum.length;i++) {
			System.out.print(lottoNum[i] + "\t");
		}
		System.out.println();
		
		// 생성된 6개의 lottoNum을 순서대로 정렬
		for(int i = 0 ; i <lottoNum.length;i++) {
			for(int j = i + 1; j<lottoNum.length;j++) {
				if(lottoNum[i] > lottoNum[j]) {
					int _temp = lottoNum[i];
					lottoNum[i] = lottoNum[j];
					lottoNum[j] = _temp;
				}
			}
		}
		for(int i = 0 ; i < lottoNum.length;i++) {
			System.out.print(lottoNum[i] + "\t");
		}

		
	}

}
