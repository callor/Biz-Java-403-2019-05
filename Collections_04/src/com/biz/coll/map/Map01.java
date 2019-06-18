package com.biz.coll.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Map 자료구조를 pair structure 라고도 한다.
 * 키와 값의 구조로 이루어진 형태
 */
public class Map01 {

	public static void main(String[] args) {

		List<String> strList ;
		
		/*
		 * Map은 2개의 클래스가 쌍으로 포함되며
		 * 앞의 클래스는 키로 사용되고
		 * 뒤의 클래스는 값으로 사용된다.
		 */
		Map<Integer,String> strMap = new HashMap<Integer,String>();
		
		// 값을 저장할때는 put(키,값) 메서드를 사용하고
		strMap.put(1, "홍길동");
		strMap.put(2, "성춘향");
		strMap.put(3, "이몽룡");
		strMap.put(4, "장녹수");
		strMap.put(5, "임꺽정");
		
		// 값을 읽을때는 get(키) 메서드를 사용한다.
		System.out.println(strMap.get(3));
		
		// 전체 List를 for를 이용해서 보고자할때
		// 먼저 키값을 Set으로 추출하고
		// 키값 Set을 이용해서 값을 읽어야된다.
		Set<Integer> intKeys = strMap.keySet();
		
		for(int key : intKeys) {
			System.out.println(key + " : " + strMap.get(key));
		}
		
		
		

	}

}
