package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 자바의 컬렉션(Collection Framework)
		 * 
		 * 추상적자료형(Abstract Date Type) => Interface
		 * +
		 * 구현체 => Class
		 * +
		 * 알고리즘 => method
		 * ==========================================
		 * 배열과 컬렉션의 차이점
		 * 
		 * - 배열의 아주 쬐끔 불편한 점
		 * 
		 * 1. 배열을 사용하려고하면 무조건 크기 할당을 해야함 => 한 번 지정된 크기는 못바꿈
		 * 2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀거나 땡기는 코드를 써야함
		 * 
		 * - 컬렉션
		 * 1. 크기의 제약이 자유로움
		 * => 처음에 컬렉션을 사용할 때 크기를 지정하지 않아도 사용할 수 있음
		 * => 만약 요소가 추가되면서 크기를 넘어서는 상황이 발생하면 알아서 확장됨
		 * 2. 중간에 요소를 추가하거나 삭제하는 경우 기존값을 밀거나 땡기는 코드가 이미 구현되어있음
		 * => 그때그때 필요한 메소드를 호출해서 사용하면됨
		 * 
		 * - 중립
		 * - 배열의 경우 같은 타입의 자료형만 사용할 수 있음
		 * - 컬렉션의 경우 여러 타입의 데어터들을 사용할 수 있음 : 같은 타입의 데이터만 묶어서도 사용가능
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져있고, 조회의 목적 => 배열
		 * 데이터들의 추가, 수정, 삭제가 빈번하게 일어난다 => 컬렉션
		 * 
		 * 개념적인 컬렉션의 종류
		 * 
		 * - List 계열 : 다루려고하는 값(Value)만 저장 / 저장 시 순서 유지(Index, 중복값 허용)
		 * 				=> LinkedList, ArrayList, Vector...
		 * 				-> ArrayList
		 * -Set 계열 	  : 다루려고하는 값(Value)만 저장 / 저장 시 순서 유지 X, 중복값 허용 X
		 * 				=> TreeSet, HashSet..
		 * 				-> HashSet
		 * 
		 * - Map 계열  : 키(Key) - 값(Value) 세트로 저장 / 저장 시 순서 유지 X, 키 중복 X / 값 중복O
		 * 				=> HashMap, TreeMap, MultiValueMap..
		 * 				-> HashMap
		 * 
		 * 
		 */
		
		// ArrayList
		// ArrayList 생성방법
		// ArrayList 식별자 = new ArrayList(); => 기본 크기 10칸
		// ArrayList 식별자 = new ArrayList(정수); => 크기가 정수값으로 정해짐
		
		ArrayList plants = new ArrayList(3); // 3칸짜리 리스트를 구현하겠다.
		Plant[] plantss = new Plant[3];
		
		// System.out.println(plantss);
		// System.out.println(plants);
		
		plantss[0] = new Plant("서양란", "호접란");
		plantss[1] = new Plant("동양란", "황룡관");
		plantss[2] = new Plant("관엽", "금전수");
		// plantss[3] = new Plant("꽃, 개나리");
		System.out.println(Arrays.toString(plantss));
		
		// plants.add(1); 못들어가 이건 
		plants.add(new Plant("서양란", "호접란"));
		// 자바에서 메소드 호출시 전달할 수 있는 것은 오로지 값
		plants.add(new Plant("동양란", "황룡관"));
		plants.add(new Plant("관엽", "금전수"));
		// plants.add(new Plant("꽃", "벛꽃"));
		plants.add("식물 끝!");
		System.out.println(plants);
		
		// 기존 Object[]의 크기를 넘어서는 요소를 추가할 경우
		// System.arraycopy 메소드를 호출해서 깊은 복사로 더 큰 배열을 할당함
		// Object 타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트에 요소로 사용할 수 있음
		// LinkedList list;
		
		// add메소드 오버로딩 엄청 잘돼있음!!
		// add(int index, E e) : List의 index에 전달한 요소를 추가
		plants.add(0, "식물 시작~");
		plants.add(3, new Plant("관엽", "홍콩야자"));
		System.out.println(plants);
		// 중간 위치에 요소를 추가했을 때 기존 요소를 한 칸씩 뒤로 밀어주는 코드가 구현되어있음
		
		// 2. 요소를 수정하는 메소드
		//				E = 엘리먼트 요소라는뜻	
		// set(int index, E e) : List의 index위치에 값을 전달한 요소(e)로 set해주는 메소드
		plants.set(0, "시이잉이작!");
		System.out.println(plants);
		
		// 3. 요소 삭제
		// remove(int index) : List의 index위치에 담긴 요소를 삭제하는 메소드
		plants.remove(0);
		// plants.remove(5);
		// IndexOutOfBoundsException == index값을 잘 고려해서 인자값을 전달해야함
		
		
		Object[] obj = new Object[3];
		obj[0] = "식물이당";
		obj[1] = new Plant("식물", "마법주머니");
		obj[2] = new ArrayList();
		
		String start = (String)obj[0];
		System.out.println(start);
		// Map
		
		String end = (String)plants.remove(4);
		System.out.println(end);
		System.out.println("\n\n\n\n\n\n\n\n\nn\n\n");
		
		// 4. 리스트의 크기를 반환받기
		// size() : 리스트에 담겨있는 요소의 ㅐㄱ수
		System.out.println(plants.size());
		
		// 5. List의 해당 index 위치에 담긴 요소를 반환받는 메소드
		// get(int index) : E
		System.out.println(plants);
		Plant p = (Plant)plants.get(0);
		System.out.println(p);
		
		
		// 2번 인덱스에 위치한 식물의 타입 값을 스트링형 변수에 대입해서 활용하고 싶음
		String hongkongTree = ((Plant)plants.get(2)).getType();
		System.out.println(hongkongTree);
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("식물종류 : " + ((Plant)plants.get(i)).getName());
		}
		
		for(Object plant : plants) {
			System.out.println(plant.toString()); // 동적바인딩
		}
		
		// 6. 리스트 자르기
		// subList(int index1, int index2) : List
		// index1부터 index2 까지의 요소를 추출해서 새로운 리스트를 반환
		List sub = plants.subList(0, 2);
		System.out.println(sub);
		
		// 7. 리스트에다가 요소를 왕창 추가하기
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소을 몽땅 추가해주는 메소드
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값(Value)이 중복될 수 있음
		
		// 8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드 ☆
		// isEmpty() : 리스트에 요소가 존재하지 않는다면 ture / 하나라도 있다면 false
		System.out.println(plants.isEmpty());
		
		plants.clear();
		
		System.out.println(plants);
		System.out.println(plants.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
