package com.biz.coll.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {

		/*
		 * 동일한 Set 자료구조로 선언된 strSetts 객체를
		 * 다른 생성자로 초기화를 하면
		 * 이전에 초기화된 객체는 삭제되고 새로운
		 * 객체로 변경된다.
		 */
		Set<String> strSetts = new HashSet<String>();
		strSetts = new LinkedHashSet<String>();
		strSetts = new TreeSet<String>();
		
		/*
		 * List형에서는 값을 추출할때 get(index) 메서를 사용해서
		 * 값을 읽을수 있었지만
		 * Set은 get(index) 메서드가 없다.
		 * Set 들 데이터중에 특정한 값이 있는지 확인하려면
		 * contains(값) 메서드를 사용한다.
		 */
		
		
	}

}
