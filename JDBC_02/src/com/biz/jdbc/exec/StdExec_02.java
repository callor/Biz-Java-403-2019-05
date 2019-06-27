package com.biz.jdbc.exec;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdService ss = new StdServiceImp_01();
		StudentVO stdVO = ss.findByNum("020");
		
		if(stdVO == null) System.out.println("찾는 학생이 없음");
		else System.out.println(stdVO.toString());

	}
}
