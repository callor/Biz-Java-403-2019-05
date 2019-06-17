package com.biz.grade.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Exec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			int intR = rnd.nextInt(10) + 1;
			
			int size = intList.size();
			int index = 0;
			
			//1. intList의 개수만큼 반복하면서
			for(index = 0 ; index < size ; index ++) {
				
				// 2. intList중에 intR값이 있는가 검사
				// 3. 만약 있으면 for 반복문을 중단
				// 4. for 반복문이 중단이되면
				//	  	index값은 size보다 항상 작다.
				if(intList.get(index) == intR) {
					break;
				}
			}
			
			// 5. for 가 끝나거나 중단되면
			// 6. index와 size값을 비교하여
			// 7. index >= size : 중간에 찾고자하는 값이 없다.
			// 8. index < size : 중간에 찾고자하는 값이 있다.
			// 9. 중간에 찾고자하는 값이 없으면
			// 10. List에 값을 추가하
			if(index >= size) {
				intList.add(intR);
			}
		}
		
		System.out.println("리스트 개수:" + intList.size());
		// 오름차순 정렬 실행
		Collections.sort(intList);
		for(Integer i : intList) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// 내림차순 정렬
		Collections.sort(intList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		
		for(Integer i : intList) {
			System.out.print(i + "\t");
		}
		
	}

}
