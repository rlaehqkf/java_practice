package com.kh.football.model.dto;


// DTO : Data Transfer Object
// 		  값     전송     객체
// DTO : 순수하게 데이터를 옮겨담을 용도로 만드는 클래스
//		DTO					/		VO
//	   값의 전송 				/ 	  값을 담음
// 	   setter O	 			/   setter X (불변)
//     코드안넣고			 	/ equals(), hashCode(), 비지니스로직
// 극단적으로가면 필드를 public 	/ 필드를 final로 선언
public class FootballPlayerDto { // DTO 클래스 만들때 record로 만드는 경우도 많지만 그럼VO야
	// 필드 , 기본생성자 , 매개변수생성자, getter / setter
	private String name;
	private String position;
	private int backNumber;
	public FootballPlayerDto() {
	}
	public FootballPlayerDto(String name, String position, int backNumber) {
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBackNumber() {
		return backNumber;
	}
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	
	

}
