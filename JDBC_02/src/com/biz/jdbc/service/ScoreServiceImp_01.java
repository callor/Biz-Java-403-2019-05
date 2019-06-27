package com.biz.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.config.DbConnection;
import com.biz.jdbc.model.ScoreVO;

/*
 * DBConnection 설정
 */
public class ScoreServiceImp_01 implements ScoreService {
	
	List<ScoreVO> scList = null;
	Connection dbConn = null;
	
//	private String jdbcDriver 
//		= "oracle.jdbc.driver.OracleDriver";
//
//	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	private String userName = "user5" ;
//	private String password = "1234" ;
	
	public ScoreServiceImp_01() {
		this.dbConn = DbConnection.getDBConnection();
	}
	
//	private void dbConnection() {
//		try {
//			//1. jdbcDriver ON load 시키기
//			Class.forName(jdbcDriver);
//			
//			//2. 연결 통로(port)를 설정하기
//			dbConn = DriverManager.getConnection(url,userName,password);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	/*
	 * tbl_score 테이블의 모든 데이터를 selec 한 후
	 * List로 변환하여 return
	 */
	@Override
	public List<ScoreVO> selectAll() {
		// TODO 여기는 전체 성적데이터를 SELEC해서 List로 리턴하는 메서드
		String sql = " SELECT * FROM tbl_score ";
		PreparedStatement ps = null;
		
		try {
			ps = this.dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			scList = new ArrayList<ScoreVO>();
			while(rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setSc_seq(rs.getLong("sc_seq"));
				vo.setSc_date(rs.getString("sc_date"));
				vo.setSc_st_no(rs.getString("sc_st_no"));
				vo.setSc_score(rs.getInt("sc_score"));
				scList.add(vo);
			}
			return scList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ScoreVO findById(long sc_seq) {
		// TODO 여기는 일련번호 값을 매개변수 받아 성적데이터 1개의 레코드를 리턴
		String sql = " SELECT * FROM tbl_score ";
		sql += " WHERE sc_seq = " + sc_seq ;
		
		PreparedStatement ps = null;
		try {
			ps = this.dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			scList = new ArrayList<ScoreVO>();
			if(rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setSc_seq(rs.getLong("sc_seq"));
				vo.setSc_date(rs.getString("sc_date"));
				vo.setSc_st_no(rs.getString("sc_st_no"));
				vo.setSc_score(rs.getInt("sc_score"));

				return vo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(ScoreVO vo) {
		// TODO 여기는 데이터 추가
		String sql = " INSERT INTO tbl_score ( ";
		sql += " SC_SEQ, " ; 
		sql += " SC_DATE, " ;
		sql += " SC_ST_NO, " ;
		sql += " SC_SUBJECT, " ;
		sql += " SC_SCORE ) " ;
		sql += " VALUES( SEQ_SCORE.NEXTVAL ,?,?,?,? ) "; 
				
		return 0;
	}

	@Override
	public int update(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long sc_seq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ScoreVO> findByNum(String st_no) {
		// TODO Auto-generated method stub
		String sql = " SELECT * FROM tbl_score ";
		sql += " WHERE sc_st_no = " + st_no;
		
		PreparedStatement ps = null;
		
		try {
			ps = this.dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			scList = new ArrayList<ScoreVO>();
			while(rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setSc_seq(rs.getLong("sc_seq"));
				vo.setSc_date(rs.getString("sc_date"));
				vo.setSc_st_no(rs.getString("sc_st_no"));
				vo.setSc_score(rs.getInt("sc_score"));
				scList.add(vo);
			}
			return scList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}


}
