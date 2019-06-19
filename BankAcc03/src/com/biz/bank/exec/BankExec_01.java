package com.biz.bank.exec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.biz.bank.model.BankBalanceVO;
import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImp_01;

public class BankExec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String fileName = "src/com/biz/bank/balance.txt";
		
		// bs 선언부만 try 밖으로 빼내고
		// null값으로 초기화를 한다
		
		// interface가 있는 클래스는
		// 선언부에서는 interface로 선언을 한다.
		//		초기화 생성은 그 interface를 imp 한 클래스로 실행을 한다.
		BankService bs = null;

		try {
			
			// try내에서 다시 객체를 초기화해서
			// 사용할수 있도록 생성
			bs = new BankServiceImp_02(fileName);
			bs.readBalance();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			
			int intMenu = bs.selectMenu();

			if(intMenu == -9) {
				try {
					bs.writeBalance();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
			System.out.print("계좌번호>>");
			String accNum = scan.nextLine();
			
			BankBalanceVO vo = bs.pickAcc(accNum);
			if(vo == null) {
				System.out.println("계좌번호가 없습니다");
				continue;
			}
			
			// 입금처리
			if(intMenu == 1 ) {
				
				System.out.print("입금금액>>");
				String strInputMoney = scan.nextLine();
				int intInputMoney 
						= Integer.valueOf(strInputMoney);
						
				bs.inputMoney(accNum, intInputMoney);
				
			};
			
			// 출금처리
			if(intMenu == 2 ) {
				System.out.print("출금금액>>");
				String strOutputMoney = scan.nextLine();
				int intOutputMoney 
						= Integer.valueOf(strOutputMoney);
						
				bs.outputMoney(accNum, intOutputMoney);
				
			};

//			BankBalanceVO vo = bs.pickAcc(accNum);
//			if(vo == null) System.out.println("계좌 없음");
//			else System.out.println(vo.getBalance());
		}

		
	}

}
