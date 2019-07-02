package com.biz.mybatis.util;

import java.util.Map;
import java.util.TreeMap;

public class Contract {

	public static Map<String,String> SUBList = null;
	
	static {
		SUBList = new TreeMap<String,String>();
		SUBList.put("1", "국어");
		SUBList.put("2", "영어");
		SUBList.put("3", "수학");
		SUBList.put("4", "과학");
		SUBList.put("5", "음악");
		SUBList.put("6", "미술");
		SUBList.put("7", "국사");
	}
}
