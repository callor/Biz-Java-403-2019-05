package com.biz.controller;

import com.biz.model.StudentVO;

public class StdExec_03 {

	public static void main(String[] args) {

		StudentVO[] stdList = new StudentVO[5];
		
		StudentVO sVO = new StudentVO("1","홍길동",3,"서울시","001");
		stdList[0] = sVO;
		
		stdList[1] = new StudentVO("2","성춘향",4,"남원","002");
		stdList[2] = new StudentVO("3","이몽룡",1,"서울시","003");
		stdList[3] = new StudentVO("4","임꺽정",2,"평양","004");
		stdList[4] = new StudentVO("5","장녹수",2,"한양","005");
		stdList[4] = new StudentVO("장녹수","5",2,"005","한양");
		
		
	}

}
