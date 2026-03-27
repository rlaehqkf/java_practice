package com.kh.sw.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.sw.controller.SwitchController;
import com.kh.sw.exception.SwitchBoomException;

// View라는 이름이 달린 클래스 : 어쩔 수 없이 사용 방법이 없음
// 오로지 입/출력을 담당
public class SwitchView {
	private Scanner sc = new Scanner(System.in);
	private SwitchController controller = new SwitchController();
	
	public void menu() {
		System.out.println("불 켰다껐다 프로그렘에 오신것을 환영합니다.");
		while(true) {
			System.out.println("메뉴를 선택해주세요 !");
			System.out.println("1. 스위치 누르기");
			System.out.println("2. 프로그램 종료");
			System.out.println(" > ");
			int menuNo = 0;
			
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("정확한 메뉴번호를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}
			switch(menuNo) {
			
			case 1 : toggleSwitch(); break;
			case 2 : System.out.println("다음에 또 봐요!"); sc.close(); return;
			default : System.out.println("1번이랑 2번뿐이에요!");
			}
			
	
		}
		
		
	}
	
	private void toggleSwitch() {
		
		// SwitchController sc = new SwitchController();
		// 스위치가 꺼져있는 상태면
		// 스위치를 켠 후에 불이 켜졌습니다 출력
		
		// 스위치가 켜져있는 상태면 
		// 스위치를 끈 후에 불이 꺼졌습니다 출력
		
		
		boolean result = false;
		try { result =  controller.toggleSwitch();
		} catch(SwitchBoomException e) {
			System.out.println("도망가자~~");
			return;
		}
		
		if(result) { 
			System.out.println("스위치를 켠 후 불이 켜졌습니다");
		} else {
			System.out.println("스위치를 끈 후 불이 꺼졌습니다");
		}
		
		// 27일 12시20분 객체지향을 쓰는 이유
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
