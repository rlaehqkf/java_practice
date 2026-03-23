package com.kh.cahp04.controller;
/*
 * 필드 (객체의 속성을 저장하는 변수) == 멤버변수 == 인스턴스변수 == 속성
 * 
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 블록 안에 존재
 * 
 * 필드(멤버변수, 인스턴스 변수)
 * 
 * 생성시점 => new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당
 * 소멸시점 => 객체가 소멸 될 때 =>가비지컬렉션이 동작을 안하면 OOM(Out Of Memory 메모리 터진다) 발생
 *
 * 
 * static필드(클래스 변수)
 * 
 * static이라는 예약어가 붙어있는 필드
 * 
 * 생성시점 => static필드 호출 시점 Metaspace(static영역)에 올라감
 * 소멸시점 => 프로그램이 (블록이, 메인메소드가) 종료되면 소멸 => ClassLoader를 GC가 소멸시키는 시점
 * 			// 프로그램이 종료되고 classloader ~~
 * 
 * 지역 변수 (조건 클래스 영역이 아닌 특정영역에 생성
 * 
 * 		  => ClassLoader
 * 생성시점 => 특정영역( {} ) 내부에서 선언되는 시점에 메모리 영역에 할당 -> stack
 * 소멸시점 => 특정영역( {} )가 종료될 때 => stack 메모리에서 소멸하는 시점에 
 * 
 */

public class FieldController {
	
	public static String str = "static";
	// static 키워드는 공유의 목적이 강함
	// 프로그램 구동중 계속 값을 사용하기 위해 씀
	public static final String JAVA_VERSION = "21";
	// public final static 도 가능한데 안 써 거의
	
	// public static final 은 세트
	// static : 프로그램 전체에서 공유
	// final  : 절대 못바꿈          대문자_대문자
	// 무조건 선언과 동시에 초기화를 진행 해야함!
	
	
	
	
	
	public int global; // 필드
	
	public void checkVariable(int parameter) { //(int parameter 매개변수) 
		
		int local = 1; // 지역변수 메소드 내에서만 씀 쓰기위해선 (=1)초기화를 반드시진행
			
		System.out.println(global);		// 필드
		System.out.println(local);		// 지역변수
		System.out.println(parameter);	// 매개변수(지역변수)
	
	}
	
	
	

}
