package com.biz.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		strList.add("장녹수");
		strList.add("양귀비");
		
		Collections.shuffle(strList);
		
		for(String s : strList) {
			System.out.println(s);
		}
		
		
	}

}
