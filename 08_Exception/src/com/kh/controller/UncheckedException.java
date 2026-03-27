package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * 
	 * NullPointException : 주소값이 있을거라 예상하고 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외
	 * ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * InputMismatchException : 입력버퍼의 값이 자료형과 일치하지 않을때 발생하는 예외
	 * ...
	 * 
	 * 개발자가 예측이 가능함
	 * 
	 * ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * 
	 */

	// ArithmeticException
	public void divZero() {
		
		
		// String str;
		// Math.random();
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나누기 프로그램입니다!");
		System.out.println("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요 > ");
		int num2 = sc.nextInt();
		/*
		 * 문제의 원인을 원천 차단 
		if(num2 !=0) {
			System.out.println("연산 결과 : " + (num1 / num2));
		}else {
			System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
		}
		*/
		
		// 예외처리 : 예외상황을 감지하고 예외상황 발생 시
		//			프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조취를 취하는 모든 절차
		
		
		// 예외처리 구문
		/*
		 * try ~ catch문 
		 * 
		 * try {
		 * 		(num1 / num2) 예외가 발생할 수도 있는 구문
		 * } catch(발생할예외클래스명 변수명 (매개변수작성해줘야해)) {
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * }
		 * 
		 */
		
		try { 
			System.out.println("연산 결과 : " + (num1 / num2));
			System.out.println("참 잘했어요!");
		} catch(ArithmeticException e) { 
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수 없습니다");
			
		}
		
		
		sc.close();
		
		System.out.println("메소드 호출 끝~~~");
	}
		
		
		public void code() {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("메뉴를 선택해주세요.");
				System.out.println("1. 추가하기");
				System.out.println("2. 삭제하기");
				System.out.println("3. 종료하기");
				System.out.print("1번 또는 2번을 입력해주세요 > ");
				int menu = 0;
				try {
					menu = sc.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("숫자를 입력해주세요");
					// 
			    }
				
				sc.nextLine();
				System.out.println(menu + "번 메뉴를 선택하셨습니다.");
				
			}
			/*
			 * 		오버로딩	   		 |   	 오버라이딩
			 * 
			 *  하나의 클래스 내부에서	 |	 상속구조의 자식클래스에서
			 * 
			 * 
			 */
			
		}
			
		public int multiCatch() {
			
			Scanner sc = new Scanner(System.in);
			// 사용자에게 정수값을 하나 입력받아서
			// 100을 사용자가 입력한 정수값으로 나눈 결과를 출력
			
			System.out.print("정수를 입력해주세요 > ");
			
			
			// try catch 를 하나씩 해줄 수 있지만
			try { 
				int num = sc.nextInt(); // 자료형이 int형이 아닌 값이 들어올 시 
									// InputMismatchException이 발생
				//System.out.println("결과 : " + (100 / num)); // num에 대입된 값이 0일시
				return (100 / num);										// ArithmeticException이 발생
			} catch(InputMismatchException e) {
				System.out.println("숫자값을 입력해주세요.");
				return 0;
			} catch(ArithmeticException e) {
				System.out.println(("0이 아닌 정수값을 입력해주세요."));
				return 0;
			} finally { // 리턴하기 직전에 무조건 finally 블럭을 수행
				sc.close(); 
			}
			
	
		
		}
		
	public void orderByCatch() {
			
		// 배열 
			
		// 사용자에게 정수값을 입력받아서
		// 입력받은 만큼의 크기를 가진 배열을 생성 및 할당하고
		// 이 배열의 100번째 인덱스에 대입되어있는 기본값을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 > ");
		
		// InputMismatchException : 스캐너 메소드의 자료형과 일치하지 않는다면
		// NegativeArraySizeException : 배열의 크기를 음수로 할당하려고 하면
		// ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면
		try {
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println(arr[100]);
        
		}catch(ArrayIndexOutOfBoundsException e) { // runtime 보다 위에잡아줘 얘가 runtime보다 하위라 그런듯
		} catch(RuntimeException e) { // 매개변수를 Runtime으로 변경 runtime이셉션에 후손이니까 자료형을 받아서사용가능
									  // 위에 주석 3개 모두적용
			e.printStackTrace(); // 개발단계에서는에서만 사용  찍어서 발생하는 에러 콘솔창 확인 
			System.out.println("정수값을 입력해주세요");
		}finally {
			sc.close();
		}
		
		
		
		
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
