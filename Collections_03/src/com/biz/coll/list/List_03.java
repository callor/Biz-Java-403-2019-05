package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class List_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		List<Integer> intList = new LinkedList<Integer>();
		
		for(int i = 0 ; i < 50 ; i++) {
			int intR = rnd.nextInt(50); // 0부터 49까지 임의 수 생성
			intList.add(intR); // 리스트에 추가
		}
		
		// intList에 30이 포함되어 있는지 확인
		int intLen = intList.size();
		for(int i = 0 ; i < intLen; i++) {
			if(intList.get(i) == 30) {
				System.out.println("찾았습니다");
			}
		}
		
		for(Integer i : intList) {
			if(i == 30) {
				System.out.println("찾았습니다");
			}
		}
		
	}

}





