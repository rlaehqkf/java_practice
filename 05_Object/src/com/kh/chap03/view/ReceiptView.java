package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

// 화면 담당(입/출력)

public class ReceiptView {

	public void mainMenu() {
		System.out.println("핫하~~");
		
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
		
		
		sc.close();
	}
	
	
	
	
	
}
