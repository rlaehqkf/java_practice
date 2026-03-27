package com.kh.chap03.run;

import com.kh.chap03.controller.Cooking;
import com.kh.chap03.controller.CookingController;
import com.kh.chap03.controller.Pasta;
import com.kh.chap03.model.vo.Chef;
import com.kh.chap03.model.vo.MainChef;
import com.kh.chap03.model.vo.SaladChef;

public class Run {

	public static void main(String[] args) {
		
		MainChef mc = new MainChef("이승철");
		mc.cooking();
		SaladChef sc = new SaladChef("고길동");
		sc.cooking();
		
		// Chef c = new chef(); 
		// 추상클래스로 선언되었기 때문에 객체 생성이 불가능함
		
		Chef[] c = {mc, sc};	// 다형성은 적용가능
		for(int i =0; i < c.length; i++) {
			c[i].cooking();
		}
		
		CookingController pc = new CookingController();
		pc.pastaCooking(); // CookingController 클래스에 의존
		
		Cooking cook = new Pasta(); // new Rice(); 로바꾸면 밥짓겟습니다 나와
		cook.cooking(); // Cooking 클래스에 의존
		
		// 다형성 : 부모타입의자료형으로 여러 자식객체를 다룰 수 있음 <- 요고는 기억해
		// 정보은닉하려고 씀
		// 의존성주입할 때 처음부터 다시 설명해드리겠음
		
		
		/*
		 * 소프트웨어 개발자들의 목표
		 * 
		 * 코드 수정이 쉬움, 기능 추가가 쉬움, 기능 교체도 쉬움        유지보수를 위해
		 * 		1			  2				3
		 * 
		 * 객체지향언어 
		 * 
		 */
		
		// 메모장에 적혀있는 오늘의 일기를 콘솔창에서 출력해주는 코드 == 입력
		
		// 콘솔창에 열심히 스캐너가지고 문자열을 적어서 메모장에 저장 == 출력
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
