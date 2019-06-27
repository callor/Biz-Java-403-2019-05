package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_08 {

	/*
	 * 키보드에서 학번을 입력받고
	 * 해당하는 학번의 학생정보를 보여준 후
	 * 다시 키보드에서 주소를 입력받아서
	 * 학생정보를 Update 실행
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdService ss = new StdServiceImp_01();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("=========================");
			System.out.print("학번(종료:-E)>> ");
			String strNo = scan.nextLine();
			if(strNo.equals("-E")) break;
			
			StudentVO vo = ss.findByNum(strNo);
			
			if(vo == null) {
				System.out.println("학생정보 없음");
				continue;
			}

			System.out.println(vo);
			System.out.println("==========================");
				
			System.out.print("주소>>");
			String strAddr = scan.nextLine();
			
			// 주소를 입력하지 않으면 update 하지말고 처음으로 jump
			if(strAddr.isEmpty()) continue;
			
			vo.setSt_addr(strAddr);
			ss.update(vo);
		
		}
	}

}
