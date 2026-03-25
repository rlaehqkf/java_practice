package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		
		// 다형성
		// Polymorphism
		
		/*
		 * 상속
		 * 
		 * 필드 / 메소드 ===> 안중요함
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * 클래스 = 타입 (자료형)
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * 
		 */
		
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild(); 자식의 멤버는 부모가 사용할 수 없음
		// p1변수로는 Parent 타입의 객체만 사용가능
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 가능 왜냐 상속 구조니까
		// c1변수로는 Child1, Parent타입 객체 사용 가능
		
		// = 를 기준으로 양변의 자료형이 같아야한다.
		// ex) double doubleNum = (double)2; // 더블형에 변수 = 값
		Parent p2 = /*(Parent)*/ new Child1();
		// 양쪽의 자료형이 다름에도 불구하고 대입될 수 있는 이유는
		// 부모클래스인 Parent가 자식클래스인 Child1에게 자료형을 상속해 주었기 때문에
		// Child1객체가 Parent타입으로 형변환을 수행해서 대입됨
		
		p2.printParent();
		// p2.priintChild1();
		// p2로는 Parent타입 객체만 사용가능
		
		((Child1)p2).printChild1();
		
		// 부모타입 자료형으로 자식객체를 다룰 수 있음
		
		/*
		 * 클래스 형 변환
		 * 
		 * "상속 구조"일 경우에만 가능
		 * 
		 * 1. UpCasting
		 * 자식타입 => 부모타입
		 * 2. DownCasting
		 * 부모타입 => 자식타입
		 * 생략이 불가능함 꼭 명시해줘야함
		 * 
		 */
		
		/* 
		// Child1타입 객체 두 개, Child2타입 객체 두 개 
		
		Child1 child1 = new Child1(); 
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		*/
		
		/*
		// 배열을 써보자
		// 배열 == 한 자료형의 여러 주소값을 관리할 수 있음
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr2[0] = new Child2();
		arr1[1] = new Child1();
		arr2[1] = new Child2();
		
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[0].printChild2();
		*/
		
		System.out.println("\n\n\n\n\n\n\n 다형성을 적용해볼까?");
		Parent[] arr = new Parent[4];
		arr[0] = new Child1();
		arr[1] = new Child2();
		arr[2] = (Parent)new Child1();
		arr[3] = new Child2();
		
		for(int i = 0; i < arr.length; i++) {
			
			/*
			if(arr[i] instanceof Child1) { // instanceof => true / false
										   // 현재 참조변수가 실직적으로 어떤 클래스 타입을 참조하고있는지
										   // 확인
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			/*
			 * 동적바인딩 : 프로그램 "실행 전" 컴파일 시점에 정적바인딩을 수행
			 * 			 실질적으로 참조하는 객체가 해당 메소드를 오버라이딩 했다면 <- 전제조건
			 * 			 프로그램 "실행 시점" 동적으로 자식클래스의 오버라이딩 된 메소드를 호출
			 * 					(Runtime)
			 * 
			 * 다형성 : 부모클래스 자료형으로 여러 자식클래스를 다루는 기술
			 * 
			 */
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


}
