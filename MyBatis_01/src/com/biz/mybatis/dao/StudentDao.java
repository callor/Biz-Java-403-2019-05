package com.biz.mybatis.dao;

import java.util.List;

import com.biz.mybatis.model.StudentVO;

public interface StudentDao {

	public List<StudentVO> selectAll();
	public StudentVO findByNum(String st_num);
	
	public int insert(StudentVO vo);
	public int update(StudentVO vo);
	public int delete(String st_num);
	
}
