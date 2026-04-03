package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dao.FootballPlayerDao;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;


 import java.util.Objects;

 
// 축구선수를 저장된걸 가지고 얼시고절시고
public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기때문에 Service단에서 저장
	private List<FootballPlayer> list = new ArrayList();
	private int id; {
	FootballPlayer fp = new FootballPlayer(++id, "1", "2", 3);
	

		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날두", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필드", 10));
		
	}
	
	public FootballService() {
		
	}
	
	public void save(String name, String position, int number) {
		list.add(new FootballPlayer(++id, name, position, number));
	}
	
	// 뷰가 축구선수들 정보를 출력하기위해서 건너건너 옴
	public List<FootballPlayer> selectAll() {
		return list;
		
	}
	
	// 뷰가 축구선수를 추가하기 위해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		// 비지니스 로직 == 의사결정코드
		// 1. 이름이 두 글자 이상
		// 2. 포지션은 공격수/미드필더/수비수/골키퍼
		// 3. 등번호는 0이상
		fpd = null;
		
		/*	
		
		if(fpd !=null && fpd.getName().length() >= 2 ) {
			
			// 아하 fpd가 정상적으로 돌아오지 못했다면
			// NullPointException이 발생할 수 있겠구나!!
			if("공격수".equals(fpd.getPosition()) ||
			fpd.getPosition().equals("공격수") || 
			fpd.getPosition().equals("미드필더") || 
			fpd.getPosition().equals("수비수") ||
			fpd.getPosition().equals("골키퍼")) {
			 if(fpd.getBackNumber() >= 0) {
				 
				 // 변수 조건문 반복문 이 3개로 코드를 만든다
				 
				 // 기능 구현시 
				 // 어떻게 써야 할지 모르겠어요.
				 // 뭘 써야 할지 모르겠어요.
				 // 시작을 못함! => 부담감 => 코드를 잘써야해!
				 // => 나는 완벽한 무언가를 만들어내야한다.
				 // 사지선다 : 출력문 / 변수 / 조건문 / 반복문
				 // 많이치세요.
				 // 값에 대한 유효성검증 == validate
				 list.add(new FootballPlayer(++id, fpd.getName(),
						 fpd.getPosition(), fpd.getBackNumber()));
				 return list.get(list.size() -1);
				 
				 
			 }
				
			}
			
		}
		*/
			if(validateFootballPlayer(fpd) ) {
				list.add(new FootballPlayer(++id, fpd.getName(),
						 fpd.getPosition(), fpd.getBackNumber()));
				 return list.get(list.size() -1);
			}
			return null;
		
				
		
	}
	
	public boolean idCheck(int id) {
		// 여기서 뭐해요?
		// 첫 번째 요소 비교해봐야지
		
		
		if(list.get(1).getId() == id) {
			return true;
		}
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return true;
		}
	}
		return false;
		
		
	}
	
	
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		
		// 리스트에서 일치하는 id를 찾아서
		// 인덱스값을 추출한 뒤
		// DTO객체의 필드값으로 VO 객체를 새로 생성하면서
		// list의 set메소드로 기존의 주소값을 변경해준다.
		
		// id값을 가지고 list를 순회해서
		// 동일한 id값을 가진 FootballPlayer의 index를 알아내야함
		
		/*
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				// 3이라고 입력했을 시 세번째 바퀴에 이프문에 들어옴
				index = i;
				break;
		} 
			
			
		}
		*/
		int index = indexOf(id);
		
		// 유효성검사
		boolean result = validateFootballPlayer(player);
		
		if(result) {
			list.set(index, new FootballPlayer(id, player.getName(),
					player.getPosition(), player.getBackNumber()));
		}
	}
	
	
	private int indexOf(int id) {
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				// 3이라고 입력했을 시 세번째 바퀴에 이프문에 들어옴
				index = i;
				break;
		} 
			
			
		}
		return index;
	}
	
	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		if(index != -1) {
			return list.remove(index).getName();
	}
  
	return null;


}
	
	private boolean validateFootballPlayer(FootballPlayerDto fpd) {
		if(fpd != null && fpd.getName().length() >= 2 ) {
			if("공격수".equals(fpd.getPosition()) ||
			fpd.getPosition().equals("공격수") || 
			fpd.getPosition().equals("미드필더") || 
			fpd.getPosition().equals("수비수") ||
			fpd.getPosition().equals("골키퍼")) {
			 if(fpd.getBackNumber() >= 0) {
				 return true;
				 
				 
				 
				 
			 }
				
			}
		
		
	}
		return false;
	
	
	}
	
	public void outputFootballPlayer() {
		new FootballPlayerDao().outputFootballPlayer(list);
		
	}
	
	public List<FootballPlayer> findBykeyword(String keyword) {
		// 검색 = 찾아
		// 사용자가 입력한 keyword가 포함된 FootballPlayer의 name필드값을 
		// 하나하나 순회하면서 전부다 검사를해서 만약에 name필드값에
		// 사용자가 입력한 keyword가 포함되어있다면 이 VO 객체의 주소값을
		// 전부다 View로 반환 해주어야하는데
		// 이게 하나도 없을 수도 있는데 엄청 많을 수도 있음
		// 검색결과가 == 1개일 수 있음
		// 검색결과가 == 2개일 수 있음
		// 검색결과가 == 0개일 수 있음
		// 검색결과가 == 알 수 가 없음
		// 저장소 == 배열[], 	List, 	Map, 	Set
		//		X(몇갠지몰라),  O  ,   애매,	
		
		// boolean result = list.get(0).getName().contains(keyword);
		// System.out.println(result);
		
		List<FootballPlayer> searched = new ArrayList();
		
		for(FootballPlayer player : list) {
			if(player.getName().contains(keyword)) {
				searched.add(player);
			}
			
	}
	
	return searched;
	
	
	
	}
	
	}
	
	
	
	

