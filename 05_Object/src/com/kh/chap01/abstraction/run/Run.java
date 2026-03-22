package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Puppy;
import com.kh.chap01.abstraction.view.PuppyCare;

public class Run {

	public static void main(String[] args) {

		// 현실세계의 강아지 => 자바세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이 : 5, 몸무게 : 8, 성별 : 암
		// 강아지 객체 생성해보기
		Puppy puppy = new Puppy();                 // 자료형(퍼피)타입에(Puppy) 퍼피라는변수공간에(puppy) 저장 힙영역에생긴 주소를
		// new 라는 예약어를 사용
		// Menory heap영역에 데이터를 생성
		
		// System.out.println(puppy); // com.kh.chap01.abstraction.model.vo.Puppy@48cf768c 힙영역에 찍힌 주소값이 나옴
		// 참조자료형은 기본값이 null(아무것도 없음을 의미하는 값)
		// System.out.println(puppy.name); // 참조연산자 = 퍼피주소를 가리키겠다 
		
		puppy.name = "나폴레옹";
		// String name = "홍길동";
		// System.out.println(name);
		System.out.println(puppy.name);
		// 종 : 방하르, 이름 : 징기스칸, 나이 : 5, 몸무게 : 50, 성별 : 수
		Puppy khan = new Puppy(); // khan은 주소를 담고있는 변수
		khan.name = "징기스칸";
		System.out.println(khan.name);
		
		
		// 정수값 => 정수자료형 int, short, byte, long
		// 실수값 => 실수자료형 float, double
		// 논리값 => 논지라료형
		
		// 현실 세계의 강아지의 값 => 개발자가 직접 강아지 자료형을 만들어줘야함 => 클래스
		// 클래스란? 객체들의 정보(속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		
		// 소프트웨어 == 실체가 없음
		
		// 객체 지향 프로그래밍! -> 현실세계에서의 개체를 속성과 행위를 가진 객체로 생성하여
		//					-> 객체간의 관계를 맺고 상호작용을 통해 프로그래밍을 하는 개발방법론
		
		puppy.bark();
		khan.bark();
		
		
		puppy.weight = 8;
		khan.weight = 50;
		System.out.println(khan.weight);
		khan.sit();
		khan.sit();
		khan.sit();
		System.out.println(khan.weight);
		
		
		
		PuppyCare pc = new PuppyCare();
		pc.run();
		
		
		
	}

}
