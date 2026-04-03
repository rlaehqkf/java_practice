package com.kh.football.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.football.model.vo.Board;

public class BoardService {
	private List<Board> boards = new ArrayList();
	private int id;
	{




	boards.add(new Board(++id, "첫 글입니다~", "재밌당", "관리자", "1234", 
			new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
	boards.add(new Board(++id, "또 글입니다~", "하하호호", "관리자", "1234",
			new SimpleDateFormat("yyyy-MM-dd").format(new Date())));


}
	
	public List<Board> findAll() {
		return boards;
	}

	
	
	
	
	
	
	
	
	
	
	
}
