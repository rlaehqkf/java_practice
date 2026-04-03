package com.kh.football.functional.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.kh.football.functional.model.dto.Material;
import com.kh.football.functional.model.service.BinFilter;
import com.kh.football.functional.model.service.RedFilter;

public class Run {

	public static void main(String[] args) {
		List<Material> bin = new ArrayList(List.of(new Material("건두부", 1000, "흰색"),
				new Material("새우완자", 3000, "빨간색"), 
				new Material("청경채", 1500, "초록색"),
				new Material("분모짜", 4000, "흰색"),
				new Material("소고기", 10000, "빨간색"),
				new Material("옥수수면", 3500, "노란색")));
		
		// 마라탕이 재료가 너무 많으니까 필터로 좀 걸러내자
		BinFilter bf = new RedFilter();
		for(Material m : bin) {
			if(bf.test(m)) {
				System.out.println(m.getName());
					
				}
			}
		
		// 2천원 이상 필터? 클래스 만들어
		// 초록색 걸러내는 필터? 클래스 만들어
		// 만원 이상 필터? 클래스 만들어
		
		// 익명클래스
		BinFilter yellowFilter = new BinFilter() {
			@Override
			public boolean test(Material m) {
				return m.getColor().equals("노란색");
			}
		};
		
		for(Material m : bin) {
			if(yellowFilter.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		BinFilter greenFilter = m -> 
				 m.getColor().equals("초록색");
			
		
		for(Material m : bin) {
			if(greenFilter.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		// 람다 문법 외워서쓰는거
		BinFilter expensiveFilter = m -> m.getPrice() >=3500;
		for(Material m : bin) {
			if(expensiveFilter.test(m)) {
				System.out.println(m.getPrice());
			}
		}
		
		// Predicate<T> - 판별 T(타입 아무거나) -> boolean
		Predicate<Material> isRed = m -> m.getColor().equals("빨간색"); // getColor 왜 안돼
		for(Material m : bin) {
			if(isRed.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		// Function<T, R> - 변환 T(아무거나) -> R(리턴타입)
		// 재료 객체를 받아서 재료객체의 이름을 반환
		Function<Material, String> getName = m -> m.getName();
		
		System.out.println(getName.apply(new Material("돼지고기", 5000, "빨간색")));
		
		// Consumer<T> - 소비 T(타입아무거나) -> void
		Consumer<Material> print = m -> System.out.println(m.getName());
		print.accept(new Material("양고기", 8000, "빨간색"));
		
		// Supplier<T> - 공급
		Supplier<Material> defaultM = () -> new Material("닭고기", 4000, "빨간색");
		Material chicken = defaultM.get();
		
		// 재료들이 많다. 재료들의 이름만 사용
		
		// 4000원 넘는 첫 번ㅉㅐ 재료찾기
		Material found = bin.stream()
							.filter(m -> m.getPrice() > 4000)
							.findFirst()	
							.orElse(null);
		System.out.println(found);
		
		
		
		
		
		
		
	}

	

}
