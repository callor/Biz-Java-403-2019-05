package com.biz.coll.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_06 {

	public static void main(String[] args) {

		Random rnd = new Random();
		List<String> strList = new ArrayList<String>();
		
		String _st = "" ;
		for(int i = 0 ; i < 50 ; i++) {
			
			// 영문자 소문자 ASCII 코드 중 1개를 추출하라
			int intNum = rnd.nextInt(26) + 97;
			
			// 대문자 추출
			intNum = rnd.nextInt(26) + 65; 
			
			// 추출한 ASCII코드를 문자로 변경하라
			char charNum = (char)intNum;
			
			// 문자를 문자열로 변경하라
			String strAlpha = String.valueOf(charNum);
			
			// 생성된 문자열을 5개씩 묶어서
			// 임의의 단어로 만들고 리스트에 추가하라
			_st += strAlpha;
			if((i+1) % 5 == 0) {
				strList.add(_st);
				_st = "";
			}
		}
		
		for(String s : strList) {
			System.out.println(s);
		}
		
		
		
		
	}

}
