package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionSwitch {
	
	public void method0() {
		// 스위치문 공부하기!
		Scanner sc= new Scanner(System.in);
		System.out.print("몇 층 가세요?(B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		
		switch(floor) {
		case "B1" : System.out.println("지하 1층입니다. 문이 열립니다.");
		break;
		case "B2" : System.out.println("지하 2층입니다. 문이 열립니다.");
		break;
		case "B3" : System.out.println("지하 3층입니다. 문이 열립니다.");
		}
		
	}
	/*
	 * switch 문
	 * 
	 * [ 표현식 ]
	 * 
	 * switch(case문에 기술할 동등비교 대상) {
	 * case 정수, 실수, 문자, 문자열 : 실행할 코드;
	 * }
	 * 
	 * switch(정수 || 실수 || 문자 || 문자열) {
	 * case 값1 : 실행할코드a; 	// 동등비교 대상 == 값1 true일 경우 실행할코드 a를 수행
	 * break;			    // switch영역(Scope)을 빠져나감
	 * case 값2 : 실행할코드b; 	// 동등비교 대상 == 값2 true일 경우 실행할코드 b를 수행
	 * break;
	 * case 값n : 실핼할코드n; 	// 동등비교 대상 == 값n true일 경우 실행할코드 n을 수행
	 * break;
	 * default : 실행할코드; 	// == else
	 * }
	 */
	
	// 조회하는 프로그램 => 사람이름을 입력하면 정보를 조회해주는 프로그램
	public void findByName( ) {
		
		// 사용자에게 사람이름을 입력받아서
		// 사람의 정보를 출력해줄 것
		
		// 홍길동, 고길동, 짱구, 둘리, 도라에몽
		
		// 고길동	: 남성, 서울특별시 도봉구 쌍문동, 좋아하는 것 : 술, 싫어하는 것 : 둘리 일당
		// 짱구  	: 남성, 서울특별시 초록구 떡잎마을, 좋아하는 것 : 가족, 싫어하는 것 : 피망
		// 둘리	: 수컷, 서을특별시 도봉구 쌍문동, 좋아하는 것 : 장난치기, 싫어한는 것 : 고길동
		// 도라에몽: 없음, 도쿄도 네리마구 츠키미다이, 좋아하는 것 : 노진구, 싫어하는 것 : 쥐
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println(name);
		
		// Ver 1.0
		/*
		switch(name) {
		case "고길동" : System.out.println("남성, 서울특별시 도봉구 쌍문동, 좋아하는 것 : 술, 싫어하는 것 : 둘리 일당 ");
		break;
		case "짱구" : System.out.println("남성, 서울특별시 초록구 떡잎마을, 좋아하는 것 : 가족, 싫어하는 것 : 피망");
		break;
		case "둘리" : System.out.println("수컷, 서을특별시 도봉구 쌍문동, 좋아하는 것 : 장난치기, 싫어한는 것 : 고길동");
		break;
		case "도라에몽" : System.out.println("없음, 도쿄도 네리마구 츠키미다이, 좋아하는 것 : 노진구, 싫어하는 것 : 쥐");
		break;
		default : System.out.println("검색 할 수 없는 이름입니다.");
		}
		*/
		
		// 첫 번째 -> 모던스위치 문법
		String address = switch(name) {
		case "고길동", "둘리" -> "서울특별시 도봉구 쌍문동";
		case "짱구" -> "서울특별시 초록구 떡잎마을";
		case "도라에몽" -> "도쿄도 네리마구 츠키미다이";
		default -> "주소지 없음";
		};
		System.out.println(address);
		
		
		// 두 번째 -> 중복제거하기
		String favorite = "";
		switch(name) {
		case "고길동" : favorite = "술"; break;
		case "짱구" : favorite = "가족"; break;
		case "둘리" : favorite = "장난치기"; break;
		case "도라에몽" : favorite = "노진구"; break;
		default : System.out.println("그런 사람은 존재하지 않습니다.");
		return; // 현재 메소드 영역을 아예 빠져나가는 구문-> 나를 호출한 곳으로 돌아감
		} // break구문을 만나면 빠져나오는 부분
		
		
		//if(name.equals("고길동") && name.eqauls("짱구") ~~~~)
		System.out.println(name + " : " + ", 거주지 : " + address + ", 좋아하는것 : " + favorite);
		
		

		
	} // return구문을 만나는 순간 메소드의 닫는 Scope로 이동
	
	// 전통적인 로그인 기능 구현
	public void login() {
		// 경험이 많음 --> 시간이 해결해주는 일
		
		// 웹사이트 만들기 --> 회원 가입, 로그인, 로그아웃, 정보보고, ㅅ정, 탈퇴, 사진 업로드, 글쓰고 수정하고 지우고, 댓글쓰고 좋아요
		// 구현한다 
		
		
		// 기획 / 설계 -> 뭘 만들지?
		// 설계 -> 어떻게 만들지?
		
		// 로그인 기능 구현 -> 기획은 끝
		// 설계 
		
		// 강사님 개인적인 생각으로는 -> 아주 작은 규모로 실무 경험을 시켜주는것이 목적
		
		// "로그인" -> 만들어보고싶다.
		//    "웹" -> 너무 많음
		// 기능들을 많이 사용 -> 분석				-> 이해
							// 1. 무슨값을?
							// 2. 무슨연산을?
		
		// 로그인이란 뭘까...?
		
		// 아이디, 패스워드 -> 입력
		
		// 로그인 구현 시 필요한 값
		// 1. 사용자가 입력한 아이디 값		-> 문자열
		// 2. 사용자가 입력한 비밀번호 값		-> 문자열
		// 무슨 값을 끝 !
		
		// 로그인을 위해서 필요한 선행작업 : 회원 가입
		// 회원가입은 다음의 정보로 했다고 가정
		String id = "user01";
		String password = "pass01";
		String name = "홍길동";
		
		// 1. 사용자에게 로그인 화면을 출력
		// 2. 사용자에게 아이디와 패스워드를 입력받음
		// 3. 가입 시 입력했던 아이디와 비밀번호를 둘 다 정확히 입력한다면 로그인 성공화면 출력
		// 4. 가입 시 입력했던 아이디와 비밀번호가 하나라도 일치하지 않을 경우 로그인 실패화면 출력
		
		System.out.println("배달의 KH");
		System.out.println("---------------------");
		System.out.println("로그인 서비스 입니다.");
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================");
		System.out.print("아이디를 입력해주세요 > ");
		String userId = sc.nextLine();
		System.out.println("=====================");
		System.out.print("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		
		System.out.println("=====================");
		
		// 만약에 사용자가 로그인 시 입력한 아이디 값(userId)과 회원가입 시 입력한 아이디 값(id)이 동일하고
		// 사용자가 로그인 시 입력한 패스워드 값(userPwd)과 회원가입시 입력한 패스워드 값(password)이 동일하다면
		// 저장소바꾸고 / 유효성검증 / 비밀번호암호화 하면 진짜로그인 만들기 끝
		if(userId.equals(id) && userPwd.equals(password)) {
			System.out.println("로그인 성공~" + name + "님 환영해용~");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		// ↓ 실무에서는 권장하지 않는 방법
		// 어? 나는 아이디가 없는(잘못입력)거면 아이디가 없어요 이렇게 해주고 싶고
		// 비밀번호가 잘못된거면 비번 ㄴㄴ 이렇게 띄워주고 싶은데 ?? 
		
		// 기본자료형 : boolean, char, byte, short, int, long, flat, double
		// => 기본자료형의 경우 동등비교연산자를 사용해서 비교연산을 수행함(==, !=)
		
		// 참조자료형 : 기본자료형의 나머지 전부 
		// => 동등비교연산자(==, !=)를 통해서 값을 비교하는것이 불가능! 
		// 문자열 값을 비교 : equals() => true / false
		// 실젝 변수에 담기는 값이 '주소값'이기 때문
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
