package com.biz.iolist.service;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.iolist.config.DBConnection;
import com.biz.iolist.dao.IolistDao;
import com.biz.iolist.model.IolistVO;

public class IolistService {
	
	SqlSession sqlSession = null;
	IolistDao ioDao = null;
	
	public IolistService() {
		sqlSession = DBConnection.getSqlSessionFactory().openSession(true);
		ioDao = (IolistDao) sqlSession.getMapper(IolistDao.class);
	}
	
	public void viewIolist() {
		
		System.out.println("============================================================================");
		System.out.println("우리동네 제일마트 - 매입매출 리스트");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("거래일자\t거래처\t거래구분\t상품코드\t단가\t수량\t금액");
		System.out.println("----------------------------------------------------------------------------");
		List<IolistVO> iolist = ioDao.selectAll();
		for(IolistVO vo : iolist) {
			System.out.print(vo.getIo_date() + "\t");
			System.out.print(vo.getIo_ccode() + "\t");
			
			String inout = vo.getIo_inout();
			if(Integer.valueOf(inout) == 1) System.out.print("매입\t\t");
			else System.out.print("매출\t\t");
			
			System.out.print(vo.getIo_pcode() + "\t\t");
			
			System.out.printf("%5d\t",vo.getIo_price());
			System.out.printf("%5d\t",vo.getIo_qty());

			
			int intTotal = vo.getIo_total();
			
			// 숫자 표현할때 3자리마다 컴마구분기호 넣기
			DecimalFormat df = new DecimalFormat("#,###");
			String strTotal = df.format(intTotal);
			System.out.printf("%s\t",strTotal);
			
			String strTotal1 = String.format("%,d",intTotal);
			System.out.printf("%s\t",strTotal1);
			
			System.out.printf("%,d\n",intTotal);

		}
		System.out.println("----------------------------------------------------------------------------");
	}
}
