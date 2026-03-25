package com.kh.chap07.controller;

import com.kh.chap07.model.vo.Ticket;
import com.kh.chap07.service.TicketService;

public class TicketController {
	private TicketService ts = new TicketService(); // = 합성
	
	// 프로그램종료까지 살아잇어
	
	
	// 조율자 클래스
	
	public int saveTicket(Ticket ticket) {
		// System.out.println("Controller : " + ticket);
		return ts.saveTicket(ticket);
		
		//이게 순서가 좀 있네 잘 복습해야겟다
		
		// 성공 실패 여부 출력
	}
	
	public Ticket printTicket() {
		// 서비스야 티켓 남는거 있으면 하나만
		Ticket ticket = ts.printTicket();
		return ticket;
	}

	public Ticket[] findAll() {
		Ticket[] tickets = ts.findAll();
		return tickets;
		
	}
	
	
	
	
	
	
	
	
}
