package com.kh.chap02.model.vo;


public class FpsGame extends Game {
	
	// 필드부
	private int stress;
	
	
	public FpsGame() {}
	public FpsGame(String gameName, String publisher, int stress) {
		// this.gameName = gameName; // 클래스내부에선 외부로 접근할수 없어
		// super.gameName = gameName; -> protected 권장방법x
		// 부모 필드의 접근제한자를 protected로 변경하면 캡슐화 원칙 위반!
		// setGameName(gameName);
		// setPublisher(publisher);
		
		super(gameName, publisher); // 기본생성자호출
		this.stress = stress;
	}
	
		
	
	
	public int getStress() {
		return stress;
	}
	public void setStress(int stress) {
		this.stress = stress;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
