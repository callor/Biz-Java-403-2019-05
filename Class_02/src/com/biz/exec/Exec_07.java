package com.biz.exec;

import com.biz.model.BookVO;

public class Exec_07 {

	public static void main(String[] args) {

		BookVO bVO = new BookVO();
		
		bVO.setTitle("이것이 자바다");
		bVO.setAuth("신용권");
		bVO.setComp("한빛미디어");
		bVO.setPrice(30000);
		
		System.out.println(bVO.toString());
		
	}

}
