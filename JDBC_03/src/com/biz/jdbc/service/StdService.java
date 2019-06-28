package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.model.StudentVO;

public interface StdService {

	// CRUD 를 위한 메서드 선언
	public List<StudentVO> selecAll();
	
	// select 실행해서 데이터를 조회할때
	// 분명히 1개의 데이터만 조회 될것이다
	// 라고하면 return type 으로 vo 를 사용
	public StudentVO findByNum(String stNo);
	
	// 확율적으로 대부분 1개의 데이터가 조회 될 것이지만
	// 어쩌다 한번이라도 1개 이상의 데이터가 조회 될 것 같다
	// 라고하면 return type은 무조건 List를 사용
	public List<StudentVO> findByName(String stName);
	
	public int insert(StudentVO vo);
	public int update(StudentVO vo);
	public int delete(String stNo);
	
	public String makeStNum() ;
	
}
