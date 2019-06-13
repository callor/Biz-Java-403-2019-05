package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {

		/*
		 * ScoreVO를 이용해서 List를 생성하고
		 * 5명 학생의 국어, 영어, 수학 성적을
		 * 키보드로 입력받아 List에 추가하고
		 * 총점과 평균을 구하시오
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 5 ; i++) {
			
			System.out.print((i+1) + "번 학생 국어 점수>>");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.print((i+1) + "번 학생 영어 점수>>");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.print((i+1) + "번 학생 수학 점수>>");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);

			// 1번방법
			ScoreVO vo = new ScoreVO();
			vo.setNumber( "" + (i+1) );
			vo.setKor(intKor);
			vo.setEng(intEng);
			vo.setMath(intMath);
			// scList.add(vo);

			// 2번방법
			vo = new ScoreVO(""+(i+1),intKor,intEng,intMath);
			// scList.add(vo);
			
			// 3번방법
			scList.add(new ScoreVO("" + (i+1),intKor,intEng,intMath));
			System.out.println(scList.get(i).toString());
			
			// 총점계산
		}
		
		
		
		
		
		
	}
}
