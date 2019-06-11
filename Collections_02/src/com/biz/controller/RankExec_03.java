package com.biz.controller;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		
		int[] intTotal = new int[10];
		
		Random rnd = new Random();
		for(int i = 0 ; i < intNum.length;i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
			intTotal[i] = intKor[i] + intEng[i] + intMath[i];
		}
		
		for(int i = 0 ; i < intTotal.length;i++) {
			for(int j = i + 1;j<intTotal.length;j++) {
				
				if(intTotal[i] > intTotal[j]) {
					
					int _total = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _total;

					int _number = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _number;

					int _intKor = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _intKor;
					
					int _intEng = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _intEng;
					
					int _intMath= intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _intMath;
					
				}
			}
		}
		
		System.out.println("=================================================");
		System.out.println("빅데이터반 성적표");
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점");
		System.out.println("-------------------------------------------------");
		
		int index = 0;
		for(int num : intNum) {
			System.out.print(num + "\t");
			System.out.print(intKor[index]+ "\t");
			System.out.print(intEng[index]+ "\t");
			System.out.print(intMath[index]+ "\t");
			System.out.print(intTotal[index++]+ "\n");
			
		}
		System.out.println("-------------------------------------------------");
		
		
		
		
		
		
		
	}

}
