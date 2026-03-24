package com.kh.chap02.model.vo;
// 		부모클래스		자식클래스
// 		슈퍼클래스		서브클래스
// 		상위클래스		하위클래스
//		조상클래스		후손클래스
//		확장클래스		파생클래스

						// extends 상속받을클래스명
public class AosGame extends Game {
	private int CharacterCount;

	public AosGame() {
		super(); // Game();
		System.out.println("나는 자식클래스다");
		// super(); 무조건 부모생성자부터 생성
		
	}

	public AosGame(int characterCount) {
		super();
		CharacterCount = characterCount;
	}

	public int getCharacterCount() {
		return CharacterCount;
	}

	public void setCharacterCount(int characterCount) {
		CharacterCount = characterCount;
	}
	
	
	
	
	
	
	

}
