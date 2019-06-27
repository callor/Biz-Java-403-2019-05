package com.biz.exec;

import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListService ls = new ListService();
		
		ls.makeList();
		List<String> s = ls.makeList("대한민국");
		System.out.println(s);
		
		List<String> strList = ls.makeList("대한민국","Korea");
		for(String s1 : strList) {
			System.out.println(s1);
		}
		
		List<String> sList 
			= ls.makeList("Republic Of Kore","광주광역시");
		System.out.println("===================");
		for(String s2 : sList) {
			System.out.println(s2);
		}
		
		// 이전에 strList 변수에 return 값을 받았는데
		// 그 후(return받은 후에) ListService에 있는
		// List 변수에 String을 추가 했더니
		// strList 변수에 또다시 return 값을 받지 않아도
		// 변경된 내용을 확인할수 있었다.
		// 그 이유는 strList 변수에 받은 내용이
		// 주소이기 때문이다.
		System.out.println("====================");
		for(String s3 : strList) {
			System.out.println(s3);
		}
	}

}
