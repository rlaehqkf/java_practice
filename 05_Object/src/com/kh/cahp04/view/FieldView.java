package com.kh.cahp04.view;

import com.kh.cahp04.controller.FieldController;

public class FieldView {
	
	public void check() {
		
		FieldController fc = new FieldController();
		// 1. FieldController라는 자료형으로 fc라는 지역변수 선언
		// 2. 객체 생성(new키워드를 만났을 때) -> global 멤버변수 할당
		// 3. 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		// System.out.println(fc.loval); 는 쓸수 없음 왜? 메모리에 안올라가 있어서
		fc.checkVariable(5); //메소드안에 초기화 하고싶은 값을 적어 5
		// checkVariable호출 ==> parameter(매개변수) 할당 및 초기화
		// checkVariable 호출 종료 !
		// 종료됨가 동시에 스택영역에서 메모리에서 사라짐 
		// parameter, local 지역변수 소멸
		
		System.out.println(fc.global); // 얘는 heap 영역에 살아 있어서 사용가능
		fc = null; // 스택영역에서 fc가 heap을 가르키고 있으니까 null로 바궈서 가비지컬렉션이 날려 버리게 null로교체
		System.out.println(fc.global);
		
		System.out.println(Math.PI);
		System.out.println(FieldController.JAVA_VERSION);
		System.out.println(Math.random());
		// System.out.println(Arrays.toString(new int[2]));
		
		
		/*
		 * AccessModifier(접근제한자 / 접근제어자)
		 * 
		 * public => 어디서든(같은 패키지, 다른패키지, 클래스 내/외부 포함 전부) 접근가능
		 * 
		 * protected => 같은 패키지라면 무조건 접근 가능!
		 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근가능
		 * 			 => 상속은 07번 프로젝트에서 배울 것
		 * 
		 * default(package friendly) => 나랑 같은 패키지에서만 접근 가능
		 * 
		 * private => 오직 클래스 내부에서만 접근 가능
		 * 
		 */
		
		
		
		
		
	}

}
