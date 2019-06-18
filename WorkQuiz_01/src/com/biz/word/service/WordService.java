package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {
	
	Scanner scan;
	List<String> wordList;
	String word;
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public WordService(String fileName) throws FileNotFoundException {
		scan = new Scanner(System.in);
		wordList = new ArrayList<String>();
		word = new String();
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
	}
	
	/*
	 * word.txt 파일로 부터 단어 리스트를 읽어서
	 * wordList에 추가하시오
	 */
	public void readWordList() throws IOException {
		// 리스트의 데이터만 지우는 메서드
		// remove() 1개씩 지우고자할때
		wordList.clear();
		String reader = "";
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			wordList.add(reader);
		}
	}
	
	public void inputWordList() {
		// 단어목록을 List로 작성하고
		wordList.clear();
		wordList.add("Korea");
		wordList.add("America");
		wordList.add("England");
		wordList.add("German");
		wordList.add("Aprica");
		wordList.add("France");
	}
	
	public void makeQuiz() {
	
		Collections.shuffle(wordList);
		word = wordList.get(0);
		
		String[] arrWord = word.split("");
		List<String> apList 
			= new ArrayList<String>(Arrays.asList(arrWord));
		Collections.shuffle(apList);
		System.out.println("=============================");
		System.out.println(apList);
		System.out.println("=============================");
	}
	
	public boolean pickQuiz() {
		System.out.println("제시된 알파벳의 단어를 맞추시오!!");
		System.out.println("종료 : --END");
		String strKeyInput = scan.nextLine();
		
		if(strKeyInput.equals("--END")) return true;
		
		if(word.equalsIgnoreCase(strKeyInput)) {
			System.out.println("참 잘했어요");
		} else {
			System.out.println("단어 선택을 잘못했네요");
		}
		
		return false;
		
	}
	

}
