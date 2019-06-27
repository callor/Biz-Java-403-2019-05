package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.model.StudentVO;

/*
 * CRUD를 구현해보자
 * 1. DB Connection을 설정하기 
 * 	 실제 구현할 클래스에서 만들 부분
 * 
 * 2. SELECT를 구현해보기
 * 3. INSERT를 구현해보기
 * 4. UPDATE, DELETE 구현해 보기
 */
public interface StdService {
	
	// 전체 리스트를 가져올 method
	// DBMS에게 SELECT * FROM [table]을 실행하여
	// 전체 리스트를 가져오는 일을 수행할 예정
	// 가져온 리스트를 java의 List 자료구조로 변환시켜서
	// 요청한 곳에 return
	public List<StudentVO> selectAll();
	
	// 학번을 기준으로 한 학생의 정보를 가져올 method
	// 학번을 매개변수로 전달하고
	// 학번을 WHERE로 하여 SELECT를 수행한후
	// 한 학생의 정보를 가져와서 VO에 담아 
	// 요청한 곳에 return
	public StudentVO findByNum(String st_num);
	
	// 학생정보를 DB insert할 method
	// 추가(Create)하고자 하는 학생의 정보를
	// VO에 담아서 매개변수로 전달해 주고
	// INSERT를 수행하도록 한다.
	public void insert(StudentVO vo);
	
	// 학생정보를 수정(Update)할 method
	// 수정(UPDATE)를 수행할때는
	// 1. 학생정보(한사람의)를 조회하고 : VO에 받은 정보
	// 2. 수정할 칼럼(항목)이 있으면 그 칼럼의 값만 변경을 하고
	// 3. 나머지 값은 그대로 유지하여
	// 4. VO에 담겨 있는 값을 매개변수로 전달하여
	// 5. UPDATE 수행한다.
	public void update(StudentVO vo);
	
	// 학생정보를 삭제(Delete)할 method
	// 삭제할때는 학번하나만 매개변수로 전달하고
	// DELETE를 수행한다.
	public void delete(String st_num);
		

}
