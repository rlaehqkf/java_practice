package com.kh.chap01.run;

import com.kh.chap01.model.vo.AosGame;
import com.kh.chap01.model.vo.FpsGame;
import com.kh.chap01.model.vo.RpgGame;

public class Run {

	public static void main(String[] args) {
		
		// RPG
		// gameName, publisher, maxLevel
		RpgGame rg = new RpgGame("와우", "블리자드", 80);
		
		// AOS
		// gameName, publisher, characterCount
		AosGame ag = new AosGame("롤", "라이엇", 172);
		
		// FPS
		// gameName, publisher, stress
		FpsGame fg = new FpsGame("배틀그라운드", "크래프톤", 100);
		
		System.out.println(rg.info());
		System.out.println(ag.info());
		System.out.println(fg.info());
		
		
		/*
		 * 상속의 아주 ☆★이론적인 이야기★☆
		 * 
		 * 클래스들마다 중복된 코드들을 전부다 하나하나 기술하다보면
		 * 코드를 수정하거나 추가하는 유지보수시 전부 한땀한땀 고쳐야하는 어려움이 있음
		 * 
		 * 
		 * 상속이라는 개념을 적용하면 
		 * 매 클래스마다 중복된 필드, 메소드들을
		 * 단 하나의 클래스로 만들어두고(정의를 해두고)
		 * 해당 클래스를 상속받아서 중복을 없앨 수 있음
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
	}

}
