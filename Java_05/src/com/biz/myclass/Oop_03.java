package com.biz.myclass;

public class Oop_03 {

	// java 프로젝트의 진입점 method라고 한다.
	// 프로젝트를 작성하고 실행을 했을때
	// 제일먼저 작동되는 명령어 세트이다.
	public static void main(String[] args) {

		// Oop_03과 PrimeClass가 같은 package내에 있으면
		// import하지 않아도
		// 사용할수 있다.
		PrimeClass pc = new PrimeClass();
		pc.prime();
		
		
	}

}
