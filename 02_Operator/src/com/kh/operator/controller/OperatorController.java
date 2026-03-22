package com.kh.operator.controller;

import java.util.Scanner; // Ctrl + Shift +o (import 자동완성 단축키)

public class OperatorController {
	
	public void arithmetic() {
		// 산술연산자 -> 이항연산자, 우선순위가 수학익힘책이랑 똑같은
		// +, -, *, /
		// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구하는 연산
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		// test();
		
		System.out.println("num1 + num2 : " + num1 + num2);
							// " num1 + num2 : 10 "
							// " num1 + num2 : 103"
			// 결과값은 "num1 + num2 : 103"
		System.out.println("num1 + num2 : " + (num1 + num2));
		int sum = num1 + num2;
		System.out.println("num1 + num2 : " + sum);
		System.out.print("num1 + num2 : ");
		System.out.println(num1 + num2);
		System.out.printf("num1 + num2 : %d\n", num1 + num2); // 이게젤 베스트

		System.out.println("num1 - num2 : " + (num1 - num2));
		
		System.out.println("num X num2 : " + (num1 * num2));
		// *, /, % -> 우선순위가 +, -보다 높기 때문에 묶어주지 않더라도 먼저 연산을 수행
		// 다른 개발자들의 가독성을 위해 괄호를 사용하는 것을 권장!
		System.out.println("num1 ÷ num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// 조심해야할 부분
		// System.out.println(10 / 0);
		
		
	}
	
	public void test( ) {
		System.out.println("메소드를 호출 할 때 꼭 메인에서만 불러야하는 것은 아닙니다!");
	}
	
	public void presentToStudent() {
		
		Scanner sc = new Scanner(System.in);
		
		// String str = sc.nextLine();
		
		System.out.println("학생 수를 입력해 주세요 > ");
		int students = sc.nextInt();
		System.out.println("학생수 : " + students);                     // 여까지 1번
		
		System.out.println("사탕 개수를 입력해 주세요 > ");
		int candies = sc.nextInt();
		System.out.println("사탕 개수 : " + candies); 					 // 여까지 2번
		
		int result = candies / students;
		int mod = candies % students;
		System.out.println(result);
		System.out.println(mod);
		
		System.out.println("두 당 가질 수 있는 사탕의 개수 : " + result + "개");
		System.out.println("남는 사탕의 개수 : " + mod + "개");
		
		// 사탕 개수 구하기 프로그램 구현하기!
		// 메소드 : presentToStudent()

		// 사용자에게 값을 입력 받으세요. 	<== Scanner
		// 1. 나눠줄 학생의 수			<== nextInt();
		// 2. 사탕 개수				<== nextInt();
		
		// 1인당 받을 수 있는 사탕의 개수 : 사탕개수 / 학생수 	<== 산술 연산자
		// 남은 사탕의 개수 : 사탕 개수 % 학생수 			<== 산술 연산자

		// 출력형식
		// 학생 한 명당 받을 수 있는 사탕 개수 : X개		<== println();
		// 남은 사탕 개수 : X개						<== println();

		
	}
	
	public void inDecrease() {
		/* 
		 * 증감연산자 : 단항연산자로 한 번에 1증가하거나 / 1감소하는 연산을 함
		 * 
		 * [표현법]
		 * ++ : 값을 1증가 시킴
		 * -- : 값을 1감소 시킴
		 * 
		 * => 증감을 먼저 할건지, 아니면 나중에 할건지에 따라 연산자의 위치가 달라짐
		 * 
		 * 전위 연산 : ++값, --값		--> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리
		 * 후위 연산 : 값++, 값--		--> 먼저 값을 처리하고 나서 증가하거나 감소
		 * 
		 */
		
		//int num = 10;
		//System.out.println(num);		// 10
		//num++;
		//System.out.println(num); 		// 11
		//num--;
		//System.out.println(num); 		// 10
		//System.out.println(num++); 	// 10
		//System.out.println(num++);	// 11
		//System.out.println(num);		// 12
		
		
		
		int num = 10;
		int number = num++;
		System.out.println("num : " + num);
		System.out.println("number : " + number);
		
		// 1번 113행
		// 1. num이라는 식별자를 가진 int형 변수공간을 할당
		// 2. 정수형 리터럴 값 10
		// 3. 대입 2번을 1번에 대입
		
		// 2번 114행
		// 1. number라는 식별자를 가진 int형 변수공간을 할당
		// 2_1. num이라는 변수공간에 대입된 리터럴 값을 가져옴
		// 2_2. num이라는 변수공간의 값을 1증가
		// 3. 가져온 리터럴 값을 number공간에 초기화
		
		int a = 20;
		int b = a--;
		
		System.out.println("a : " + a);	// 19
		System.out.println("b : " + b); // 20
		
		int c = 20;
		int d = c++ * 3;
		
		System.out.println(c);	// 21
		System.out.println(d);	// 60
		
		int g =10;
		int h = ++g;
		
		System.out.println(g);	// 11	
		System.out.println(h);	// 11
		
		int i = 20;
		int j = ++i * 3;
		
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public void compound( ) {
		
		// = 대입연산자
		// 산술연산자에 대입연산자를 합친 연산자 : 복합 대입 연산자
		// 자기자긴과 해당 산술연산을 수행한 후 그 결과를 자기자신에게 다시 대입하는 용도
		// +=
		// -=
		// *=
		// /=
		// %=
		
		int endDay = 128;
		System.out.println(endDay);
		endDay = endDay -1;
		System.out.println(endDay);
		endDay -= 1;
		System.out.println(endDay);
		
		long veryBigNumberCount = 10000000L;
		
		veryBigNumberCount = veryBigNumberCount + 1278;
		
		veryBigNumberCount += 1278; // 실수할 확률이 줄어들고 가독성이 늘어난다.
		
	}
	
	public void logicalNagation( ) {
		/*
		 * 논리 부정 연산자 : 논리값(true, false)을 반대로 바꿔주는 연산자
		 */
		
		System.out.println(!!!true); 	// !, !!! <- 부정 !! 이거만 쓰면 긍정돼
		
	}
	
	public void comparison() {
		
		/*
		 * 관계 연산자(비교 연산자)
		 * 
		 * 두 개의 값을 가지고 비교하는, 이항 연산자
		 * 비교연산을 한 결과 -> true, false
		 * 특정 조건을 제시할 수 있는 조건문 조건식으로 사용할 것
		 * 
		 * 
		 * 종류
		 * 
		 * 1. 동등비교 : 일치함을 비교
		 * 
		 * a == b : a와 b가 일치합니까?
		 * a != b : a와 b가 일치하지 않습니까? 
		 * 
		 * 2. 대소비교 : 크고 작음을 비교
		 * 
		 * a < b : a가 b보다 작습니까?
		 * a > b : a가 b보다 큽니까?
		 * a <= b : a가 b보다 작거나 같습니까? // = 순서조심 =보다 >, <가 먼저
		 * a >= b : a가 b보다 크거나 같습니까? 
		 * 
		 * 결과값은 true / false
		 * 
		 */
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println(firstNumber < secondNumber);
		System.out.println(firstNumber == secondNumber);
		
		System.out.print("firstNumber가 짝 수 입니까?");
		
		// true가 출력이 되도록 연산을 해야함
		// 나는 무슨값을 가지고 연산을 해야하는가! 	=> firstNumber
		// 무슨 연산을 해야하는가					=> 비교연산
		// 짝수특 ) 2로 나눴을 때 나머지가 0과 같음
		System.out.println(firstNumber % 2 == 0);
		
	}
	
	public void logical() {
		/* 
		 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
		 * 
		 * [ 표현법 ] 
		 * 
		 * 논리값 논리연산자 논리값 => 논리값
		 * 
		 * 종류 
		 * 
		 * 1. AND 연산 : 논리값 && 논리값
		 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 ture
		 *
		 * 2. OR 연산  : 논리값 || 논리값
		 * 좌항과 우항의 값이 하나라도 true일 경우 최종 결과값이 true
		 * 
		 */
		// 계획
		// 1. 사용자에게 한 개의 정수값을 입력받음
		// 2. 입력한 정수 값이(num) 1. 0보다 크면서 2. 짝수인지 연산
		// 3. 그리고나서 결과를 출력 
		
		// 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값을 입력해 주세요 > ");
		int num = sc.nextInt(); // 변수선언 정수값을 받으려면 int야	 , 
		//System.out.println(num);
		
		// 2.
		// 어떤값? num
		// 무슨 연산?
		// 1. 대소비교		-> num > 0
		// 2. 동등비교 	-> num % 2 == 0
		
		// AND연산자 
		// &&의 의미 : 그리고, ~~이면서, ~~이고
		boolean result = (num > 0) && (num % 2 == 0);
		
		System.out.println("입력값이 0보다 크면서 짝수인가요 ? > " + result);
	}
	
	public void andOper() {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("정수 값을 입력해 주세요 > ");
		//int num = sc.nextInt();
		
		//boolean result = (num < 0) && (num % 2 ==0);
		
		//System.out.println("입력값이 0보다 작으면서 짝수인가요 ? > " + result);
		
		// 사용자에게 정수값을 하나 입력받아서
		// 입력받은 정수값을 변수에 대입한 뒤
		// 콘솔창에 출력해보세요
		
		// System.out.println("입력한 정수값 : " + num);
		
		// 사용자가 입력한 정수가 1~10사이의 값인지 확인하기
		
		// 1. 무슨값으로 연산을 해야하지??
		// 1_1. 사용자가 입력한값 => num에 대입해놨어
		// 1_2. 1
		// 1_3. 10
		
		// 2. 무슨 연산??
		// 대소비교 연산
		// 1 <= 사용자가 입력한값 <= 10
		// System.out.print(1 <= num <= 10); 자바는 이게 안됨
		
		//boolean result = (1 <= num) && (num <= 10); // 가독성있게 넘을 중간에
		
		//vSystem.out.println("입력값이 1부터 10사이의 값인가요? >" + result);
		
		
		
	}
	
	public void orOper () {
		// 사용자에게 한 글자를 입력 받아서
		// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("꼭 꼭 꼭 한 글자만 입력해 주세요 > ");
		char letter = sc.nextLine().charAt(0);  //charAt(문자열에서 뽑히는 순서) ex 가나다라 0 = 가 만뜸
		System.out.println(letter);
		// index : 0부터시작
		
		// 1. 무슨값 
		// 1_1. letter
		// 1_2. 'a'
		// 1_3. 'A'
		
		// 2. 무슨연산
		// 동등비교 연산 ==
		// 단일문자의 경우
		// char형이 int형으로 자동형변환이 일어난뒤 연산
		boolean result = (letter == 'a') || (letter == 'A');
		System.out.println("사용자가 입력한 값이 에이인가요? > " + result);
		
		
		
	}
	
	
	/*
	 * 삼항 연산자 : 피 연산자가 3개
	 * => 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 쓰임)
	 * 
	 * [ 표현식 ]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 		   결과값이 true일 경우 첫 번 째 문장을 처리~~
	 * 		   결과값이 false일 경우 두 번째 문장을 처리~~
	 */
	
	// 치킨
	public void triple() {
		System.out.println("깐부치킨에 오신것을 환영합니다!");
		System.out.println("1. 회장님의 입맛 그래도 AI치킨");
		System.out.println("2. 빠싹한 식스팩 치킨");
		System.out.println("3. 치킨의 근본 후라이드 치킨");
		
		// Ctrl + Shift +o (import 자동완성 단축키)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 번호를 입력해 주세요 > "); // 숫자로 유도 다른거 배우기전이라
		int menuNo = sc.nextInt();
		
		// 계획
		// 사용자가 메뉴번호로 
		// 1번을 입력하면 회장님의 입맛 그대로 AI치킨을 주문하셨습니다.
		// 2번을 입력하면 바삭한 식스팩 치킨을 주문하셨습니다.
		// 3번을 입력하면 치킨의 근본 후라이드 치킨을 주문하셨습니다.
		// 1번, 2번, 3번이 아니면 없는 메뉴를 주문하셨습니다.
		// ↑ 이렇게 출력하고 싶음
		// System.out.println(menuNo); // 메뉴가 잘 들어 오는지 확인습관
		
		// 메뉴번호가 1번일 시 AI치킨머시기 나오게하고 1번이 아닐 시 없는 메뉴 입니다 라고 출력
		String selected = menuNo == 1 ? "회장님의 입맛 그대로 AI치킨을 주문하셨습니다." // 이게 삼항 연산자
						: menuNo == 2 ? "빠싹한 식스팩 치킨을 주문하셨습니다." 		 // 삼항연산자에 삼항연산자
						: menuNo == 3 ? "치킨의 근본 후라이드 치킨"				 // 삼항연산자에 삼항연산자 삼항연산자
						: "없는 메뉴를 주문하셨습니다."; // 
		
		System.out.println(selected);
		
		
		
	}
	
	
	
	

}

	























