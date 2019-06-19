package com.biz.exec;

import com.biz.service.LeapYearService;

public class Exec_04 {

	public static void main(String[] args) {

		LeapYearService lys = new LeapYearService();
		String leapFile = "src/com/biz/exec/leapYearListFile.txt";
		
		lys.makeLeapYearList(1900, 3000);
		lys.writeLeapYearListFile(leapFile);
		
	}

}
