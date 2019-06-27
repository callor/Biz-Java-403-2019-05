package com.biz.exec;

public class JavaService {

	private int sum;
	
	public JavaService() {
		sum = 0;
	}

	// return 이 필요 없는 method
	public void add() {
		
	}
	
	// 정수값(int형 값)을 return 해야하는 method
	public int add(int num) {
		
		return 0;
	}
	
	// 정수값(int형 값)을 return 해야하는 method
	// 매개변수로 받은 2개의 값을 덧셈해서
	// 일단 sum 변수에 저장을 하고
	// sum 변수를 return 했다.
	public int add(int num1, int num2) {
		sum = num1 + num2;
		
		// return이 하는일
		// sum 변수가 int 형으로 선언되어 있기 때문에
		// sum에 담겨있는 num1 + num2의 계산값을
		// return
		return sum;
	}
	
	
	
}
