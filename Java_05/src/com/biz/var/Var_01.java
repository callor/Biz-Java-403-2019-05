package com.biz.var;

public class Var_01 {

	public static void main(String[] args) {

		/*
		 * int 형과 float형은 똑같이 4byte(32bit)크기의 
		 * 기억공간을 차지하도록 설계가 되어 있는데.
		 * float은 int형보다 훨씬 큰 값을 저장할수 있다.
		 * 
		 * int형의 값은 float형 값에 얼마든지 대입할수 있다.
		 * float형의 값은 int형 값에 대입할수 없다.
		 */
		
		int intNum1 = 30; // 정수형
		float fNum1 = 30.0f; // 실수형
		
		fNum1 = intNum1; // int형 변수에 담긴 값을 float형 변수에 대입
		intNum1 = (int)fNum1; // float형 변수에 담긴 값을 int형 변수에 담을 수 없다.
		
		/*
		 * 변수의 형변환
		 * 
		 * int형 변수에 담긴 값을 float형에 담으려 하면
		 * 자동으로 소수점이하에 값이 추가되어 float형으로 변환
		 * 
		 * float형 변수에 담긴 값을 int형에 담으려 하면
		 * 컴파일러는 개발자가 실수한 것이라고 생각한다.
		 * 그래서 문법 오류가 발생한다.
		 * 
		 * 만약 개발자가 float형에 담긴 값을
		 * 소수점 이하를 무조건 잘라버리고
		 * int형에 담겠다라고 선언할 수 있는데
		 * 이런 상황을 강제 형변환이라고 한다.
		 */
		fNum1 = intNum1 ; // 자동 형변환
		intNum1 = (int)fNum1 ; // 강제 형변환
		
		
	}

}
