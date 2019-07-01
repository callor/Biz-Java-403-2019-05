package com.biz.mybatis.exec;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.biz.mybatis.config.DBConnection;
import com.biz.mybatis.dao.StudentDao;
import com.biz.mybatis.model.StudentVO;

public class StdEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlSessionFactory sf = DBConnection.getSqlSessionFactory();
		SqlSession sqlSession = sf.openSession(true);
		
		sqlSession = DBConnection
				.getSqlSessionFactory()
				.openSession(true);
		
		// sqlSession에 설정된
		// *DaoMapper를 추출
		StudentDao stdDao 
			= (StudentDao)sqlSession.getMapper(StudentDao.class);
		
		StudentVO vo = new StudentVO();
		vo.setSt_num("00011");
		vo.setSt_name("장영실");
		vo.setSt_tel("009");
		vo.setSt_grade(1);
		
		int ret = stdDao.insert(vo);
		if(ret >0) System.out.println("데이터 추가 성공");
		else System.out.println("데이터 추가 실패");

	}

}
