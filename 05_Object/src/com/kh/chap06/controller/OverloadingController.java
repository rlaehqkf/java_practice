package com.kh.chap06.controller;

public class OverloadingController {
	/*
	 * 메소드 오버로딩(Method Overloading)
	 * 
	 * - "하나의 클래스" 안에 동일한 메소드 식별자로 여러 개의 메소드를 정의하는 기술
	 * - 매개변수 자료형의 개수, 순서, 종류를 각각 다르게 작성해야함
	 * 
	 * - 매개변수 식별자, 접근제한자, 반환타입은 메소드 오버로딩과 연관이 없음
	 * 
	 */
	
	// 메소드명은 method로 통일
	public void method() {
		System.out.println("메소드 오버로딩 1");
		
	}
	
	public void method(int num) {
		System.out.println("메소드 오버로딩 2");
	}
	
	public void method(String str) {
		System.out.println("메소드 오버로딩 3");
	}
	
	public void method(int a, int b) {
		System.out.println("메소드 오버로딩 4");
	}
	
	public void method(int a, String b) {}
	public void method(String b, int a) {}
	
	// public void method(int c, int d) {} 안되는거

	
	
	
}
