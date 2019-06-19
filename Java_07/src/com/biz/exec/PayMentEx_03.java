package com.biz.exec;

public class PayMentEx_03 {

	public static void main(String[] args) {

		// 총급여액
		int intPay = 3892840;
		
		// 대한민국 액면가 최고 가
		int intMoney = 50000;
		
		int sw = 1;
		while(intPay > 5) {
			
			// 매수계산
			int paper = (int)(intPay / intMoney);
			System.out.println(intMoney + "원권 : \t" + paper);
			
			// 액면가 * 매수만큼 제외
			intPay -= (paper * intMoney);

			if(sw > 0) intMoney = intMoney / 5;
			else intMoney = intMoney / 2;
			
			/*
			 * int 형 count 변수에 값을 계속 추가하면서
			 * 해당 값의 짝수, 홀수 여부를 판단하여
			 * 2가지중 한가지의 상태의 코드들을 수행할수 도 있다.
			 * 
			 * 하지만, 이 방법에서 만약 반복문이 상당히 많이 수행될 경우
			 * count 변수 값은 정수의 범위를 넘어가서
			 * overflow가 되고
			 * 코드가 오류를 내고 중단되어 버릴 수 있다.
			 * 
			 * 이럴때
			 * int sw 변수를 선언하고 초기값을 1이나 -1로 세팅해둔다
			 * 이후 sw 변수에 -1을 곱하는 코드를 수행하도록 하면
			 * sw 변수는 0보다 크거나 작은 2가지 상태 값을 갖게되어
			 * 위와 같은 코드를 실행하는 효과를 낼수 있다.
			 */
			sw = sw * (-1);
			
		}
	}
}



