package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StdService ss = new StdServiceImp_01();
		
		while(true) {

			StudentVO vo = new StudentVO();
			System.out.print("학번>> ");
			vo.setSt_no(scan.nextLine());
			
			System.out.print("이름>> ");
			vo.setSt_name(scan.nextLine());
			
			System.out.print("학년>> ");
			vo.setSt_grade(Integer.valueOf(scan.nextLine()));
			
			System.out.print("학과>> ");
			vo.setSt_dept_name(scan.nextLine());
			
			System.out.println(vo);
			if( ss.insert(vo) > 0) System.out.println("추가완료");
			else System.out.println("추가 실패");
			
		}
	}
}
