package com.biz.mybatis.dao;

import java.util.List;

import com.biz.mybatis.model.ScoreVO;

public interface ScoreDao {

	public List<ScoreVO> selectAll();
	public ScoreVO findBySeq(long sc_seq);
	
	public List<ScoreVO> findByNum(String sc_st_num);
	
	public int insert(ScoreVO vo);
	public int update(ScoreVO vo);
	public int delete(long sc_seq);

}
