package com.kh.practice;

import java.util.Scanner;

public class PracticeJava {
	
	
	
	
	// 연산자 공부
	// 햄버거 만들어보기, ox 퀴즈만들기, 곱셈만들기
	// if, if else, switch, while
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피자핫 오신 것읋 환영 합니다.");
		System.out.println("--------핏자헛 메뉴판-------");
		System.out.println("1. 치즈/페페로니 핏자");
		System.out.println("2. 블랙 BBQ 스테이크 뇨끼 핏자");
		System.out.println("3. 이재모 핏자");
		System.out.println("-------------------------");
		System.out.print("주문하실 메뉴를 선택해 주세요 >");
		
		String select = sc.next();
		System.out.println(select + "을(를) 주문하셨습니다.");
		
	}

}
