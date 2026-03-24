package com.kh.chap02.model.vo;
		 // 자식클래스 extends 부모클래스
public class RpgGame extends Game {
	
	// 부모로부터 상속받은 부분은 기술하지않는다.
	private int maxLevel;
	
	public RpgGame() {}
	public RpgGame(String gameName, String publisher, int maxLevel) {
		// gameName, publisher -> 부모클래스 필드에 대입
		// maxLevel -> 내필드에 대입
		super(gameName, publisher);
		this.maxLevel = maxLevel;
		
	}
	
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	
	// 메소드를 상속받았는데 마음에 안듭니다! 발절을 시키고 싶음
	// 다시 쓸수 있음 ===> 재정의
	public String info() {
		return super.info() + "최대 레벨 : " + maxLevel;
	}
	

}
