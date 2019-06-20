package com.biz.exec.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.exec.model.PayMentVO;

public class PayService {

	List<PayMentVO> paperList;
	int intPayTotal;
	Scanner scan;

	public PayService() {
		paperList = new ArrayList<PayMentVO>();
		intPayTotal = 0;
		scan = new Scanner(System.in);
	}

	public void payCalce() {

		System.out.print("금여액>>");
		String strPay = scan.nextLine();

		int intPay = Integer.valueOf(strPay);
		intPayTotal = intPay; // Integer.valueOf(strPay);

		int intMoney = 50000;

		int sw = 1;
		while (intPay > 0) {
			PayMentVO vo = new PayMentVO();

			int intPaper = (int) (intPay / intMoney);

			vo.intMoney = intMoney;
			vo.paper = intPaper;
			paperList.add(vo);

			intPay -= (intPaper * intMoney);

			if (sw > 0)
				intMoney /= 5;
			else
				intMoney /= 2;
			sw *= (-1);
		}
	}

	public void printReport(String payReport) throws IOException {

		FileWriter fileWriter = new FileWriter(payReport);
		PrintWriter printWriter = new PrintWriter(fileWriter);

		printWriter.println("=============================");
		printWriter.println("총급여액 : " + this.intPayTotal);
		printWriter.println("-----------------------------");
		printWriter.println("액면가\t\t매수");
		printWriter.println("-----------------------------");
		for (PayMentVO vo : paperList) {
			printWriter.printf("%7d\t\t%3d\n", vo.intMoney, vo.paper);
		}
		printWriter.println("==============================");
		printWriter.flush();
		printWriter.close();

		System.out.println("급여명세서 파일 저장 완료!!!");

	}

}
