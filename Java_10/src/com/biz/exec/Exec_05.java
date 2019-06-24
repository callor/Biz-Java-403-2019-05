package com.biz.exec;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Exec_05 {

	public static void main(String[] args) {
		Map<Integer,Integer> intMap 
			= new TreeMap<Integer,Integer>();
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 50 ; i++) {
			int intR = rnd.nextInt(50) + 1;
			intMap.put(intR, intR);
		}
		int myInt = 23;
		
		Integer sInt = intMap.get(myInt);
		if(sInt == null) System.out.println("없음");
		else System.out.println("찾았음");
		
	}

}
