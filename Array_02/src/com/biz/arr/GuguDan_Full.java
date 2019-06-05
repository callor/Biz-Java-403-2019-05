package com.biz.arr;

public class GuguDan_Full {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10 ; i++) {
			System.out.print("구구단" + i + "단 \t");
		}
		System.out.println();
		
		for(int i = 2; i<10;i++) {
			System.out.print("==========\t");
		}
		System.out.println();
		
		for(int ele = 1; ele < 10 ;ele++) {
			for(int dan=2; dan < 10 ; dan++) {
				// System.out.printf("%2.1f x %d = %3d \t",(float)dan,ele,dan*ele);
				System.out.printf("%d x %d = %02d \t",dan,ele,dan*ele);
			}
			System.out.println();
		}

		for(int i = 2; i<10;i++) {
			System.out.print("==========\t");
		}

	}
}
