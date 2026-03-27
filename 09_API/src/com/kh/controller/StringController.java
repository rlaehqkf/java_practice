package com.kh.controller;

import com.kh.run.Run;

public class StringController {
	
	// String 클래스 => 불변(변하지 않음을 의미)
	
	public void method1() {
		
		// String abc = "abc";
		// new String(); // String 객체 생성하는 방법
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		System.out.println(str1);
		System.out.println(run);
		System.out.println(str2.toString());
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 value값을 반환하게끔 오버라이딩
		
		// equals() 
		System.out.println(str1.equals(str2));
		Run run2 = new Run();
		System.out.println(run.equals(run2));
		// 2. 문자열 value를 비교하도록 오버라이딩
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 3. 주소값을 해싱하는것이 아니라 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩
		// (해싱은 해싱값을 넣으면 같은 해싱값이 나와??)
		
		// System.identityHashCode(참조형변수)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		
	}
	
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		
		// eqauls()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1 == str2);
		
	}
	
	
	public void method3() {
		// 어찌하여 이둘은 다른가?
		String str1 = new String("hello"); // 절대로 이 방법 사용하면 안됌
		String str2 = "hello"; // 문자열 쓸 때 무조건!!!! 이렇게 써야해 
		
		// 문자열 리터럴은 대입연산자를 사용해 대입할 때
		// String Pool(heap) 영역에 등록됨
		// StringPool : 동일한 내용의 문자열 Value 가 존재할 수 없음
		
		System.out.println(System.identityHashCode(str2));
		str2 += "bye";
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2);
		
		
	}
	
	
	public void method4() {
		
		StringBuffer sb = new StringBuffer();
		String str = "Hello" + "World"; // 효율이 안좋음
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);
		
		// 문자열임시저장공간
		// 문자열이 불변객체라서 내용물 변경이 일어나면 계속 새로운 공간을 할당해서 올릴것
		// 이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 차곡차곡 담았다가 한번에 처리하는 클래스
		
		StringBuilder sr = new StringBuilder(); // 이론적으로 동시제어기능이 빠져있어 버퍼보다 빠르다
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		// 동시제어기능(Thread-Safe)
		// Thread t;
		// Tomcat, Jetty -> 서버들에서 제공이 많이 되고있음 / 알아서 나중에 해줘
		// 충돌나겠다!가 아니라면 굳이 구현할 필요가 없음
		
	}
	
	public void method() {
		
		String str1 = "은총알은 없다";
		
		// 1. 문자열.lenght()
		// 문자열의 길이를 반환
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
