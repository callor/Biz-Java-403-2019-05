package com.biz.jdbc.exec;

import java.util.List;

import com.biz.jdbc.model.ScoreVO;
import com.biz.jdbc.service.ScoreService;
import com.biz.jdbc.service.ScoreServiceImp_01;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreService ss = new ScoreServiceImp_01();
		List<ScoreVO> sList = ss.selectAll();
		
		for(ScoreVO vo : sList) {
			System.out.println(vo);
		}
		
	}

}
