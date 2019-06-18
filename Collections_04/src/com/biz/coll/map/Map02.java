package com.biz.coll.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map02 {

	public static void main(String[] args) {

		Map<String,String> addrMap 
				= new HashMap<String,String>();
		addrMap.put("홍길동","서울시");
		addrMap.put("성춘향","남원시");
		addrMap.put("이몽룡","서울시");
		addrMap.put("장녹수","한양");
		addrMap.put("임꺽정","평양");
		
		System.out.println(addrMap.get("홍길동"));
		
		Set<String> strKeys = addrMap.keySet();
		for(String key : strKeys) {
			System.out.println(key + " : " + addrMap.get(key));
		}
		
	}

}
