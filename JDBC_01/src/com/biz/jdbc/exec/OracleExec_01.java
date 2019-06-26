package com.biz.jdbc.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleExec_01 {

	/*
	 * 1. ojdbc6.jar를 프로젝트에 설치
	 * 2. tbl_student와 tbl_score 테이블 구조와 같은
	 * 		vo를 생성
	 * 3. 오라클 DBMS로부터 두 테이블에 담긴 값을 가져와서
	 * 		콘솔에 보여주는 코드를
	 * 
	 */
	public static void main(String[] args) {

		// 오라클에서 제공해주는
		// JDBC Driver 이름을 변수에 설정
		String jdbcDriver 
			="oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "user4" ;
		String password = "1234" ;
		
		try {
			// Driver를 사용할수 있도록
			// java에게 준비해달라고 요청을 해야 한다.
			Class.forName(jdbcDriver);

			// java(JVM) 입장에서 외부장치(DBMS)와
			// 연결하는 통로가 여러개 존재하면
			// 어떤 통로를 통해서 데이터를 주고 받아야 할지
			// 상당히 불편할 것이다.
			// 그래서 java DriverManager한테
			// DBMS 데이터를 주고받을 통로를 하나만 만들고
			// 그 정보를 달라 하고 요청
			// 그리고 그 정보를 con 이라는 객체 변수에 담아놓는다.
			// Connection con = new Connection();
			Connection con 
				= DriverManager.getConnection(url,userName,password);
			// 여기까지 실행 됬으면
			// 오라클과 연결할 통로가 설정(생성)되었다라고 볼수 있다.
			System.out.println("오라클 연결 성공!!!");
			
			// 오라클에게 명령을 보내기
			// 표준 JDBC 명령
			
			// JDBC통해서 SQL을 전달할때 사용할 클래스
			PreparedStatement pStr = null;
			
			String sql = " SELECT * FROM tbl_student " ;
			
			// sql 문자열을 오라클 고유의 명령으로 변환시켜놔라
			pStr = con.prepareStatement(sql);

			// 오라클에게 명령을 보내고
			// 그결과를 나에게 달라
			ResultSet rs = pStr.executeQuery();
			
			while(rs.next()) {
				String strNum = rs.getString(1);
				String strName = rs.getString(2);
				System.out.println(strNum + " : " + strName);
			}
			

		} catch (ClassNotFoundException e) {

			// JDBC Driver Class가 어떤 이유로 사라졌을경우
			// e.printStackTrace();
			System.out.println("JDBC Driver 실행 오류");
			
		} catch (SQLException e) {
			// DriverManager가 OJDBC를 통해서
			// 오라클에서 연결신호를 보냈는데..
			// 어떤이유인지 연결이 불가능할때 
			// e.printStackTrace();
			System.out.println("오라클에 연결할수 없음");
		}
		
		

	}

}
