package com.biz.exe.service;

/*
 * 클래스 생성
 * proto type 이라고도 한다.
 * proto type을 만든다 
 * 		= JavaService 라는 이름으로 class 파일을 만든다
 * 		= JavaService.java라는 파일을 만든다
 */
public class JavaServiceImp_01 implements JavaService {
	
	public void call() {
		System.out.println("Call 메서드 호출");
	}

	public void call(int num) {
		System.out.println("Call 메서드 호출");
		System.out.println("매개변수 num에 " + num + "를 받음");
	}
	
	public void call(int num1, int num2) {
		System.out.println("매개변수 2개 를 받음");
	}
	
	/*
	 * 프로그램(프로젝트, 애플리케이션)을 업그레이드 한다 라는 개념
	 * 1. 전혀 새로운 기능을 만들어서 누군가 사용하도록 하는것
	 * 2. 기존에 이미 만들어져 있는 기능을 성능등을 개선해서
	 * 		기존에 이미 사용하던 사람에게 다시 제공하는 것
	 * 
	 */
	
	

	
}
