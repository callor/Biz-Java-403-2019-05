package com.biz.inout.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.inout.model.InOutDto;
import com.biz.inout.model.InOutVO;

public class InOutService_01 {

	List<InOutVO> iolist;
	List<InOutDto> ioViewList;
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public InOutService_01(String fileName) throws FileNotFoundException{
		iolist = new ArrayList<InOutVO>();
		ioViewList = new ArrayList<InOutDto>();
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
	}
	
	public void readFile() throws IOException{
		// vo에 담고,
		// list에 추가
		String reader = "";
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			String[] iolists = reader.split(":");
			InOutVO vo = new InOutVO();
			vo.setIo_date(iolists[0]);
			vo.setPname(iolists[1]);
			vo.setInout(iolists[2]);
			vo.setPrice(Integer.valueOf(iolists[3]));
			vo.setAmt(Integer.valueOf(iolists[4]));
			iolist.add(vo);
		}
	}
	
	public void calcIolist() {
		// vo를 반복하면서
		// 매입, 매출계산하고
		// dto에 담아주고
		
		for(InOutVO vo : iolist) {
			InOutDto dto = new InOutDto();
			dto.setIo_date(vo.getIo_date());
			dto.setPname(vo.getPname());
			dto.setAmt(vo.getAmt());
			dto.setPrice(vo.getPrice());
			
			if(vo.getInout().equals("1")) {
				dto.setInout("매입");
				int in_total = vo.getAmt() * vo.getPrice();
				dto.setIn_total(in_total);
			} else {
				dto.setInout("매출");
				int out_total = vo.getAmt() * vo.getPrice();
				dto.setOut_total(out_total);
			}
			ioViewList.add(dto);
		}
		
		
	}
	
	public void listView() {
		// dto만 가지고 출력
		
		System.out.println("매입매출 리스트");
		System.out.println("========================");
		System.out.println("일자\t구분\t상품명\t단가\t수량\t매입금액\t매출금액");
		System.out.println("-------------------------");
		for(InOutDto dto : ioViewList) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\n",
					dto.getIo_date(),
					dto.getInout(),
					dto.getPname(),
					dto.getPrice(),
					dto.getAmt(),
					dto.getIn_total(),
					dto.getOut_total()
					);
		}
	}
	
}
