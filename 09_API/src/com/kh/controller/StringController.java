package com.kh.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

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
		
		// 1. 문자열.lenght() : int 
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());
		// System.out.println("객체야 이건".);
		
		
		String userId = "sjdofpf";
		// 아이디 8~20자
		/*
		if(!(8 <= userId.length() && userId.length() <= 20)) {
			throw new RuntimeException("아이디 글자수 어쩌~~");            // 이상하게출력된다 확인
		
		}
		*/
		
		// 2. 문자열.charAt() : char
		char ch = userId.charAt(0);
		System.out.println(ch);
		
		String phoneNumber = "010-1234-5678";
		// 3. 문자열substring(int beginindex) : String
		System.out.println(phoneNumber.substring(4)); // 4부터 끝까지 010- 다음부터
		System.out.println(phoneNumber.substring(4, 8));
		
		// 4/ 문자열.indexOf(String) : int
		//								"은총알은 없다"
		System.out.println(str1.indexOf("없다"));
		
		String[] emails = {"hong@kh.com", "kim@kh.com", "lee@kh.com", "hahahooh@kh.com"};
		// System.out.println(emails[0].substring(0, 4));
		// System.out.println(emails[1].substring(0, 3));
		
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		}
		
		String fileName = "sdjof.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".")));
		
		String fileName2 = "sd.sdf.sdf.sdf.sdf.sdf.png";
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".")));
		
		
		// 문자열.toCharArray() : char[]
		String str5 = "배열로만들어문자열";
		char[] chArr = str5.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		for(char c : chArr) {
			System.out.println(c);
		}
		// new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
		
		// char[] -> String
		System.out.println(String.valueOf(chArr));
		
		
		
		String replaceStr = "KH 아카데미";
		// 문자열.repalce(Str, Str) : String
		System.out.println(replaceStr.replace("KH", "더조은"));
		
		// 문자열.toUpperCase() -> 싹다 대문자로 변환
		//	   .toLowerCase() -> 싹다 소문자로 변환
		String lowerStr = "abcd";
		String upperStr = "ABCD";
		System.out.println(lowerStr.toUpperCase());
		System.out.println(upperStr.toLowerCase());
		
	
	
	/*
	 * String str1 = "11,22,33,44";
	 * String str2 = "22,44,66,88";
	 * 
	 * String str3 = "avcds sdifods"
	 */
	
	// 문자열 분리시키기
	String split = "갈비,갈비찜,곽만근갈비찜,곽만근얼큰갈비탕";
	
//	String galubi = split.split(",");
//	System.out.println(Arrays.toString(galubi));       이두개 왜 에러지?
	
	// java.util.StringTokenizer 클래스를 이용하는 방법
	StringTokenizer stn = new StringTokenizer(split,",");
	
	// System.out.println(stn.nextToken());
	// System.out.println(stn.nextToken());
	
	while(stn.hasMoreTokens()) { // 남아있는 토큰이있다면 true / 없다면 false 반환
		System.out.println(stn.nextToken());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
