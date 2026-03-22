package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {
	/*
	 * (단일) if문 
	 * 
	 * [ 표현법 ] 
	 * 
	 * if(조건식) {
	 * 
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * 
	 * }
	 * 
	 * => 조건식의 결과값이 true일 경우  : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과값이 false일 경우 : if문 Scope({})를 건너뜀! 
	 */
	public void method1() {
		//System.out.println("메소드가 잘 수행되는가");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작습니다.");
		}
		
		
		// if문의 조건식 자리에는 결론적으로 true아니면 false값이 들어가도록 만들어야함!
		
		if(true)  { 
			System.out.println("이 코드는 if문을 만나면 무조건 수행되는 코드");
			// if가 괄호안으로true 들어와서 조건검사를한다
		}
		
		if(false) {
			System.out.println("이 코드는 if문을 만나면 절대 동자하지 않는 코드");
		}
		
	}
	
	public void quiz() {
	
		int count = 0;
		int wrongCount = 0;
		
		// 문제를 출력해준 뒤
		System.out.println("문제 : 고양이는 호랑이과 일까요?");
		
		// 사용자에게 o 또는 x를 입력받아서
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정답을 o또는 x로 입력해 주세요 > ");
		char answer = sc.nextLine().charAt(0);	// o / x
		// 정답입니다~ / 오답입니다~ 를 출력해주는 퀴즈 프로그램 
		// 1. 무슨 값을 가지고 => 사용자가 입력한 값 == answer
		//						'x'
		// 2. 무슨 연산을 하지 => ==
		
		// 사용자가 입력한 값이 x와 같다면
		// 1절 소문자로 체크하기 => 대문자로 입력해도 정답 오답 처리해주세요.
		// 2절 사용자가 입력한 값 == answer / 'X', 'O'
		// 무슨 연산? => ==
		// => 피드백 정답인데.. 너무 안신난다, 오답인데 너무 신난다
		
		// 사용자가 입력한 값이 소문자 x이거나 대문자 X라면
		if(answer == 'x' || answer == 'X') {
	    // 사용자가 입력한 값이(answer) x와('x') 같다면(==)	
			System.out.println("정답입니다~!!!!!!!!!!!!!!!!!!!!");
			count++;
		}
		if(answer == 'o' || answer == 'O') {
			System.out.println("오답입니다~ㅠ");
			wrongCount++;
		}
		if((answer != 'X') && (answer != 'x') && (answer != 'O') && (answer != 'O')) {
			System.out.println("O 또는 X를 입려해주세요.");
		}
		System.out.println("문제 : 여우는 개과 일까요?");
		System.out.print("정답을 o / x로 입력해주세요 > ");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'o' || answer == 'O') {
			System.out.println("정답입니다 ☆");
			count++;
	    }
		if(answer == 'x' || answer == 'X') {
			System.out.println("오답입니다 ★");
			wrongCount++;
		}
		if(!(answer == 'O' || answer == 'o' || answer == 'X' || answer =='x')) {
				System.out.println("O 또는 X를 입력해주세요.");
	}
				
		
		// 총 몇 문제 풀었고 -> 정답은 몇 개 -> 오답은 몇 개
		// 저장 -> 출력
		// 세가지를 출력!
		//System.out.println("총 문제 풀었습니다");
		System.out.printf("퀴즈 끝 ~ 정답 %d개, 오답 %d개 입니다!", count, wrongCount);
		
		// 경우의 수 사용자가 입력한 값이 x, X, o, O일 경우 --> 빠짐
		// O또는 X를 입력해주세요.
		// 1. 무슨값을 가지고? (answer)
		// 2. 무슨 연산?
		
		// ==, !=
		
		}
		
		
		
		
		
		
		
		
		
		
		
				
	
}
	
	
  
	