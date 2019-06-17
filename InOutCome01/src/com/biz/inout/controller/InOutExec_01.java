package com.biz.inout.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.inout.service.InOutService_01;

public class InOutExec_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/inout/매입매출.txt";
		InOutService_01 ioService ;
		
		try {
			ioService = new InOutService_01(fileName);
			ioService.readFile();
			ioService.calcIolist();
			ioService.listView();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
