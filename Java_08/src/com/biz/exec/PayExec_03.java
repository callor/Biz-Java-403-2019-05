package com.biz.exec;

import java.io.IOException;

import com.biz.exec.service.PayService;

public class PayExec_03 {

	public static void main(String[] args) {

		String payReport = "src/com/biz/exec/급여명세서.txt";
		PayService ps = new PayService();
		ps.payCalce();
		try {
			ps.printReport(payReport);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
