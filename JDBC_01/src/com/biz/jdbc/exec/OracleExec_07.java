package com.biz.jdbc.exec;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;

public class OracleExec_07 {

	public static void main(String[] args) {

		StdService ss = new StdService();
		StudentVO vo = ss.findByNum("015");
		
		if(vo == null) System.out.println("조회한 데이터가 없음");
		else System.out.println(vo);
		
	}

}
