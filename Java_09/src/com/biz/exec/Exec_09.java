package com.biz.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.exec.model.StudentVO;

public class Exec_09 {

	public static void main(String[] args) {

		List<StudentVO> stdList = null;
		stdList = new ArrayList<StudentVO>();
		
		for(int i = 0 ; i < 10 ; i++) {
			StudentVO vo = null;
			vo = new StudentVO();
			stdList.add(vo);
		}
	}
}
