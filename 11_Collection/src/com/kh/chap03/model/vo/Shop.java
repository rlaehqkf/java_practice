package com.kh.chap03.model.vo;

import java.util.Objects;

public class Shop {
	private String name;
	private String menu;
	private int price;
	
	public Shop(String name, String menu, int price) {
		this.name = name;
		this.menu = menu;
		this.price = price;
		
		// 일반적으로 vo클래스는 해쉬코드 이콜스를 반드시!!!! 오버라이딩함
		
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		return Objects.equals(menu, other.menu) && Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 우리가 해야할 일
	// 필드의 값이 동일하다면 
	// equals()와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	/*
	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		System.out.println(obj);
		
		// 전달받은 Shop 객체의 필드값이
		// 현재 eqauls()를 호출한 객체의 필드값과
		// 모두 동일하다면 true값을 반환
		Shop shop =(Shop)obj;
		if(this.price == shop.price && this.name.equals(shop.name) && 
				this.menu.equals(shop.menu)) {
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		// 객체를 가지고 뭐 어쩌구저쩌고 알아서 10진수로 만들어서 반환
		// ! 필드값이 동일하다면 동일한 해쉬코드값이 나오게 만들고 싶음
		// "최고기" "고기고기" 18000 
		// "최고기" "고기고기" 18000
		// "최고기"+"고기고기"+18000
		// "최고기고기고기18000".hashoCode()
		
		return (name + menu + price).hashCode();
		
		*/
		
	
	
	
	

}
