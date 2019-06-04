package com.biz.exec;

public class Exec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10]; // 학번
		String[] strName = new String[10]; // 이름
		
		int[] intKor = new int[10]; // 국어
		int[] intEng = new int[10]; // 영어
		int[] intMath = new int[10]; // 수학

		intNum[0] = 1;
		strName[0] = "홍길동";
		
		intKor[0] = 90;
		intEng[0] = 70;
		intMath[0] = 70;

		intNum[1] = 2;
		strName[1] = "이몽룡";
		
		intKor[1] = 80;
		intEng[1] = 80;
		intMath[1] = 90;

		intNum[2] = 3;
		strName[2] = "성춘향";
		
		intKor[2] = 77;
		intEng[1] = 88;
		intMath[2] = 98;
		
		
		intNum[3] = 4;
		strName[3] = "임꺽정";
		
		intKor[3] = 90;
		intEng[0] = 70;
		intMath[3] = 70;

		System.out.println("====================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		for(int i = 0 ; i < 3;i++) {
			
			int intSum = intKor[i];
			intSum += intEng[i];
			intSum += intMath[i];
			
			intSum = intKor[i] + intEng[i] + intMath[i];
			
			float fAvg = intSum / 3.0f;
						
			System.out.print(intNum[i]+"\t");
			System.out.print(strName[i]+"\t");
			
			System.out.print(intKor[i]+"\t");
			System.out.print(intEng[i]+"\t");
			System.out.print(intMath[i]+"\t");
			
			System.out.print(intSum + "\t");
			System.out.print(fAvg+ "\t");
			System.out.println();
		}
		System.out.println("====================================================");
		
		//이름	국어	수학	총점	
		

	}

}
