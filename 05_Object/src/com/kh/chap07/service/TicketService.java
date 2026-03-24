package com.kh.chap07.service;

import com.kh.chap07.model.vo.Ticket;

public class TicketService {
	/*
	private Ticket firstTicket;
	private Ticket secondTicket;
	private Ticket thirdTicket;
	*/
	private Ticket [] tickets = new Ticket[3];
	
	// 배열
	// 인덱스 개념이 존재, 변수의 나열(메모리의 연속된 공간에 저장), 공간의 크기를 못바꿈
	// 물리구주와 논리구조가 같다, 같은 자료형의 값을 담을 수 있다.
	
	
	
	
	// 사용하는 기술에 따라서 돌려주는 값이 다랄짐
	// 1. 정수값  return1; -> void도 int로 변환
	// 2. 주소값
	
	
							// ticket타입의 값을 받고싶으면 티켓타입을 써야해 
	public int saveTicket(Ticket ticket) {
		
		for(int i = 0; i < tickets.length; i++) {
			if(tickets[i] == null) 
				tickets[i] = ticket;
				return 1;
		}
	}
		
		// 1. 티켓 개수 확인 => 쉬운 방법으로 해버림
		
		// 2. 티켓 개수가 2이하라면 티켓 등록하고 티켓카운트 + 1
		/*
		if(firstTicket == null) {
			this.firstTicket = ticket;
			return 1;
		} else if(secondTicket == null) {
			this.secondTicket = ticket;
			return 1;
		} else if(thirdTicket == null) {
			this.thirdTicket = ticket;
			return 1;
		}*/
		
		/* 2번째 배열을앍나서
		if(tickets[0] == null) {
			tickets[0] = ticket;
			return 1;
		
		}
		if(tickets[1] == null) {
			tickets[1] = ticket;
			return 1;
		}
		if(tickets[2] == null) {
			tickets[2] = ticket;
			return 1;
		}
		
		return 0;
		*/
		
		
		
		
		
	

	
	public Ticket printTicket() {
		
		
		for(int i =0; i < tickets.length; i++) {
			if(tickets[i] != null) {
				Ticket ticket = tickets[i];
				tickets[i] = null;
				return ticket;
		}
			
			
			}
				
		
			
		
		
		// 뷰로부터 시작된 요청이 컨트롤러를 거쳐서 도달함
		// 1. 티켓이 발급된게 있나 없나 확인 후 
		// 2. 발급된게 있으면 티켓의 주소값을 반환해주고
		// 3. 주소값을 담은 필드 비워주기
		// 퍼스트티켓 있나?
		/*
		if(firstTicket != null) {
			Ticket ticket = firstTicket;
			firstTicket = null;
			return ticket;
		} else if(secondTicket != null) {
			Ticket ticket = secondTicket;
			secondTicket = null;
			return ticket;
		} else if(thirdTicket != null) {
			Ticket ticket = thirdTicket;
			thirdTicket = null;
			return ticket;
		}
		*/
		
		}
			
		
		
			
			
		
			
		
		
		
		
		public Ticket[] findAll() {
			return tickets;
		}
				
			

		
			
		
		/*
		if(tickets[0] != null) {
			Ticket ticket = tickets[0]
			tickets[0] = null;
			return ticket;
		} 
		
		
		return null;
		*/
	
	
		
		
		

}
