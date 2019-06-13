package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_08 {

	public static void main(String[] args) {

		/*
		 * 학생의 성적을 입력받는 동안에
		 * 실수로 점수를 잘못입력받으면
		 * (숫자에 문자가 포함되는경우)
		 * Exception이 발생하는데
		 * Exp 발생하면 다시 학생의 점수를 입력받로록 처리
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 5 ; i++) {

			/*
			 * 3과목의 점수를 담을 int 형변수를
			 * try 문 실행전에 선언을 해준다.
			 * 
			 * try문이 끝난다음에 3과목의 점수를
			 * scList에 담아야 하는데
			 * try문 내에서 선언이되면 접근이 불가능하기 때문
			 */
			int intKor = 0;
			int intEng = 0;
			int intMath = 0;
			
			try {
				
				System.out.print((i+1) + "번 학생 국어 점수>>");
				String strKor = scan.nextLine();
				intKor = Integer.valueOf(strKor);

				System.out.print((i+1) + "번 학생 영어 점수>>");
				String strEng = scan.nextLine();
				intEng = Integer.valueOf(strEng);

				System.out.print((i+1) + "번 학생 수학 점수>>");
				String strMath = scan.nextLine();
				intMath = Integer.valueOf(strMath);
				
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println((i+1) + "번 학생 점수 입력 오류!!");
				System.out.println((i+1) + "번 학생 점수를 다시 입력 !!");
				i--;
				
				/*
				 * for나 while 반복문내에서 사용할수 있으며
				 * continue를 만나면 이후에 있는 모든 코드는 무시하고
				 * for나 while 문의 시작점으로 점프한다.
				 * break는 반복문을 종료
				 * continue는 반복문을 계속 실행
				 */
				continue;
			
			}
			
			scList.add(new ScoreVO("" + (i+1),intKor,intEng,intMath));
			System.out.println(scList.get(i).toString());
			
		}
		
		// 총점계산
		int scLen = scList.size();
		for(int i = 0 ; i < scLen ; i++) {
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
		}
		
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		
		
		
		
		
		
	}
}
