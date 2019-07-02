package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;

public class IoEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IolistService ioService = new IolistService();
		
		while(true) {
			
			ioService.viewIolist();
			
			if(ioService.insertIO()) System.out.println("데이터 추가성공");
			else System.out.println("데이터 추가 실패");
			
		}
	}
}
