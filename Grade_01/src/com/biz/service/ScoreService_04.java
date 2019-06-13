package com.biz.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.model.ScoreVO;

public class ScoreService_04 implements ScoreService {

	List<ScoreVO> scList;
	
	public ScoreService_04() {
	
		scList = new ArrayList<ScoreVO>();
		scList = new LinkedList<ScoreVO>();
		scList = new Vector<ScoreVO>();
		
		
	}
	
	
	@Override
	public boolean inputScore(int number) throws NumberFormatException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void makeTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeRank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewScore() {
		// TODO Auto-generated method stub
		
	}


}
