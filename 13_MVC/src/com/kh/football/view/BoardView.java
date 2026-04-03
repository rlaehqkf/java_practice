package com.kh.football.view;

import java.util.Scanner;

import com.kh.football.controller.BoardController;

public class BoardView {
	
	private BoardController bc = new BoardController();
	private Scanner sc = new Scanner(System.in);
	
	while(true) {
	
		
	public void boardMenu() {
		System.out.println("\n\n\n\n\n");
		System.out.println();
		System.out.println("1. 게시글 상세보기");
		System.out.println("2. 게시글 작성");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("5. 축구메뉴로 돌아가기");
		System.out.println();
		System.out.println("원하시는 메뉴를 선택해주세요 > ");
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1" : break;
		case "2" : break;
		case "3" : break;
		case "4" : break;
		case "5" : sc.close(); return;
		default : System.out.println("메뉴를 다시 선택해주세요!");
		}
	}
	}
	
	
	
	
	private void findAll()	{
		bc.findAll();
		
	}


}