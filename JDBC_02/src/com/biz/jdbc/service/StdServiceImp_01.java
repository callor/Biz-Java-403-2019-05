package com.biz.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import com.biz.jdbc.model.StudentVO;

/*
 * StdService interface(설계도)에 기반한
 * 실제 클래스를 구현
 * 1. DB Connection을 설정
 * 
 */
public class StdServiceImp_01 implements StdService {

	private List<StudentVO> stdList = null;
	
	private Connection dbConn = null;
	private String jdbcDriver 
		= "oracle.jdbc.driver.OracleDriver";
	
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String userName = "user5" ;
	private String password = "1234" ;
	
	public StdServiceImp_01() {
		// 데이터 리스트를 만들어서 외부로 전달하기 위해 사용하는
		// stdList를 생성자에서 초기화를 하고 계속 사용을 하면
		// selectAll() 실행할때마다 리스트가 계속 쌓이게 된다.
		// 리스트를 초기화 하는 코드는
		// 리스트를 만들기 직전에 위치 해야 한다.
		// stdList = new ArrayList<StudentVO>();
		this.dbConnection();
	}
	
	// dbConnection은 외부에서 실행하지 못하도록 private으로 선언한다.
	// dbConnection이 자주 실행되는 것은 Driver를 계속 On Load시키고
	// 통로를 새로 설정하는 과정이 반복되어 문제를 일으킬 수 있기 때문이다.
	private void dbConnection() {
		try {
			//1. jdbcDriver ON load 시키기
			Class.forName(jdbcDriver);
			
			//2. 연결 통로(port)를 설정하기
			dbConn = DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Override
	public List<StudentVO> selectAll() {
		// TODO 여기는 전체 리스트를 select하는 메서드이다
		String sql = " SELECT * FROM tbl_student ";
		
		// String으로 된 sql 문장을 DBMS방식의 코드로 변환하여
		// DBMS에게 전달하는 역할을 수행한다.
		PreparedStatement pStr = null;
		
		try {
			// sql문을 DBMS 코드로 변환(컴파일)하여 잠시 보관중
			pStr = this.dbConn.prepareStatement(sql);
			
			// query를 실행하고
			// DBMS 보낸 결과를 ResultSet 데이터 구조로 바꾸어
			// return을 한다.
			
			// ResultSet 구조의 객체를 선언하여 데이터를 수신한다.
			ResultSet rs = pStr.executeQuery();
			
			/*
			 * ResultSet : DBMS가 보낸 데이터를 배열형태로 보관을하고
			 * next() 메서드를 실행하면 한줄씩 데이터를 읽어 온다
			 * 단, 읽는 방향은 일방통행이다. 
			 * 처음부터 ~ 끝방향으로
			 */
			// if(rs.next()) System.out.println("데이터가 있다");
			// else System.out.println("데이터 없다");
			
			
			stdList = new ArrayList<StudentVO>();
			while(rs.next()) {
				StudentVO vo = new StudentVO();

				// old 코드
				vo.setSt_no(rs.getString(1));
				vo.setSt_name(rs.getString(2));
				vo.setSt_addr(rs.getString(3));
				vo.setSt_grade(rs.getInt(4));
				vo.setSt_height(rs.getInt(5));
				vo.setSt_weight(rs.getInt(6));
				vo.setSt_nick(rs.getString(7));
				vo.setSt_nick_rem(rs.getString(8));
				vo.setSt_dept_name(rs.getString(9));
				
				// new 코드
				vo.setSt_no(rs.getString("st_no"));
				vo.setSt_name(rs.getString("st_name"));
				vo.setSt_addr(rs.getString("st_addr"));
				vo.setSt_grade(rs.getInt("st_grade"));
				vo.setSt_height(rs.getInt("st_height"));
				vo.setSt_weight(rs.getInt("st_weight"));
				vo.setSt_nick(rs.getString("st_nick"));
				vo.setSt_nick_rem(rs.getString("st_nick_rem"));
				vo.setSt_dept_name(rs.getString("st_dept_name"));

				stdList.add(vo);
			}
			return stdList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return null;
	}

	@Override
	public StudentVO findByNum(String st_num) {
		// TODO 학번을 매개변수로 받아 한 학생의 정보를 리턴하는 메서드
		
		// sql문을 작성할때 
		// 따옴표가 시작되는곳과 끝나는 곳에 스페이스 필수!!!
		String sql = " SELECT * FROM tbl_student ";
		sql += " WHERE st_no = " + st_num;
		
		PreparedStatement ps = null;
		
		try {
			ps = dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setSt_no(rs.getString("st_no"));
				vo.setSt_name(rs.getString("st_name"));
				vo.setSt_addr(rs.getString("st_addr"));
				vo.setSt_grade(rs.getInt("st_grade"));
				vo.setSt_height(rs.getInt("st_height"));
				vo.setSt_weight(rs.getInt("st_weight"));
				vo.setSt_nick(rs.getString("st_nick"));
				vo.setSt_nick_rem(rs.getString("st_nick_rem"));
				vo.setSt_dept_name(rs.getString("st_dept_name"));
				return vo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(StudentVO vo) {
		// TODO 학생정보를 vo에 받아 db에 insert 수행
		String sql = " INSERT INTO tbl_student ( ";
		sql += " ST_NO, "; 		// 1
		sql += " ST_NAME, "; 	// 2
		sql += " ST_ADDR, ";	// 3
		sql += " ST_GRADE, ";	// 4
		sql += " ST_HEIGHT, ";	// 5
		sql += " ST_WEIGHT, ";	// 6
		sql += " ST_NICK, ";	// 7
		sql += " ST_NICK_REM, ";	// 8
		sql += " ST_DEPT_NAME ) ";	// 9
		sql += " VALUES(?,?,?,?,?,?,?,?,?) ";
		
		PreparedStatement ps = null;
		
		try {
			ps = this.dbConn.prepareStatement(sql);
			ps.setString(1,vo.getSt_no());
			ps.setString(2,vo.getSt_name());
			ps.setString(3,vo.getSt_addr());
			ps.setInt(4,vo.getSt_grade());
			ps.setInt(5,vo.getSt_height());
			ps.setInt(6,vo.getSt_weight());
			ps.setString(7,vo.getSt_nick());
			ps.setString(8,vo.getSt_nick_rem());
			ps.setString(9,vo.getSt_dept_name());
			
			ps.executeUpdate();
			System.out.println("데이터 추가 성공!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(StudentVO vo) {
		// TODO vo에 값을 받아서 기존 데이터를 업데이트 수행
		String sql = " UPDATE tbl_student SET ";
		sql += " ST_NAME = ?, ";  	// 1
		sql += " ST_ADDR = ?, ";	// 2
		sql += " ST_GRADE = ?, ";	// 3
		sql += " ST_HEIGHT = ?, ";	// 4
		sql += " ST_WEIGHT = ?, ";	// 5
		sql += " ST_NICK = ?, ";	//6
		sql += " ST_NICK_REM = ?, ";	//7
		sql += " ST_DEPT_NAME = ? ";	//8
		sql += " WHERE ST_NO = ? ";	//9
		
		PreparedStatement ps = null;
		
		try {
			ps = this.dbConn.prepareStatement(sql);
			ps.setString(9,vo.getSt_no());
			
			ps.setString(1,vo.getSt_name());
			ps.setString(2,vo.getSt_addr());
			ps.setInt(3,vo.getSt_grade());
			ps.setInt(4,vo.getSt_height());
			ps.setInt(5,vo.getSt_weight());
			ps.setString(6,vo.getSt_nick());
			ps.setString(7,vo.getSt_nick_rem());
			ps.setString(8,vo.getSt_dept_name());
			
			ps.executeUpdate();
			
			System.out.println("업데이트 성공");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(String st_num) {
		// TODO 여기는 한개의 레코드(데어터)를 삭제하는 메서드 이다
		
		String sql = " DELETE FROM tbl_student ";
		sql += " WHERE st_no = " + st_num ;
		
		PreparedStatement ps = null;
		
		try {
			ps = this.dbConn.prepareStatement(sql);
			int ret = ps.executeUpdate();
			
			// 삭제가 정상적으로 이루어 졌는지 알아보는 방법으로
			// 아래 2가지 코드가 있지만
			// DBMS 서버와 통신(데이터 주고받기)하는 과정에서
			// 레코드 정상적으로 삭제되면 반드시 0이상의 값을
			// return 해서 ret값에 담아 주지만
			
			// 레코드 삭제가 이루어지지 않아았을 경우
			// 정말 삭제할 레코드가 없는경우도 있고
			// 이경우는 0을 return할 것이다.
			
			// 하지만
			// 어떤이유로 레코드가 있음에도 삭제가 이루어지지 않았을경우
			// 0 미만의 값을 return하는 경우도 있다.
			// 이런 경우 2번의 방법에서는
			// 정상적으로 삭제가 이우러졌다는 메시지를 보이게 된다.
			
			// 따라서 1번 방법이 안전한 코드 작성 법이다.
			
			// 1번 검증 방법
			if(ret > 0) System.out.println(ret + "레코드 삭제 성공");
			else System.out.println("삭제할 데이터가 없음!!");
			
			// 2번 검증 방법
			if(ret == 0) System.out.println("삭제할 데이터가 없음");
			else System.out.println(ret + "레코드 삭제 성공");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	} // end delete
	
	public String makeStNo() {
		
		String sql = " SELECT LPAD(MAX(st_no) + 1,3,'0') "; 
		sql += " FROM tbl_student " ;
		
		PreparedStatement ps = null;
		try {
			ps = this.dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String strNum = rs.getString(1);
				return strNum;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
		
	}

}
