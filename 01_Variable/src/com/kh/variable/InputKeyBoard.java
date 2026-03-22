package com.kh.variable;

import java.util.Scanner;

public class InputKeyBoard {
	/*
	 * 키보드를 이용해서 프로그램을 사용하는 사용자에게 값을 입력받아 볼 것!!
	 * 자바에서 제공해주는 Scanner라는 클래스를 사용
	 * Scanner라는 클래스에 존재하는 메소드들을 호출해서 입력을 받을 수 있음
	 * 
	 */
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in); 
		// System.in : 표준 입력 도구에서 입력하는 값들을 받겠음(바이트 단위)
		
		
		System.out.println("피자핫 오신 것읋 환영 합니다.");
		System.out.println("--------핏자헛 메뉴판-------");
		System.out.println("1. 치즈/페페로니 핏자");
		System.out.println("2. 블랙 BBQ 스테이크 뇨끼 핏자");
		System.out.println("3. 이재모 핏자");
		System.out.println("-------------------------");
		System.out.print("주문하실 메뉴를 선택해 주세요 >");
		
		
		// next() : 사용자가 입력한 값 중 공백문자가(스페이스 개행문자 탭문자) 있을 경우 공백문자 이전까지만 입력받음
		String select = sc.next();
		// 사용자가 어떤 값을 입력하던지 입력한 값을 다시 화면상에 출력!!! <-- 목표
		System.out.println(select + "을(를) 주문하셨습니다.");
		
		// 개수 : 몇 판이요?
		System.out.print("몇 판 주문하시겠습니까(숫자로 입력해주세요) > ");
		// 1 2 3 4 5 6... <-정수
		int pizzaNumber = sc.nextInt(); // next(Double();		
		System.out.println(select + "를 " + pizzaNumber + "판 주문하셨습니다.");
		
		System.out.print("주소를 입력해 주세요 > ");
		// nextLine() : 사용자가 입력한 값을 공백과 무관하게 개행문자 이전까지 다 읽어오는 기능
		// nextLing() : 입력버퍼에서 개행문자 이전까지의 모든 값을 가져온 후 입력버퍼에 존재하는 "개행문자"를 날려줌~~
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.println(address + "로 배달합니다.");
		
 		
		
	}
	
	
}
