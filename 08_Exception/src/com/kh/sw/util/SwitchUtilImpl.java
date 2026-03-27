package com.kh.sw.util;

import com.kh.model.vo.Switch;
import com.kh.sw.exception.SwitchBoomException;


public class SwitchUtilImpl implements SwitchUtil {

	@Override
	public boolean toggle(Switch s) {
		// 얼씨고 절씨고 만들고싶은걸 구현
		
		s.setOn(!s.isOn());
		// 현재 on의 필드값 => 돌려주기전에 반전을 해주어야함
		boom();
		s.isOn();
		return s.isOn();
	}
	
	/**
	 * 이 메소드는 스위치를 눌렀을 때 폭발 확률을 계산하는 메소드로
	 * 10%확률로 SwitchBoomException이 발생함
	 * 
	 * @author 종로 501 이승철
	 * @since 2026-03-27
	 */
	private void boom() {
		// 90%확률로 아무문제없음
		// 10%확률로 대폭발
		
		int rand = (int)(Math.random() * 100 + 1);
		
		// rand == ( 1 ~ 10 ) ! 100
		if(rand < 11) { // throw 개발자가 직접 예외를 발생시키는 구문
			throw new SwitchBoomException("스위치가 폭발을 일으켰습니다.");
		}
		
	}
	
	

}
