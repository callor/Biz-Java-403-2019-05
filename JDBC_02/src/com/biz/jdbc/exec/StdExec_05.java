package com.biz.jdbc.exec;

import com.biz.jdbc.model.StudentVO;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class StdExec_05 {

	public static void main(String[] args) {

		StdService ss = new StdServiceImp_01();
		String stNo = "101";
		
		StudentVO vo = ss.findByNum(stNo);
		
		if(vo == null) System.out.println("학생데이터 없음");
		else {
			System.out.println(vo.toString());
			
			vo.setSt_addr("대한민국 광주광역시");
			vo.setSt_nick("자바코딩");
			vo.setSt_nick_rem("자바 코딩은 즐거워");
			
			ss.update(vo);
			
		}
		
		
	}

}
