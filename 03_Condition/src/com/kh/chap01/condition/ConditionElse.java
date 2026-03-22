package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if ~ else
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		조건식의 결과가 true일 경우 실행할 코드 -a
	 * } else { 
	 * 		조건식의 결과가 false일 경우 실행할 코드 -b
	 * }
	 * 
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 false일 경우 b를 실행
	 * 
	 */
	
	public void method1() {
		// 핸드폰 번호 뒷자리 입력받아서 
		// 당첨자 번호랑 같으면 추카포카 아니면 다음기회에
		// 당첨 핸드폰 번호 뒷자리 => 7777
		
		// 계획
		// 사용자에게 핸드폰 번호 뒷자리를 입력받아서
		// 당첨 핸드폰번호와 일치한다면 추카포카를 출력해주고
		//				 일치하지 않는다면 다음기회에를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		// System.out.println(phoneNumber);
		
		
		
		// 1. 어떤 값을 가지고 (사용자가 입력한 폰번호 == phoneNumber / "7777")
		// 2. 어떤 연산 ? 동등비교
		// 문자열 값을 비교하고 싶을때 : ==(동등비교연산자)의 경우 기본타입 자료형 8개끼리만 사용가능하기 때문에
		//						 equals()라는 메소드를 호출해서 비교해주어야함
		//						 문자열 값이 일치할 경우 true를 반환 일치하지 않을경우 false를 반환
		if(phoneNumber.equals("7777")) {
		// (사용자가 입력한 핸드폰번호가 7777과 일치하다면)
			System.out.println("축하합니다~ 백만원 상품권 당첨입니다~~");
		} else {
			System.out.println("아쉽지만 다음기회에~");
			
		}
		
		/*
		 if(!(phoneNumber.equals("7777"))) {
		System.out.println("아쉽지만 다음기회에~");
		 */
		
		// if문의 조건식 결과가 true일 경우 => if Scope가 끝나면 else Scope를 건너 뜀
		// if문의 조건식 결과가 false일 경우 => if Scope를 건너뛰고 else Scope로 진입
		// 불필요한 연산이 줄어든다! => 처리속도가 향상됨!
			
		
		
	}
	
	/*
	 * if ~ else if문               else는 그게아니고 라고해석
	 * 
	 * [표현법 ]
	 * 
	 * if(조건식1) { 
	 * 		조건식1이 true일 경우 실행할 코드;
	 * } else if(조건식2) {
	 * 			조건식2가 true일 경우 실행할 코드;
	 * } else if(조건식3) {
	 * 			조건식3이 true일 경우 실행할 코드;
	 * } else {
	 * 			앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드;
	 * }
	 */
	
	public void method2() {
		
		// 핸드폰 뒷자리르 입력받아서 1등, 2등, 3등, 아쉽지만 미당첨 출력해주기
		//                    7777 1111 9999
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 뒷자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		
		//System.out.println("사용자가 입력한 폰번호 : " + phoneNumber);
		
		
		String message = "등 당첨 축하드려요 ☆";   // 문자열 + 문자열 하나의 문자열 완성
		if(phoneNumber.equals("7777")) {
			System.out.println("일" + message);
		} else if(phoneNumber.equals("1111")) {
			System.out.println("이" + message);
		} else if(phoneNumber.equals("9999")) {
			System.out.println("삼" + message);
		} else { 
			System.out.println("아쉽지만 다음 기회에 도전해주세요!");		
		} 
		
	}
	
	public void ageCheck() {
		
		// 사용자에게 나이(정수)를 입력받고					=> Scanner, nextInt()
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요. => if ~ else if, System.out.println();
		//  1 ~ 12 : 어린이 입니다.						
		// 13 ~ 17 : 청소년 입니다.
		// 18 ~    : 성인입니다.
		// 0, -    : 잘 못 입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요(예 : 15) > ");
		int age = sc.nextInt();
		System.out.println(age);		// 실습하다 놓친부분
		
		// 1. 어떤값을 사용할 것인가 (age) / 비교대상, 1~12, 13~17, 18~, 0(else)
		// 2. 어떤 연산을 할 것인가 		 / 대소비교, 동등비교(age == || age == 22 || )
		
		// 	ageCheck_ver1.0
		//	String message = "입니다";
		//	if(1 <= age && age <= 12) {
		//		System.out.println("어린이" + message);
		//	} else if(13 <= age && age <= 17) {
		//		System.out.println("청소년" + message);
		//	} else if(18 <= age) {
		//		System.out.println("성인" + message);
		//	} else {
		//		System.out.println("잘 못 입력하셨습니다.");
		//	}
		
		// ageCheck_ver2.0
		if(age < 0) {
			System.out.println("올바른 나이를 입력해주세요.");
		} else if(age >= 18) {
			System.out.println("성인 입니다.");
		} else if(age <= 12) {
			System.out.println("어린이 입니다");
		} else {
			System.out.println("청소년 입니다");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
