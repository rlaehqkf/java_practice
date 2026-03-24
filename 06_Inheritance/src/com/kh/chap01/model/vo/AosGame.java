package com.kh.chap01.model.vo;

public class AosGame {
	private String gameName;
	private String publisher;
	private int characterCount;
	
	
	
	
	// 기본생성자, 매개변수 생성자
	// 게터, 세터
	// Alt + Shift + s -> o -> Alt + d -> Alt +g  = 기본생성자 단축키
	public AosGame() {
	}



	// Alt + Shift + s -> o -> Alt + g = 모든 필드를 매개변수로 갖는 생성자

	public AosGame(String gameName, String publisher, int characterCount) {
		super();
		this.gameName = gameName;
		this.publisher = publisher;
		this.characterCount = characterCount;
	}
	
	
	
	

	
	
	
	// Alt + Shift + s -> r -> Alt + a -> Alt + r = 게터 세터 생성
	
	
	

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



	public int getCharacterCount() {
		return characterCount;
	}



	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}
	
	
	
	public String info() {
		return "게임정보 [게임명 : " + gameName + ", 운영사 : " + publisher + ", "
				+ "캐릭터 수 : " + characterCount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
	
