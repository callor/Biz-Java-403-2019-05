package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.model.DeckVO;

// 카드정보를 생성하고
// 게임을 진행하는데 필요한 클래스
public class BlackJackService {
	
	private List<DeckVO> deckList;
	private String suit = "다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)";
	private String denomiation = "A234567890KQJ";
	
	public BlackJackService() {
		deckList = new ArrayList();
	}
	
	public List<DeckVO> getDeck() {
		for(int i = 0 ; i < 50 ; i++) {
			Collections.shuffle(deckList);	
		}
		return deckList;
	}
	
	public void makeDeck() {
		
		String[] suits = suit.split(":");
		String[] denominations = denomiation.split(""); 
		
		for(String s : suits) {
			for(String d : denominations) {
				
				DeckVO vo = new DeckVO();
				vo.setSuit(s);
				vo.setDenomination(d);
				
				int intValue = 0;
				
				try {
					intValue = Integer.valueOf(d);	
					if(intValue == 0) intValue = 10;
				} catch (Exception e) {
					if(d.equals("A")) {
						intValue = 1;
					} else {
						intValue = 10;
					}
				}

				vo.setValue(intValue);
				deckList.add(vo);
				
			}
		}

		
	}
	
	// 테스트코드
	public void viewCardList() {
		
		for(DeckVO vo : deckList) {
			System.out.println(vo.toString());
		}
		System.out.println("===============");
		System.out.println("카드매수:" + deckList.size());
		
	}

}





