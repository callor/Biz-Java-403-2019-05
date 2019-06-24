package com.biz.exec;

import com.biz.exec.service.AddService;

public class Exec_02 {

	public static void main(String[] args) {

		AddService as = new AddService();
		
		for(int i = 0 ; i < 10 ; i++) {
			as.add();
		}
		
		// i 값이 0부터 9까지 1씩 증가되면서
		// add(num1, num2) 메서드에 보내서
		// num2에 담기게 된다.
		for(int i = 0 ; i < 10 ; i++) {
			as.add(3,i);
		}
		
		// 4+0 ~ 4+9 까지 덧셈을 하도록
		// add(num1, num2) 메서드를 호출하고
		// return 한 값을 sum 변수에 누적시키고
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			sum += as.add(4,i);
			// sum = sum + as.add(4,i)
		}
		
		// sum변수 값을 console 보이기
		System.out.println("sum : " + sum);
		
		
		
	}

}
