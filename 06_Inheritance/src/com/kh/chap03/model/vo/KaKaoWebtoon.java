package com.kh.chap03.model.vo;

public class KaKaoWebtoon extends Webtoon {
	
	
	private boolean free;
	

	public KaKaoWebtoon() {
		super();
	}

	
	public KaKaoWebtoon(String title, String author, String day, String payment, boolean free) {
		super(title, author, day);
		this.free = free;
	}
	
	
	
	
	
	
	

	public KaKaoWebtoon(boolean free) {
		super();
		this.free = free;
	}









	public boolean isFree() {
		return free;
	}









	public void setFree(boolean free) {
		this.free = free;
	}








	
	
	
	

}
