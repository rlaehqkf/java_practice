package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

// 시각적인 부분, 화면 입/출력
// HTML CSS 안배워서 어쩔수없이 여기다 씀
public class FootballView {
	private Scanner sc = new Scanner(System.in);
	private FootballController fc = new FootballController();
	private BoardView bv = new BoardView();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 축구선수 CRUD
		// CREATE : 사용자에게 축구선수의 이름, 포지션, 등번호를 입력받아 저장
		// READ : 만들어진 축구선수들을 조회
		// UPDATE : 기본에 존재하는 축구선수의 정보를 수정
		// DELETE : 기존에 존재하는 축구선수의 정보를 삭제
		
		
		while(true) {
			System.out.println();
			System.out.println("축구선수 관리 프로그램입니다.");
			System.out.println("1. 축구선수 전체 조회하기");
			System.out.println("2. 축구선수 추가하기");
			// 리스트에 풋볼플레이어를 추가하자	<-- 아직 방법이 없기 때문에
			// 사용자가 입력한 값을 저장소에 저장
			System.out.println("3. 축구선수 수정하기");
			System.out.println("4. 축구선수 삭제하기");
			// 축구선수 id 받아서 한명만 지우기
			// 축구선수 검색하기, 축구선수 목록 파일로 저장하기 
			System.out.println("5. 축구선수 정보 파일로 출력하기");
			System.out.println("6. 축구선수 검색하기");
			System.out.println("7. 축구 이야기 게시판");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("어떤 기능을 이용하시겠어요 > ");
			int menu = 0;
			
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요. ");
				sc.nextLine();
				continue;
			} 
			switch(menu) {
			case 1 : selectAll(); break;
			case 2 : addFootballPlayer(); break;
			case 3 : updateFootballPlayer(); break;
			case 4 : deleteFootballPlayer(); break;
			case 5 : fc.outputFootballPlayer(); break;
			case 6 : findFootballPlayer(); break;
			case 7 : bv.boardMenu(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); sc.close(); return;
			default : System.out.println("없는 메뉴 입니다. 다시 선택해주세요.");
			}
			
			
			
		}
		
		
	}
	
	
	private void save() {
		
		System.out.println("이름 > ");
		String name = sc.nextLine();
		System.out.println("포지션 > ");
		String position = sc.nextLine();
		System.out.println("등번호 > ");
		int Number = sc.nextInt();
		
		FootballController fc = new FootballController();
		
		fc.save(name, position, Number);
		
	}
	
	
	
	
	
	private void nextLine(Scanner sc) {
		sc.nextLine();
	}
	
	// 선수들의 정보를 출력해주는 기능
	private void selectAll() {
		// 사용자에게 값 입력받기 X, 모델에서 만든 값 출력하기
		
		List<FootballPlayer> list = fc.selectAll();
		
		// list의 필드로 있는 배열의 인덱스에 있는 VO의 주소값을 참조해서 필드 값을 출력
		/*
		String name = list.get(0).getName();
		String position = list.get(0).getPosition();
		Integer backNumber = list.get(0).getBackNumber();
		
		System.out.println("선수의 정보 : ");
		System.out.println("이름 :" + name);
		System.out.println("포지션 : " + position);
		System.out.println("등번호 : " + backNumber);
		*/
		if(!list.isEmpty()) {
			// 축구선수가 최소한 한 명은 있다.
			System.out.println("선수들의 정보를 확인하세요!");
			System.out.println();
			for(FootballPlayer fp : list) {
				System.out.println("선수의 정보 : ");
				System.out.println("-----------------");
				System.out.println("아이디 : " + fp.getId());
				System.out.println("-----------------");
				System.out.println("이름 : " + fp.getName());
				System.out.println("-----------------");
				System.out.println("포지션 : " + fp.getPosition());
				System.out.println("-----------------");
				System.out.println("등번호 : " + fp.getBackNumber());
				System.out.println("-----------------");
				System.out.println();
				
				
				
			}
			
		} else {
			// 축구선수가 한 명도 없다.
			System.out.println("========================");
			System.out.println("아직 선수가 존재하지 않습니다.");
			System.out.println("새로운 선수를 추가해보세요!");
			System.out.println("금액은 무료입니다!!");
			System.out.println("========================");
			
		}
		
		
		
	}
	
	
	private void addFootballPlayer() {
		// 여기서 해야할 일은 무엇인가요?
		
		// 뷰가 해야할 일
		
		// 1. 사용자의 입력값 받기
		// 2. 모델에서 만든 값 출력하기
		
		// 무슨 값을 입력받아야하지?
		// 축구선수를 만들 수 있는 값들  필드의 자료형과 똑같은지 봐야해
		// 선수이름 : String, 포지션 : String, 등번호 : Integer
		System.out.println();
		System.out.println("선수의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println("선수의 포지션을 입력해주세요 > ");	
		String position = sc.nextLine();
		System.out.println("선수의 등 번호를 입력해주세요 > ");
		int backNumber = 0;
		// 1. int가 짧으니까
		// 2. Integer는 정수값이 아닌게 들어올 수 있으니까
		// 3. 서비스단에서 검증이 null인지도 체크를 해야하고 + 음수가 아닌지도 체크를
		
		try {
			backNumber = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("등 번호는 숫자만 입력이 가능합니다.");
			return;
			
		}
		
		// 사용자의 입력값 받기 끝! -> 뷰가 할 일 1절 끝
		// case 1) 100%성공이니까 걍 추가하고 끝내기 
		// case 2) 성공 실패 여부를 판별해서 성공했다 실패했다 문자열 출력해주기
		// case 3) 추가 성공시 추가된 데이터 출력해주기 실패시엔 성공했다 말해주기 ★
		
		// 3개의 값을 넘기는데 너무 번거로워
		// 1. FootballPlayer VO 탈락 ==> 생성자 인자값 부족 
		// 2. ArrayList O 			==> 인덱스를 알아야함
		// 3. HashMap 				==> <String, Object>
		// 4. Object[]				==> 이거쓸바에 리스트씀
		
		FootballPlayer fp = fc.addFootballPlayer(new FootballPlayerDto(name, position, backNumber));
		
		// 성공 / 실패 여부를 판별 한 뒤
		// 각각 맞는 출력문을 작성
		if(fp != null) {
			selectAll();
		} else {
			System.out.println("선수 등록에 실패했습니다.");
			System.out.println("관리자에게 문의하세요.");
		}
		
		
		
		
	
		
		
		
	}
	
	
	private void updateFootballPlayer() {
		
		
		// 이름만 바꾸는 기능
		// 포지션만 바꾸는 기능
		// 등번호만 바꾸는 기능
		
		// 이름하고 포지션만 바꾸는 기능
		// 이름하고 등번호만 바꾸는 기능
		// 포지션하고 등번호만 바꾸는 기능
		
		// 이름하고 포지션하고 등번호르 바꾸는 기능 ★
		
		// 선수를 어떻게 식별할 것인가?
		// 이름이 일치하면
		// 포지션이 일치하면
		// 등번호가 일치히면
		
		// 이름과 포지션이 일치하면
		// 포지션과 등번호가 일치하면
		// 이름과 등번호가 일치히면
		
		// 이름과 포지션과 등번호가 일치하면
		// ID값이 일치하면 ★
		
		selectAll();
		System.out.println("어떤 순수의 정보를 갱신하시겠습니까?");
		System.out.println("선수의 아이디를 숫자로 입력해 주세요 > ");
		/* 
		try {
			int id = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {}
		
		// 1. 아이디
		// 2. 이름, 포지션, 등번호
		// 
		
		try {
		int backNumber = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {}
		*/
		try {
			int id = Integer.parseInt(sc.nextLine());
			
			// 1. 입력받은 아이디 값을 가지고 서비스까지가서 id가 있는지 확인
			//    있으면 아래코드 수행 없으면 return해버리기
			// 1_1) 이미 우리는 축구선수주소 가지고있는 List의 주소를 반환받는 
			// 		메소드를 구현 => Service
			//		Service메소드를 호출해서 반환받아서 여기서 검사
			
			// 1_2) id값을 들고 서비스까지 가서 서비스에 검증 로직 작성
			// 		아이디가 있나 없나 검증하는 코드는 1_2가 더 적합
			
			fc.idCheck(id);
			boolean result = fc.idCheck(id);
			
			if(!result) {
				System.out.println("존재하지 않는 아이디 입니다.");
				return;
			}
			
			
			// 2. 입력받은 id값이 있던지 없던지 그냥 다 받아버리기
			// 	  그리고 서비스가서 있는지 없는지 판별 후 작업 수행
			
			
			
			// 오답은 명확하게 존재
			// 정답은 X => BestPractice O
			System.out.println("변경하실 이름을 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.println("변경하실 포지션을 입력해주세요 >");
			String position = sc.nextLine();
			System.out.println("변경하실 등번호를 입력해주세요 > ");
			int backNumber = Integer.parseInt(sc.nextLine());
			
			// 삼총사 받은내용
			// Update 시 새로운 FootballPlayer를 만들어서 넣어주어야 하는데
			// id값을 기존의 id값으로 유지할 것인가
			//		 새로운 id값으로 만들어서 넣어줄것인가
			fc.updateFootballPlayer(id, new FootballPlayerDto(name, position, backNumber));
			
			
			
			
		} catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		}
		
		
		
		
	}
	
	private void deleteFootballPlayer() {
		
		System.out.println();
		System.out.println("등록된 축구선수를 해지하겠습니다.");
		selectAll();
		System.out.print("어떤 선수를 해지하시겠습니까 아이디를 입력해주세요 > ");
		int id = 0;
		
		try {
			id = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("아이디값은 숫자만 입력 가능합니다.");
			sc.nextLine();
			return;
		}
		// 우리가 선수삭제해서 해야할 작업
		// 사용자가 -1 <-- 유효성 검증 --> 패스(숙제)
		
		
		// 구현하는 방식
		// 1. id를 들고가서 index를 가져와서 index를 전달해서 한번에 리무브
		// 2. id를 들고가서 서비스에서 반복을돌려서 찾아서 리무브
		String result = fc.deleteFootballPlayer(id);
		
		if(result != null) {
			System.out.println(result + " 선수의 정보가 삭제되었습니다!");
		} else {
			System.out.println("id를 찾을 수 없습니다.");
		}
		
		
	}
	
	
	private void findFootballPlayer() {
		
		System.out.println("선수 검색 서비스입니다.");
		// 사용자에게 이름을 받아서
		// 똑같은 이름의 선수 다 찾기
		// 입력값이 이름에 포함되어 있는 선수 찾기
		
		System.out.println("찾고 싶은 이름의 키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		// 컨트롤로에게 요청
		List<FootballPlayer> players = fc.findBykeyword(keyword);
		// 응답이 돌아온 상태
		// 경우의 수
		// 검색결과가 있을 수도 있음 / 검색결과가 없을 수도 있음
		// 검색결과가 한 개일 수 도 있음 / 검색결과가 백 개일 수 도 있음
		
		if(players.isEmpty()) {
			System.out.println("=========================");
			System.out.println("검색결과가 존재하지 않습니다.");
			System.out.println("=========================");
			
		} else {
			System.out.println();
			System.out.println(keyword + "검색 결과 입니다.");
			for(FootballPlayer player : players) {
				System.out.println("이름 : " + player.getName() 
									+", 포지션 : " + player.getPosition()
									+", 등번호 : " + player.getBackNumber());		
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
