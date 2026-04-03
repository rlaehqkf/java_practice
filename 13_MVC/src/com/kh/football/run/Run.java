package com.kh.football.run;

import com.kh.football.model.service.FootballService;
import com.kh.football.view.FootballView;

public class Run {

	public static void main(String[] args) {
		// MVC패턴(Model - View - Controller)
		// 애플리케이션의 구조를 세가지 요소로 분리
		// 라는 소프트웨어 아키텍쳐 디자인 패턴
		
		// 1. Model => 데이터담당
		// VO => 값을 담당	
		// DAO => 데이터를 외부매체와의 상호작용
		// Service => 비즈니스로직
		// DTO => 데이터 전송용도
		// Entity => 테이블과의 매핑
		
		// 2. View => 사용자 인터페이스 담당
		// 사용자에게 정보 표시 / 사용자의 입력값을 받음
		// 모델에서 만들어진 데이터를 시각적으로 표현
		// 모델과 직접 상호작용하지 않음
		
		// 3. Controller
		// Model하고 View의 중간다리 역할
		// 사용자가 View에서 입력한 값을 Model에 전달
		// Model에서 일어난 처리작업 결과를 View로 반환
		
		
		// 축구선수 CRUD 구현
		// Create(생성) : View에서 만들어진 데이터를 축구선수모양으로 만들고 저장
		// Read(조회)   : 저장되어있는 축구선수 들을 조회해서 출력
		// Update(수정) : 저장되어있는 축구선수들의 값을 갱신
		// Delete(삭제) : 저장되어있는 축구선수의 데이터를 삭제
		
		
		// 악세사리
		// 이벤트 
		// 공지사항(C : 게시글작성, R : 게시판, U : 게시글수정, D : 게시글삭제)
		// 회원(C : 회원가입, R : 마이페이지(내정보조회), U : 내정보수정, D : 회원탈퇴)
		/*
		 * 회원의 C를 구현해야겠다.
		 * 
		 * 아이디, 비밀번호, 전화번호, 이메일
		 * public class Member MemberVo {
		 *  private String userId;
		 *  private String userpwd;
		 *  private String phoneNumber;
		 *  private String email;
		 * }
		 * 
		 * 공지사항의 C를 구현해야겠다.
		 * 
		 * 게시글의 제목, 게시글의 내용, 게시글 작성자, 카테고리
		 * public class NoticeVo {
		 *  private String title;
		 *  private String content;
		 *  private String writer;
		 *  private String category;
		 * }
		 * 
		 */
		// new FootballService();
		
		new FootballView().mainMenu();
		
		
		
		
		
		
		
		
		
	}

}
