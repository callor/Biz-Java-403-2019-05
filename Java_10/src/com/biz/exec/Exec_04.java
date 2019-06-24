package com.biz.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exec_04 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
	
		for(int i = 0 ; i < 50 ; i++) {
			intList.add(rnd.nextInt(50) + 1);
		}
		
		int size = intList.size();
		for(int i = 0 ; i < size ; i++) {
			System.out.print(intList.get(i));
			if((i+1) % 5 == 0) System.out.println();
			else System.out.print("\t");
		}
		
		int myInt = 33;
		// intList로 부터 최초로 33값을 찾아서
		// 몇번째에 있는지 표시하고
		// 없으면 없다라고 표시
		size = intList.size();
		int index = 0;
		for(index = 0 ; index < size ; index++) {
			if(intList.get(index) == myInt) break;
		}
		
		if(index >= size) System.out.println("없음");
		else System.out.println(index + "번째에서 찾음");
		
	}

}
