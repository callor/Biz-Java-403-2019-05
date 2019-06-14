package com.biz.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exec_01 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 1; i <= 45 ;i++) {
			intList.add(i);
		}
		Collections.shuffle(intList);

		for(int i = 0 ; i < 6 ;i++) {
			System.out.print(intList.get(i) + "\t");
		}

	}

}
