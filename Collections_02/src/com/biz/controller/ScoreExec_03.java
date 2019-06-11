package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 1번부터 순서대로 설정하고
		// 		이름은 입력하지 않고
		// kor, eng, math 점수를 각각 난수로 생성해서 저장
		//		단 점수는 51 ~ 100까지
		// 입력(저장된)값을 콘솔에서 확인하고
		// 총점과 평균 계산해 봅시다.
		
		ScoreVO[] sVOs = new ScoreVO[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < sVOs.length;i++) {
			sVOs[i] = new ScoreVO();

			// number 필드를 private으로 선언했기때문에
			// 다음 코드는 사용불가
			// sVOs[i].number = ?;
			
			// 때문에 number값을 저장할때 사용할 setter method를 만들었다
			
			// number필드는 String형인데 i 값은 int 형이다
			// sVOs[i].setNumber(i); // 오류 발생

			// 1. i 값은 0부터 시작하므로 +1을 실행해서
			//		1부터 시작하도록 설정 해줘야 한다
			// 2. 따라서 number필드에 값을 저장하기 위해서는
			// 		int 형을 String 형으로 변환을 시켜야 된다.
			// 기존의 자바 전통문법
			sVOs[i].setNumber(Integer.toString(i+1));
			
			// int형을 String으로 바꾸는 최근문법
			sVOs[i].setNumber("" + i + 1);
			// 하지만 이 코드는 모든 숫자를 문자화 한 후 
			// 연결하여 number값을 01, 11, 21, 31 형식으로 바뀌게 된다.
			
			// 따라서 먼저 i값에 +1을 실행서 숫자값으로 1 증가시킨후
			// 문자열로 바꾸야 한다.
			sVOs[i].setNumber(""+(i+1));
			
			// 3과목의 점수를 세팅
			// 1번방법
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			sVOs[i].setKor(intKor);
			sVOs[i].setEng(intEng);
			sVOs[i].setMath(intMath);

			// 2번방법
			sVOs[i].setKor(rnd.nextInt(50) + 51);
			sVOs[i].setEng(rnd.nextInt(50) + 51);
			sVOs[i].setMath(rnd.nextInt(50) + 51);
		
			// 1번방법으로 점수를 setting했을때 총점계산
			int intTotal = intKor + intEng + intMath;
			
			intTotal = intKor;
			intTotal += intEng;
			intTotal += intMath;
			
			// 2번방법으로 점수를 setting했을때 총점계산
			intTotal = sVOs[i].getKor();
			intTotal += sVOs[i].getEng();
			intTotal += sVOs[i].getMath();
			
			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal/3);
			
		}
		
		// 총점을 별도로 계산
		for(ScoreVO vo : sVOs) {
			
			int intKor = vo.getKor();
			int intEng = vo.getEng();
			int intMath = vo.getMath();
			int intTotal = intKor + intEng + intMath;
		}
		
		for(ScoreVO vo : sVOs) {
			System.out.println(vo.toString());
		}
		
		
		
		
	}

}
