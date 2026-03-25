package com.kh.chap03.run;

import com.kh.chap03.model.vo.KaKaoWebtoon;
import com.kh.chap03.model.vo.NateWebtoon;
import com.kh.chap03.model.vo.NaverWebtoon;
import com.kh.chap03.model.vo.Webtoon;

public class Run {

	public static void main(String[] args) {

		Webtoon webtoon = new Webtoon("화산귀환", "LICO", "수요일");
		NaverWebtoon nw = new NaverWebtoon("전지적독자시점", "UMI", "수요일", "현금");
		KaKaoWebtoon kw = new KaKaoWebtoon("수린당성군전", "일링스", "수요일", "자유", true);
		
		/*
		System.out.println(webtoon.info());
		System.out.println(nw.info());
		System.out.println(kw.info());
		*/
		
		System.out.println(webtoon);
		System.out.println(webtoon.toString()); // toString 주소값이라하는데 주소값은아니야
		// toString() : 해당 객체의 FullClassName + "@" + 해당 객체의 주소값을 16진수 형태로 변환 : String
		// 모든 클래스는 Object클래스를 상속받고 있기 때문에
		// 모든 객체는 toString()를 호출 할 수 있음 
		//				()	= 메소드
		
		System.out.println(nw);
		System.out.println(kw);
		
		NateWebtoon nwt = new NateWebtoon("재미있는 웹툰", "작가");
		System.out.println(nwt);
		
		
	}
	
	

	
	
	

}
