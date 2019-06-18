package com.biz.coll.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List2Set {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		
		strList.add("Korea");
		strList.add("KOREA");
		strList.add("대한민국");
		
		strList.add("Korea");
		strList.add("KOREA");
		strList.add("대한민국");
		
		System.out.println("List 값들");
		for(String s : strList) {
			System.out.println(s);
		}
		
		// List를 Set의 생성자 매개변수로 전달을 해주면
		// List를 Set 자료형으로 변환할수 있다.
		Set<String> strSetts = new HashSet<String>(strList);
		
		System.out.println("Set 값들");
		for(String s : strSetts) {
			System.out.println(s);
		}
		
		
		
		
	}

}
