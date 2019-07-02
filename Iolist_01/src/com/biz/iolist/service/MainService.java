package com.biz.iolist.service;

import java.util.Scanner;

public class MainService {
	
	IolistService ioService = null;
	Scanner scan = null;
	
	public MainService() {
		
		ioService = new IolistService();
		scan = new Scanner(System.in);
	}
	
	public void start() {
		
		while(true) {
			ioService.viewIolist();
			
			System.out.println("=============================================");
			System.out.println("1.거래등록   2.거래수정   3.삭제   4.종료");
			System.out.println("---------------------------------------------");
			System.out.print("업무선택 >> ");
			String strMenu = scan.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			
			if(intMenu == 1) ioService.insertIO();
			if(intMenu == 2) ioService.updateIO();
			if(intMenu == 3) ioService.deleteIO();
			if(intMenu == 4) break ;
		}
	}
	
	
}
