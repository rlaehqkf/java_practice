package com.kh.chap02.model.vo;
/*
 * 상속(Inheritance)
 * 
 * 기존에 존재하는 클래스를 이용해서 새로운 클래스를 만드는 기술
 * 
 */

public class Game {
	// 공통필드
	private String gameName;
	private String publisher;
	
	
	
	public Game() {
		
		System.out.println("나는 부모클래스 game이다");
	}

	
	
	
	public Game(String gameName, String publisher) {
		this.gameName = gameName;
		this.publisher = publisher;
	}


	
	

	public String getGameName() {
		return gameName;
	}












	public void setGameName(String gameName) {
		this.gameName = gameName;
	}












	public String getPublisher() {
		return publisher;
	}












	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}












	public String info() {
		return "게임명 : " + gameName + ", 운영사 : " + publisher;
	}
	
	
	
	
}

	
