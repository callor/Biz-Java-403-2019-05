package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.model.BankBalanceVO;

public class BankService {

	/*
	 * balance.txt 파일을 읽어서
	 * 계좌정보를 balanceList에 추가하는 메서드를 작성
	 */
	List<BankBalanceVO> balanceList ;
	FileReader fileReader;
	BufferedReader buffer;
	Scanner scan ;
	
	public BankService(String fileName) throws FileNotFoundException {
		balanceList = new ArrayList<BankBalanceVO>();
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		scan = new Scanner(System.in);
	}
	
	public void readBalance() throws IOException {

		String reader = "";
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			String[] banks = reader.split(":");

			BankBalanceVO vo 
				= new BankBalanceVO(banks[0],
						Integer.valueOf(banks[1]),
						banks[2]);
			
			vo.setAcc(banks[0]);
			vo.setBalance(Integer.valueOf(banks[1]));
			vo.setDate(banks[2]);
			
			balanceList.add(vo);
		}
	} // readBalance end
	// String acc = "0001";
	
	/*
	 * balanceList 에서 
	 * 계좌번호 0001인 데이터를 찾고
	 * 그 계좌의 현잔액을 console에 표시
	 */
	public BankBalanceVO pickAcc(String accNum) {
		
		int bankSize = balanceList.size();
		int index = 0;
		BankBalanceVO vo = null;
		
		for(index = 0 ; index < bankSize ; index++) {
			vo = balanceList.get(index);
			if(vo.getAcc().equals(accNum)) {
				return vo;
			}
		}
		return null;
	} // pickAcc end
	
	/*
	 * 계좌번호로 pickAcc()로부터 vo 값을 추출하고
	 * balance값과 mony 값을 더하여 
	 * vo의 balance에 저장하고
	 * 콘솔에 보여주는 코드
	 */
	public void inputMoney(String acc, int money) {
		/*
		for(BankBalanceVO vo : balanceList) {
			System.out.println(vo);
		}
		*/
		
		BankBalanceVO vo = pickAcc(acc);
		int bal = vo.getBalance();
		vo.setBalance(bal + money);

		// java 1.7 이하에서 지금도 사용하는 코드
		// 현재 컴퓨터날짜값을 가져오기
		Date date 
		= new Date(System.currentTimeMillis());
		
		SimpleDateFormat sf 
			= new SimpleDateFormat("yyyy-MM-dd");
		
		String curDate = sf.format(date);
		vo.setDate(curDate);
		
		// java 1.8(8) 이상에서 사용하는 새로운 날짜
		LocalDate localDate = LocalDate.now();
		vo.setDate(localDate.toString());
		
		System.out.println("============================");
		System.out.println(vo);
		System.out.println("============================");
		
		
	}

	
	public void outputMoney(String acc, int money) {
		
		BankBalanceVO vo = pickAcc(acc);
		int bal = vo.getBalance();

		// 출금일경우는 현잔액을 검사해서
		// 출금액보다 크면 출금 금지
		if(bal < money) {
			System.out.println("잔액부족!!!");
			return ;
		}
		vo.setBalance(bal - money);

		// java 1.7 이하에서 지금도 사용하는 코드
		// 현재 컴퓨터날짜값을 가져오기
		Date date 
		= new Date(System.currentTimeMillis());
		
		SimpleDateFormat sf 
			= new SimpleDateFormat("yyyy-MM-dd");
		
		String curDate = sf.format(date);
		vo.setDate(curDate);
		
		// java 1.8(8) 이상에서 사용하는 새로운 날짜
		LocalDate localDate = LocalDate.now();
		vo.setDate(localDate.toString());
		
		System.out.println("============================");
		System.out.println(vo);
		System.out.println("============================");
		
		
	}

	
	
	
	public int selectMenu() {
		System.out.println("==========================");
		System.out.println("1. 입금   2.출금   -9.종료");
		System.out.println("--------------------------");
		System.out.print("업무선택>>");
		String strMenu = scan.nextLine();
		
		int intMenu = 0;
		try {
			intMenu = Integer.valueOf(strMenu);	
		} catch (Exception e) {
			// 오류 무시
		}
		return intMenu;
	}
}
