package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		StdService ss = new StdServiceImp_01();
		
		while(true) {
			System.out.println("조회할 학번을 입력하세요(종료:--END)");
			String strSearch = scan.nextLine();
			if(strSearch.equals("--END")) break;
			
			StudentVO stdVO = ss.findByNum(strSearch);

			System.out.println("조회한 학번 : " + strSearch);
			System.out.println("----------------------------");
			if(stdVO == null) {
				System.out.println("찾는 학생이 없음");
			}
			else {
				System.out.println(stdVO.toString());
			}
			System.out.println("=============================");
		}
		System.out.println("GAME OVER!!");

	}
}
