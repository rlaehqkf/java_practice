package com.kh.array;

import java.util.Arrays;

public class Array {
	
	// 변수(Variable)
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간
	
	// 변수의 특징
	// 자료형이 정해져있다, 고유한 식별자를 가짐, 자료형은 크기가 정해져있다, 새로운 값 대입해서 쓸 수 있음
	// 선언된 Scope에서만 사용할 수 있다, ★★★ 하나의 변수공간에는 하나의 값만 대입될 수 있음 ★★★

	
	/*
	 * 배열(Array) : 하나의 배열에 여러개의 값을 담을 수 있음
	 * 				단, "같은 자료형의 값들"만 담을 수 있음
	 * 				동종모음(homogneous collection)이라고도 부름
	 * 
	 * => 배열의 각 공간에 접근할 때 사용하는 개념 index
	 * => index는 0부터 시작한다.
	 * 
	 */
	
	public void method1() {
		// 다섯 개의 정수를 변수에 대입한 뒤 정수값을 모두 더한 값을 출력
		/*int num1 = 15;
		int num2 = 19;
		int num3 = 22;
		int num4 = 88;
		int num5 = 9;
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);
		/*
		
		// 배열
		// 1. 배열 선언
		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수명;
		 * 
		 * 배열 선언 방법
		 * 
		 * 1) 자료형 배열명[];
		 * 2) 자료형 [] 배열명; -> 두 번째 방법을 많이 사용함
		 */
		// 변수 선언!
		//int num = 10;
		
		// 배열 선언!
		//int[] nums = 0;
		
		// 2. 배열 할당
		/*
		 * 배열에 몇개의 값이 들어갈것인지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼의 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] nums; <-- 배열 선언
		 * nums = new int[5]; <-- 할당
		 * 
		 * int[] arr = new int[5]; <-- 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다.
		 */
		
		// nums라는 정수형 배열을 선언하고 2칸(8byte) 할당받음
		int[] nums = new int[2];
		
		// 배열에 값 대입 => index개념
		nums[0] = 10;
		nums[1] = 17; // 현재 nums에 주소를저장해놨어
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			sum += nums[i];
			
		}
		System.out.println("배열 요소의 값 한계 :" + sum);
		
	}
	
	public void method2() {
		// 배열은 아주 중요함!
		// 중요도 : 개발자가 된 이후 
		
		// 1. 배열 선언 및 할당
		int i;
		int[] integers = new int[3]; // 0, 1, 2 index 생김
		// intergers = 3;
		
		// 배열식별자.lenght : 배열의 크기(길이) => 정수
		System.out.println(integers.length); // 암기의 영역
		
		//System.out.println(i);
		// localvariable == 초기화를 진행하지 않으면 사용할 수 없음
		System.out.println(integers[0]);
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, bouble
		 * 			=> 변수 공간에 실제 값을 바로 담을 수 있음
		 * 
		 * 참조자료형 : int[], boolean[], char[], ...~ String
		 * 			=> 변수 공간에 주소 값을 담을 수 있음
		 */
		// 말 그래도 설명을 위한 코드 실제로는 절대 이렇게 작성해서는 안됨!
		// 301강의실, 302, 501, 502, 사무실
		
		/*String[] KH정보교육원종로점 = new String[5];
		System.out.println(KH정보교육원종로점);	
		KH정보교육원종로점[0] = "301강의실";
		KH정보교육원종로점[1] = "302강의실";
		KH정보교육원종로점[2] = "501강의실";
		KH정보교육원종로점[3] = "502강의실";
		KH정보교육원종로점[4] = "사무실";
		
		// 도달하고자 하는 목적지
		// 501강의실
		System.out.println(KH정보교육원종로점);
		System.out.println(KH정보교육원종로점[2]);
		*/
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		
		System.out.println(numbers1 == numbers2);
		
		// 참조자료형의 경우 == 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을수 없음
		// 문자열
		// == 백날해봤자 X
		// 문자열.equals("비교할 문자열");
		
		// 해시코드 : 주소값을 10진수(int형)형태로 나타낸 것
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
		
		
	}
	
	// 로또번호 생성기 ver 0.2
	public void createLottoNumber() {
		int[] lottoNumbers = new int[6];// 0 ~ 5
		/*lottoNumbers[0] = (int)(Math.random() * 45) +1;
		lottoNumbers[1] = (int)(Math.random() * 45) +1;
		lottoNumbers[2] = (int)(Math.random() * 45) +1;
		*/
		for(int i = 0; i < 6; i++) {
			lottoNumbers[i] = (int)(Math.random() * 45) +1;
		}
		// Arrays.toString(배열식별자) => 배열의 요소들을 예쁘게 출력해줌
		System.out.println(Arrays.toString(lottoNumbers));
		
	}
	
	public void method3() {
		// 구구단을 담는 9칸짜리 배열을 선언 및 할당
		
		// 1. 배열 선언 및 할당
		String[] gugudan = new String[9];
		
		// 2. 배여 인덱스에 구구단 대입!
		gugudan[0] = "2 X 1 = 2";
		gugudan[1] = "2 X 2 = 4";
		gugudan[2] = "2 X 3 = 6";
		gugudan[3] = "2 X 4 = 8";
		gugudan[4] = "2 X 5 = 10";
		gugudan[5] = "2 X 6 = 12";
		gugudan[6] = "2 X 7 = 14";
		gugudan[7] = "2 X 8 = 16";
		gugudan[8] = "2 X 9 = 18";
		//gugudan[9] = "2 X 10 = 20";  <- 문법적으로는 문제가 없음
		// ArrayIndexOutOfBounds 인데스 0~8 인데 9썼으니까 
		
		/* 
		 * AI를 활용해서 현재 내 코드의 잘못된 점을 파악 할 수 있어 (요즘 전형적인 AI활용 시나리오)
		 * -> 코드를 통채로 줌 -> 복사 & 붙여넣기 -> 잘된다 끝 ~ 
		 * 이게 좋다 나쁘다 X
		 * 
		 * 합의 
		 * AI를 활용해서 현재 내 코드의 잘못된 점을 파악 할 수 있어 ok
		 * -> 코드를 통채로 줌 -> 직접 타이핑 = 체득의 과정이 포함
		 * 
		 * 실력이 많이 향살될 수 있는가? X
		 *  -> 이거 알려줘X, 이거 고쳐줘X, 이거 왜 안돼?X
		 *  -> 나 자바 공부한지 5일찬데 이거 왜 안됨? -> 현재 나의 상황을 명확하게 공유
		 *  -> 1년차 주니어 개발자의 시선으로 알려줘  -> 피드백의 주체를 명확하게 설정
		 */
		
		// 취득요건 정보처리기사
		//		  세미프로젝트 진행 -> 해커톤 대회 많이 참가(아이디어싸움, 발표싸움)
		// 		  외국어점수 : 영어점수
		// 3. 출력
		System.out.println(Arrays.toString(gugudan));
	}
	

	public void method4() {
		/*
		 * love
		 */
		// 한 번 할당 받은 배열의 크기는 변경할 수 없음
		char[] love = new char[4];
		love[0] = 'l';
		love[1] = 'o';
		love[2] = 'v';
		love[3] = 'e';
		System.out.println(Arrays.toString(love));
		love[1] = 'i';
		System.out.println(Arrays.toString(love)); // liver
		System.out.println(love.hashCode());
		// char형의 기본값은 '', 정수형의 기본값은0, 실수형의 기본값은 0.0
		love = new char[5]; 
		love[4] = 'r';
		System.out.println(Arrays.toString(love));
		System.out.println(love.hashCode());
		/*
		 * 연결이 끊긴 기존의 벼열은 일정 시간이 지나면 GarbageCollection(GC)가 알아서 삭제
		 * 자동 메모리 관리
		 * 
		 * 기존배열식별자에 할당만 새롭게 한다면 => 기존 참조하고있던 연결이 끊기고 새로운 배열을 가리킴
		 * 
		 */
		
		// 장수돌침대원칙
		// char형배열 => 들어갈 수 있는 값 : 주소값
		//			    들어갈 수 있는 타입 : char형배열
		//				유일한 예외 == null값
		love = null;
		// null : 아무것도 존재하지 않음을 의미하는 값
		System.out.println(love);
		
	}
	
	public void method5() {
		
		// 배열 언제씀?
		// 사용해야하는 값과 개수가 명확한 경우에만 사용
		// 임시비밀번호 발급, 인증코드 발급
		// 우리는 아마도.. 자바가 끝나면 과정이 끝날때까지 단 한번도 배열을 직접적으로 
		// 사용하지 않을것.. 하지만 눈에만 보이지 않을 뿐 항상 배열을 사용하고 있음 자바에서는
		
		// 사용을 한다면 직접 인덱스에 값을 대입한느 방식보다는
		int[] arr = {100, 200, 300, 400, 600};
		System.out.println(Arrays.toString(arr));
		
	}
	
	/*
	 *  배열 복사
	 *  
	 *  1. 얕은 복사♥ 변수/자료형 이후 가장 중요한 내용
	 *  
	 *  2. 깊은 복사
	 */
	public void method6() {
		int[] origin = {1, 2, 3};
		
		// ↑ 이코드가 대체
		// new int[3]; 
		// origin[0] = 1; origin[1] =2; 
		System.out.println(Arrays.toString(origin));
		
		// 얕은복사로 배열을 복사
		int[] copy = origin;  // 풀어말하면 인트형배열을 카피를선언 오리진변수를 대입한다
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33; // 풀어말하면 오리진에 2번인덱스에 33리터럴정수값을 대입
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		// 얕은 복사 => 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같다.
		
	}
	
	// 2. 깊은 복사 => 김픈 복사는 보통 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음
	public void method7() {
		
		int[] origin = {1, 2, 3};
		int[] copy = new int[6];
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		*/
		/*
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		*/
		System.out.println(Arrays.toString(copy));
		int[] copy2 = new int[10];
		
		// 네이밍컨벤션 == 클래스 / 인터페이스 == 첫글자가 대문자
		//System;
		//String;
		//Scanner;
		System.arraycopy(origin, 0, copy2, 0, 3);
		System.out.println(Arrays.toString(copy2));
		// arraycopy(원본배열명, 원본에서복사시작할인덱스, 카피배열명, 카피배열에서복사될인덱스, 복사요소개수)
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
