package com.biz.iolist.dao;

import java.util.List;

import com.biz.iolist.model.ProductVO;

public interface ProductDao {

	// DB의 5가지 CRUD를 정의
	public List<ProductVO> selectAll();
	public ProductVO findByCode(String p_code);
	public int insert(ProductVO vo) ;
	public int update(ProductVO vo) ;
	public int delete(String p_code);
	
}
