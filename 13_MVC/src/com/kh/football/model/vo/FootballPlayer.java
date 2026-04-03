package com.kh.football.model.vo;

import java.util.Objects;

// 우리가 UPDATE를 구현해야하는데 record로 구현하면
// 필드에 final키워드가 붙어 수정이 불가능해지기 때문에
public class FootballPlayer {
	
	private int id; // 식별값을 저장할 필드 => 자료형 => 실제 들어갈 값 => 1, 2, 3, ++
	private String name; // 이름 저장할 필드 => 자료형?? => 실제 들어갈 값 => 크리스티아노 도스 산토스 아베이루
	private String position; // 포지션 저장할 필드 => 자료형 => 실제 들어갈 값 => 공격수, 미드필드, 수비수. 골키퍼
	private Integer backNumber; // 등번호 저장할 필드 => 자료형 => 실제 들어갈 값 => 1234
	
	public FootballPlayer(int id, String name, String position, Integer backNumber) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
	}
	public FootballPlayer(int id2, String name2, String position2, int backNumber2) {
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setBackNumber(Integer backNumber) {
		this.backNumber = backNumber;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getBackNumber() {
		return backNumber;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "FootballPlayer [id=" + id + ", name=" + name + ", position=" + position + ", backNumber=" + backNumber
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(backNumber, id, name, position);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		return Objects.equals(backNumber, other.backNumber) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position);
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
