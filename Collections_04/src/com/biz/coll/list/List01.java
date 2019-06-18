package com.biz.coll.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {

		// 선언과 동시에 초기화
		List<Integer> intArrayList1 = new ArrayList<Integer>();

		// 선언따로 초기화 따로
		List<Integer> intLinkedList2;
		intLinkedList2 = new LinkedList<Integer>();
		
		for(int i = 0 ; i < 100; i++) {
			intArrayList1.add(i);
			intLinkedList2.add(i);
		}
		
		// 컴퓨터의 현재 시각을 밀리세컨드 값을 알려주는
		// 시스템 클래스 메서드
		// 1970년 1월 1일 00:00:00:000부터 현재까지 흐른
		// 시각을 알려준다.
		// UNIX Time
		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++) {
			intArrayList1.add(20, 1000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Array List Add Time : " 
						+ (endTime - startTime));
				
		startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++) {
			intLinkedList2.add(20,1000);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Linked List Add Time : " 
				+ (endTime - startTime));
		
		
		
	}

}
