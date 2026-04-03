package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Sandwich;

public class Run {

	public static void main(String[] args) {
		// Map
		// Key + Value 세트로 저장          키는 중복되면안돼 밸류는 상관없어
		
		// HashMap
		
		// 키	=> 식별자 => 샌드위치 이름
		// 밸류	=> 샌드위치 객체
		
		Map<String, Sandwich> subway = new HashMap();
		// 비어있는 맵에 요소를 추가해보기~~
		
		// HashMap -> put()	
		// key + value 함께 요소로 추가해야함
		
		// put(K key, V value) : Map에 key + value세트로 요소추가하기
		subway.put("에그마요", new Sandwich("담백한맛", "에그랑 마요"));
		subway.put("K-바비큐", new Sandwich("자극적인맛", "풀드포크바비큐"));
		subway.put("스파이시쉬림프", new Sandwich("매콤한맛", "쉬림프"));
		// 순서보장 X
		
		System.out.println(subway);
		subway.put("매콤쉬림프", new Sandwich("매콤한맛", "쉬림프")); // Value값의 경우 중복저장 O
		System.out.println(subway);
		subway.put("매콤쉬림프", new Sandwich("매운맛", "쉬림프"));
		System.out.println(subway); // key == 식별자 --> 중복이 발생하면 덮어씌움
		
		// 2. get(Object key) : Object
		// 인자로 전달된 Key값에 해당하는 value값을 반환해주는 메소드
		// key로 value를 찾아옴
		
		System.out.println(subway.get("매콤쉬림프"));
		System.out.println(subway.get("에그마요"));
		System.out.println(subway.get("없는거")); // 없는 key값 전달 시 null을반환
		
		System.out.println(subway.size());
		System.out.println(subway.isEmpty());
		
		// replace(K key, V value) : Key로 요소를 찾아서 Value값을 치환해줌
		subway.replace("에그마요", new Sandwich("아주맛있는맛", "에그랑마요"));
		
		subway.replace("없는거", null);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않음! put과의 차이점
		
		System.out.println(subway);
		
		// remove(Object key) - > key값을 이용해서 key + value세트로 지워주는 메소드
		subway.remove("K-바비큐");
		
		System.out.println(subway);
		
		System.out.println("=======================================");
		
		// Map에 들어있는 모든 요소들에 순차적으로 접근해야 한다면??
		// addAll(Collection c) => X 컬렉션을 상속받지 않아서 불가능
		// for loop문 X, while X, for X, Iterator X
		
		subway.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		// ============================================
		// ============================================
		// Map이 Key - Value를 세트로 가지고있음
		// Key값들만 Set으로 바꿔줘야함 -> Set으로 바꾸면 Iterator를 사용가능
		
		// 1) Map의 Key만들만 Set으로 만들기
		Set<String> subSet = subway.keySet();
		// System.out.println(subSet); 키들만 담겨져있어
		// 2) Set을 Iterator로 변경
		Iterator<String> itKey = subSet.iterator();
		// 3) 반복문 사용하기
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + "===" + subway.get(key));
		}
		
		// entrySet()
		Set<Entry<String, Sandwich>> entrySet = subway.entrySet();
		
		
		
		
		
		
	}

}
