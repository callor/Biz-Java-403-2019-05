package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.StudentVO;

public class StdExec_04 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		StudentVO sVO = new StudentVO("1","홍길동",3,"서울시","001");
		stdList.add(sVO);

		sVO = new StudentVO("2","성춘향",4,"남원","002");
		stdList.add(sVO);
		
		stdList.add( new StudentVO("3","이몽룡",1,"서울시","003") );
		stdList.add( new StudentVO("4","임꺽정",2,"평양","004") );
		stdList.add( new StudentVO("5","장녹수",2,"한양","005") );
		stdList.add( new StudentVO("장녹수","5",2,"005","한양") );
		
		
	}

}








