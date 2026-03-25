package com.kh.chap01.model.vo;

public class Child1 extends Parent {
	private int n;

	public Child1() {
		super();
	}

	public Child1(int n) {
		super();
		this.n = n;
	}
	
	public void printChild1() {
		System.out.println("자식클래스 1 메소드입니다.");
	}
	
	@Override
	public void print() {
		System.out.println("Child1의 print메소드");
	}

	

}
