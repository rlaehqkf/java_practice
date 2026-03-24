package com.kh.chap06.controller;

public class MethodController {
	
	/*
	 * 메소드(Method) == 멤버 함수
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블록
	 * 1. 재사용성
	 * 2. 모듈화
	 * 
	 * 객체지향 프로그래밍에서의 함수(메소드) : 객체가 수행할 수 있는 행동을 정의한 코드 블록
	 * 
	 * ☆★ 특정 자료형에서만 사용이 가능한 함수 ★☆
	 * 
	 * [ 표현법 ]
	 * 
	 * 접근제한자 예약어 변환형 메소드식별자(매개변수의자료형 매개변수식별자) {
	 * 
	 * 		수행할 코드;
	 * 
	 * 		return 반환값;
	 * }
	 * 
	 * 생량 가능한 것 : 예약어, 매개변수, return문(void일 경우)
	 * 반환형 : return시 반환할 값이 있을 경우 반환할 값의 자료형
	 * 메소드 호출 시 전달 인자값 => 매개변수의 자료형 및 개수가 정확하게 일치해야함
	 */
	// 정수 값 두개를 받아서 더하기 결과를 반환해주는 기능을 만들고 싶다.
	// Method signature
	public int add(int a, int b) { // Method Body
		return a + b; // 반환값	
	}
	
	// 1. 매개변수 X, 반환값 X
	// 출력문 작성할 때 사용
	public void method1() { 
		System.out.println("출력용 메소드");
	}
	
	// 2. 매개변수 X, 반환값 O (입력값x 출력값o)
	public String method2() {
		return "필드값";
	}
	
	public String method3()	{
		return method2();
	}
	
	// 3. 매개변수 O, 반환값 X
	
	/* 
	 * public void setName(String name) {
	 * 		this.name = name;
	 * }
	 */ 
	
	// 4. 매개변수 O, 반환값 O
	public int method4(int num) {
		return num + 54;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
