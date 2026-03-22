package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {
	
	// 사용자에게 강아지의 정보를 입력받아서
	// 입력받은 강아지의 정보를 출력해주고
	// 강아지와 함께 놀아줄 수 있는 프로그램
	
	public void run() {
		System.out.println("\n\n\n\n\n\n🐕🐕🐕🐕🐕🐕🐕🐕🐕강아지 다마고치🐕🐕🐕🐕🐕🐕🐕🐕🐕");
		/*스캐너 타입의 변수선언*/ Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		
		// String name = sc.nextLine(); 어제였으면 이런식
		
		/* 어제 까지는 배열을 사용해서
		String[] puppyString = new String[3];
		int[] puppyInt = new int[2];
		puppyString[0] = sc.nextLine();
		puppyString[1] = sc.nextLine();
		puppyString[2] = sc.nextLine();
		puppyInt[0] = sc.nextInt();
		puppyInt[1] = sc.nextInt();
		*/
		
		Puppy puppy = new Puppy();
		
		System.out.print("아이구 ~ 강아지가 귀여워요, 이름이 뭐에요? > " );
		puppy.name = sc.nextLine();
		System.out.print("아이구 ~ 무슨 종이예요? > ");
		puppy.species = sc.nextLine();
		System.out.print("아이구 ~ 암컷이예요? 수컷이예요? > ");
		puppy.gender = sc.nextLine();
		System.out.print("아이구 ~ 몇살이예요? > ");
		puppy.age = sc.nextInt();
		System.out.print("아이구 ~ 몸무게가..? > "); 
		puppy.weight = sc.nextInt();
		sc.nextLine(); // nextInt 다음에는 개행문자를 비워두기 위해 적는 습관을 기르자 유지보수를 위해
		
		while(true) {
			
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			// 강아지 이름을 출력해주고 싶음
			System.out.println(puppy.name + "의 정보!"); // 퍼피라는 변수에 대입된 주소값(heap에 객채값)을 참조해서 name이라는 필드값을 호출하고 의정보와 합쳐져서 출력해라
			// 강아지의 나이를 출력하고 싶어
			System.out.println("나이 :" + puppy.age);
			System.out.println("성별 :" + puppy.gender);
			System.out.println("종 : " + puppy.species);
			System.out.println("몸무게 : " + puppy.weight);
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");
			if(puppy.weight > 10 ) {
				System.out.println("※ 운동을 위해 앉길르 추천드립니다!");
			}
			System.out.print("1. 짖기 / 2. 앉기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			sc.nextLine(); // nextInt 다음 
			
			switch(menuNo) {
			case 1 : puppy.bark(); break;         // 메인메뉴의 숫자와 oo(까먹음) 동등 연산
			case 2 : puppy.sit(); break;
			case 3 : return;
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			}
			
			
		
		}
		
	}

}
