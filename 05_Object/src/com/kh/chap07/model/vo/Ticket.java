package com.kh.chap07.model.vo;

public class Ticket {
	// 티켓을 세개까지 추가 할 수 있음
	// 이용자는 추가되어있는 티켓을 발급받을 수 있음
	
	// 이코노미 티켓
	// 가격, 좌석번호, 서비스, 기내식
	
	// [ 필드부 ]
	private String meal;
	private String seatNumber;
	private String service;
	private int price;
	
	// 생성자 => 기본생성자, 매개변수 생성자
	public Ticket() {} // 기본생성자
	
	public Ticket(String meal, String service, String seatNumber, int price) {
		this.meal = meal;
		this.service = service;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	// 메소드 => 게터, 세터, 필드값 합쳐서 반환해주는 메소드
	
	public String getMeal() {
		return meal;
	}
	public String getService() {
		return service;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public int getPrice() {
		return price;
	}
	
	public String info() {
		return "기내식 : " + meal + ". 서비스 : " + service + ". 좌석 : " + seatNumber + ", 비용 : " + price;
	}

}
