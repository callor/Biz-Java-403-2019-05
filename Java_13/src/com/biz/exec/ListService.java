package com.biz.exec;

import java.util.ArrayList;
import java.util.List;

public class ListService {

	List<String> strList = null;
	
	public ListService() {
		// TODO Auto-generated constructor stub
		strList = new ArrayList<String>();
	}
	
	public void makeList() {
		
	}
	
	// return type이 class 형인경우
	// 오류가 나지 안으려면 최소한 null 값이라도
	// reuturn해 주어야 한다.
	public List<String> makeList(String str) {
		return null;
	}
	
	// return type이 class 인 method는
	// return 하는 내용이 무엇이든지 
	// 무조건 그들이 저장된 공간의
	// 주소를 return한다.
	public List<String> makeList(String str1, String str2) {
		strList.add(str1);
		strList.add(str2);
		
		return strList;
	}
	
	
}
