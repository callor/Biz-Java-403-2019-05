package com.biz.exec;

import com.biz.exec.model.StudentVO;

public class Exec_08 {

	public static void main(String[] args) {

		StudentVO[] stdList = new StudentVO[10];
		
		stdList[0] = new StudentVO();
		stdList[1] = new StudentVO();
		for(int i = 0 ; i< stdList.length;i++) {
			stdList[i] = new StudentVO();
		}
		
		stdList[0].number = "001";
		stdList[0].name = "홍길동";
		
		stdList[1].number = "002";
		stdList[1].name = "성춘향";

		stdList[2].number = "003";
		stdList[2].name = "이몽룡";

		System.out.println("2번 학생이름:" + stdList[2].name);
		System.out.println("2번 학번:" + stdList[2].number);
		
	}
}
