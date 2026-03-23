package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

// 화면 담당(입/출력)

public class ReceiptView {

	public void mainMenu() {
		// System.out.println("핫하~~");
		
		// 사용자에게 영수증 정보를 입력받고
		// 입력받은 영수증 정보를 출력해주는 프로그램
		
		Scanner sc = new Scanner(System.in);
	
		
		// Receipt라는 클래스를 가지고 객체 생성
		Receipt r = new Receipt(); // receipt클래스를 객체로 생성해야 클래스로더가찾아
					 // 객체(Object) ==> 추상적인 개념
					 // Instance 	==> 실제 메모리에 올라간 데이터
		// 1. 참조자료형
		// 클래스를 만든다는 행위 == 개발자가 자신에게 필요한 사용자 정의 자료형을 만들겠다.
		// 2. 여러 자료형에 각각 여러 개의 값을 보관가능 + 기능
		
		// 가격, 결제수단, 상점명, 날짜
		System.out.print("가격이 얼마인가요 > ");
		int price = sc.nextInt();
		sc.nextLine(); // nextInt의 개행문자를 없애기 위해
		r.setPrice(price); // 메소드 호출부에서 메소드를 호출하면서 넘길 수 있는것은 오로지 값뿐 ex)변수X
 		// nextInt();, nextLine();, next();, nextDouble();
		
		System.out.print("결제수단은 무엇인가요 > ");
		String payment = sc.nextLine();       //sc는 <- 스캐너 객체의 주체값을 저장해놓은 것이다.
		r.setPayment(payment);
		
		System.out.print("상점명은 무엇인가요 > ");
		String sotreName = sc.nextLine();
		r.setStoreName(sotreName);
		
		System.out.print("날짜는 언제 인가요 > ");
		String date = sc.nextLine();
		r.setDate(date);
		
		System.out.println("=====================");
		String info = r.info();
		System.out.println(info);
		
		sc.close();
	}
	
	
	
	
	
}
