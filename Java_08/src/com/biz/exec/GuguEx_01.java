package com.biz.exec;

public class GuguEx_01 {

	public static void main(String[] args) {

		System.out.println("구구단");

		for(int j = 2 ; j <=9 ;j++) {
			System.out.print("===============");	
		}
		System.out.println();
		for(int j = 2 ; j <=9 ;j++) {
			System.out.printf("%3d단\t\t",j);
		}
		System.out.println();
		for(int j = 2 ; j <=9 ;j++) {
			System.out.print("---------------");
		}
		System.out.println();

		for(int j = 2 ; j <= 9 ;j++) {
			for(int i = 2 ; i <= 9 ;i++) {
				System.out.printf("%3d x %3d = %3d\t",i,j,j*i);
			}
			System.out.println();
		}
	}

}
