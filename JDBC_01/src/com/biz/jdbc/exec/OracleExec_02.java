package com.biz.jdbc.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.model.StudentVO;

public class OracleExec_02 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		String jdbcDriver 
			="oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "user4" ;
		String password = "1234" ;
		
		try {
			Class.forName(jdbcDriver);
			Connection con 
				= DriverManager.getConnection(url,userName,password);
			System.out.println("오라클 연결 성공!!!");
			
			PreparedStatement pStr = null;
			String sql = " SELECT * FROM tbl_student " ;
			pStr = con.prepareStatement(sql);

			ResultSet rs = pStr.executeQuery();
			
			while(rs.next()) {
				
				StudentVO vo = new StudentVO();
				vo.setSt_no(rs.getString(1));
				vo.setSt_name(rs.getString(2));
				vo.setSt_addr(rs.getString(3));
				vo.setSt_grade(rs.getInt(4));
				vo.setSt_height(rs.getInt(5));
				vo.setSt_weight(rs.getInt(6));
				vo.setSt_nick(rs.getString(7));
				vo.setSt_nick_rem(rs.getString(8));
				vo.setSt_dept_no(rs.getString(9));

				stdList.add(vo);
			}
			
			for(StudentVO vo : stdList) {
				System.out.println(vo);
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
