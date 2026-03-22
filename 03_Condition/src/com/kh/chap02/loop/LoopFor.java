package com.kh.chap02.loop;

import java.util.Scanner;

import com.kh.chap01.condition.ConditionIf;

public class LoopFor {
	
	public void method0() {
		/*
		System.out.println("자자자 여러분 곧 마지막시간입니다 힘냅시다!!");
		System.out.println("자자자 여러분 곧 마지막시간입니다 힘냅시다!!");
		System.out.println("자자자 여러분 곧 마지막시간입니다 힘냅시다!!");
		*/
		// 100번 가능 1000번 가능 321207번 반복해야한다.
		for(
			int i = 0;
			i < 5;
			i++
			) {
			System.out.print(i + 1);
			System.out.println("반복시키고싶은 코드를 작성해주세요~");
		}
		
		/*
		 * for 문
		 * 
		 * for() { 
		 *  
		 * }
		 *  
		 * 괄호안은 반복의 힛수를 지정하는 역할
		 * 초기식; 조건식; 증감식 세 가지의 요소로 구성됨
		 * ;; 세미콜론으로 구분함
		 * 
		 * [ 표현법 ]
		 * 
		 * for(초기식; 조건식; 증감식) {
		 * 		반복적으로 실행하고자 하는 코드;
		 * }
		 * 
		 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
		 * 			반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) 	=> int i = 0;
		 * 
		 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
		 * 			조건식의 결과가 true일 경우 반복을 수행
		 * 			조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 => i < 5;
		 * 
		 * - 증감식 : "반복문을 제어하는 변수를 대입된 값"를 증감하는 구문
		 * 			꼭 그래야하는것은 아니지만 보통 초기식에서 선언된 변수를 가지고 증감식을 작성
		 * 			이 때, 보편적으로 증감연산자를 사용							=> i++
		 * 
		 */
		
	}
	
	public void method1() {
		// 지이이인짜로 단순하게 출력하는법
		// 1
		// 2
		// 3
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		
		// System.out.println("1\n2\n3"); 멋내고싶을때
		for(/*1*/int i = 1; /*2*/i <= 3; /*4*/i++) {
			/*3*/System.out.println(i+ "번 반복");   // 4번끝나면 무조건2번으로가 
		}
		
		// 제어변수는 보통 i, j, k => COBOL	
		
		//for(int i = 0; i < 10; i++) {
			//if(i % 2 == 0 ) {
			//	System.out.println(i);		// 0 ~ 9 까지 나옴
			//}
		//	System.out.println(i);		// 0 ~ 9 까지 나옴
								// i = i+2
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
		}
	
	
	public void gugudan() {
		
		// 구구단 프로그램
		// 사용자에게 정수를 입력받아서
		// 입력한 정수의 단을 출력해보기
		
		// 구구단을 외우자
		// 몇 단을 출력하시겠습니까 > 4
		// 4단을 출력하겠습니다.
		// 4 X 1 = 4
		// 4 X 2 = 8
		//...
		// 4 X 9 = 36
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 외우자");
		System.out.print("몇 단을 출력하시겠습니까 > ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
			
		// 4를 입력했다고 가정
		/*
		System.out.println(dan + " X 1 " + (dan * 1)); // ~~ 이런식으로 한 줄로 구현 할 수도
		System.out.println(dan + " X 2 " + (dan * 2));
		System.out.println(dan + " X 3 " + (dan * 3));
		System.out.println(dan + " X 4 " + (dan * 4));
		System.out.println(dan + " X 5 " + (dan * 5));
		System.out.println(dan + " X 6 " + (dan * 6));
		System.out.println(dan + " X 7 " + (dan * 7));
		System.out.println(dan + " X 8 " + (dan * 8));
		System.out.println(dan + " X 9 " + (dan * 9));
		*/ // 기본자료형 8개 변수특1,2,3 캐스팅 은 꼭꼭 알아야해
		
		for(int i = 1; i <=9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
	}
	
	
	// 어제 O/X퀴즈, 구구단놀이
	public void mainMenu() {
		
		for(;;) {
			System.out.println("☆메인메뉴입니다★");
			System.out.println("1. 구구단 놀이 시작하기");
			System.out.println("2. O/X 퀴즈 시작하기");
			System.out.println("3. 프로그램 종료하기");
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴를 선택해 주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			// System.out.println(menuNo);
			
			if(menuNo == 1) {
				gugudan(); // 내부는 메소드명만 치면 끝
			} else if(menuNo == 2) {
				ConditionIf ci = new ConditionIf();
				ci.quiz(); // 외부 메소드 호출하는법
			} else if(menuNo == 3) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("없는 메뉴를 선택하셨습니다~");
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
