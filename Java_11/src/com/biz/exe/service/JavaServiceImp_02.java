package com.biz.exe.service;

public class JavaServiceImp_02 implements JavaService {

	@Override
	public void call() {
		System.out.println("나는 업그레드 된 Call이다");
	}

	@Override
	public void call(int num) {
		System.out.println(num + "를 매개변수로 받았다");
	}

	@Override
	public void call(int num1, int num2) {
		System.out.printf("%d + %d = %d \n",num1, num2, num1+num2);
	}

}
