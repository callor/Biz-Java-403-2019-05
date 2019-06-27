package com.biz.jdbc.exec;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdService ss = new StdServiceImp_01();
		
		StudentVO stdVO = new StudentVO();
		
		stdVO.setSt_no("101");
		stdVO.setSt_name("이몽룡");
		stdVO.setSt_grade(3);
		stdVO.setSt_dept_name("컴공과");
		
		ss.insert(stdVO);
		
		
	}

}
