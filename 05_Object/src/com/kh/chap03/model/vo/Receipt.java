package com.kh.chap03.model.vo;

public class Receipt {
	// 가격, 결제방법, 상점명
	
	// 필드부
	private int price;
	private String payment;
	private String storeName;
	private String date;
	
	// 자바에서 날짜를 저장할 수 있는 JDK에서 제공되는 클래스
	
	// 생성자부 -> 월요일에 
	
	// 메소드부
	// getter() / setter() / info()
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getpayment()	{
		return payment;
	}
	
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	// info()
	public String info() {
		String info = "상품명 : " + storeName
					+ ", 금액 : " + price
					+ ", 결제수단 : " + payment
					+ ", 결제일시 : " + date;
		return info;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
