package com.kh.chap05.view;

import com.kh.chap05.model.vo.Member;

public class MemberView {
	
	public void memberMenu() {
		
		Member member = new Member();
		System.out.println(member.info());
		
		new Member("user01");
		
	}

}
