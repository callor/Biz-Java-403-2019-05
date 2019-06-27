package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.model.ScoreVO;

public interface ScoreService {

	public List<ScoreVO> selectAll();
	public ScoreVO findById(long sc_seq);
	
	public List<ScoreVO> findByNum(String st_no);
	
	public int insert(ScoreVO vo);
	public int update(ScoreVO vo);
	public int delete(long sc_seq);
	
}
