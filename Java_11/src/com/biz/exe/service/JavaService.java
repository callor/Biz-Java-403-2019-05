package com.biz.exe.service;

/*
 * 인터페이스의 생성
 * 1. 기존에 이미 만들어진 JavaService 클래스를
 * 		JavaServiceImp_01로 일단 복사 해 둔다.
 * 2. JavaService 파일에 있는 모든 메서드의 구현코드를
 * 		모두 삭제하고
 * 3. 메서드의 원형(proto type, 모양)만 남겨둔다.
 * 		모든 메서드의 몸체를 제거
 * 4. class 키워드를 interface 키워드로 변경
 * 5. JavaServiceImp_01 클래스에서 implement 키워드를 사용하여
 * 		JavaService 인터페이스를 연결(implement)한다.
 * 
 * 이후에 작성되는 JavaService와 같은 기능을 하며
 * 성능이 업그레드되는 모든 클래스는
 * JavaService를 implement 하도록 한다.
 */
public interface JavaService {
	
	public void call()  ;
	public void call(int num) ;
	public void call(int num1, int num2) ;
	
	/*
	 * 프로그램(프로젝트, 애플리케이션)을 업그레이드 한다 라는 개념
	 * 1. 전혀 새로운 기능을 만들어서 누군가 사용하도록 하는것
	 * 2. 기존에 이미 만들어져 있는 기능을 성능등을 개선해서
	 * 		기존에 이미 사용하던 사람에게 다시 제공하는 것
	 * 
	 */
	
	

	
}
