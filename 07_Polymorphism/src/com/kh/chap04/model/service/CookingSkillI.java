package com.kh.chap04.model.service;
/*
 * Interface
 * 
 * 구체클래스
 * 추상클래스
 * 인터페이스
 * 
 * - 추상클래스보다 더욱 강한 규칙성, 강제성을 가짐
 * - 인터페이스에 필드를 작성하면 상수필드
 * - 인터페이스에 메소드 작성시 default를 붙이지않으면 abstract 메소드
 * - 인터페이스는 다중 구현을 허용함
 * 
 *  -> 무조건 구현해야하는 기능이 있을 경우 인터페이스를 설계해서
 *     사용법만 만들어주고 구현하는쪽에서 실체화하게 만듬 = > 오버라이딩
 *     
 * 추상클래스 / 인터페이스
 * -> 필드 / 공통메소드 -> 재사용하기 위함                   상속보다 합성써라
 * -> 인터페이스는 기능의 구현을 강제하기 위한 용도
 * 
 */

public interface CookingSkillI {
	
	/* public static final 가 생략돼있어 (static상속필드) */ int NUM = 1;
	
	/*public abstract 가 생략돼있어 */void makeDopbap();   //추상메소드
	// File store(); 나중에 설명
	
	default void close() {
		System.out.println("가게 문 닫습니다~");
	}
	// 인터페이슬르 구현한 모든 클래스가 동일하게 수행해야하는 메소드는
	// default 키워드를 붙여 구현할 수 있음
	
	
	
	
	
	
	
	
	
}
