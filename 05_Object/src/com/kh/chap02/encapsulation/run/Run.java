package com.kh.chap02.encapsulation.run;

import java.util.Scanner;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {
	
	// 캡슐화 (encapsulation) 
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	

	public static void main(String[] args) {
		// 객체 생성 == 메모리(heap)에 적재
		AutoSellingMachine asm = new AutoSellingMachine();
		// asm.hi();
		// new AutoSellingMachine().hi();           // (new를 생성하고 ~~~ 하는게 객체생성방법
		// 변수 공간에 대입될 수 있는 값은 딱 9가지(null값 제외)
		// boolean리터럴값, char리터럴값, byte리터럴값, short리터럴값, int리터럴값, long리터럴값
		// float리터럴값, double리터럴값  = 8개 기본자료형값들
		// + 주소값 총9개 주소값 == 아 이거 객체다! heap에 있겠다 
		
		/* private 해서 못써
		asm.name = "삼양라면";
		System.out.println(asm.name);
		asm.price = 1100;
		System.out.println(asm.price);
		asm.amount = 0;
		System.out.println(asm.amount);
		*/
		
		/*
		asm.재고확인하기();
		asm.재고채우기();
		asm.제품판매하기();
		asm.재고확인하기();
		*/
		// asm.openMachine();
		
		// 필드가 외부에서는 보이지 않아서 오류가 발생!
		// 접근제한자를 public에서 private으로 변경했기 때문!
		// 직접적근이 불가능 => 간접적으로 접근할 수 있는 방법을 만들어주어야함
		
		// getter / setter라는 메소드 구현하기
		
		// 라면 가격 1500원으로 세팅하고싶다.
		 asm.setPrice(1500); // asm이라는 식별자를 가진 변수에대입 되어잇는 변수의주소값을 참조해서 setprice 변수값을 호출하면서 1500이라는 아규먼트를 전달
					// (이안을뭐라하냐면) argument, 인자값, 인수
		
		// asm.setPrice();
		
		 asm.setName("삼양라면"); // 객체의 메인필드에 값을 대입하기위해서 대입할값을 넘겨줘야하는게 그값을 괄호안데
		 asm.setAmount(5); // 이 객체의 amount를 셋팅해라 명령조
		
		// 흠 나는 이렇게 하나하나 필드값을 전달하는게 아니라
		// 한번에 여러개 값을 전달하고 싶은데?
		
		
		// 함수 == BuiltInFunction 
		// 객체.함수()                   객체가 필요
		// 자바의 클래스 == 자료형
		// 메소드 == 특정 자료형만 수행할 수 있는 기능
		// 예) 1 + 1 = 2, 3 - 2 = 1
		// 		"일" - "일" = - 라는 기능은 문자열이 수행할수 없어
		
		// new AutoSellingMachine();
		// asm.getName(); // <- 주소값
		// System.out.println(asm.getName());
		
		String name = asm.getName();
		System.out.println(name);
		
		
		// Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
		
		int amount = asm.getAmount();
		System.out.println(amount);
		
		int price = asm.getPrice();
		System.out.println(price);
		
		// System.out.println("자판기 =  : + name + ", 가격)
		
		
		// asm.a();
		
		
		String info = asm.info();
		System.out.println(info);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
