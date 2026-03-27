package com.kh.chap04.model.service;

public interface CookingSkill { // 계약서
	// 이행의무사항 : 	이 계약서에 서명을 하는 순간 계약서에 명시된 모든 계약사항을 수행해야함
	// 			  	이 인터페이스를 구현하는 모든 클래스는 반드시 명시된 모든 메소드를 구현해야함
	
	int NUM = 2;
	
	// 명세
	// 무엇을 해야한다만 적혀있음, 어떻게 해야하는지는 안 써있음
	void makeDopbap();
	
	
	
}
