package com.biz.exp;

import java.util.ArrayList;
import java.util.List;

public class Exception_01 {

	public static void main(String[] args) {

		int[] nums = new int[3];
		String strKor = " 30 ";
		List<String> stList = new ArrayList<String>();
		String strName = null;
		
		try {

			// nums[3] = 10;
			// Integer.valueOf(strKor);
			// String s = stList.get(1).toString();
			
			System.out.println(strName.toString());
			
		} catch (ArrayIndexOutOfBoundsException ea) {
			System.out.println("배열 개수 초과");
		} catch (NumberFormatException en) {
			System.out.println("문자열을 숫자로 바꾸다가 오류");
		} catch (NullPointerException ep) {
			System.out.println("널 포인트 오류");
		} catch (Exception e) {
			System.out.println("시스템 오류");
		}
		
		System.out.println("반갑습니다");
		
		
		
	}

}
