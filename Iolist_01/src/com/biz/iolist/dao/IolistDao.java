package com.biz.iolist.dao;

import java.util.List;

import com.biz.iolist.model.IolistVO;

public interface IolistDao {
	
	public List<IolistVO> selectAll();
	public IolistVO findById(long io_seq);
	public int insert(IolistVO vo);
	public int update(IolistVO vo);
	public int delete(long io_seq);
	
}
