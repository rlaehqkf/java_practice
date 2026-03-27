package com.kh.chap05.model.service;

import com.kh.chap05.model.vo.Soup;

public class TunaFilter implements SoupFilter {
	// 재료에 참치가 들어가는 김치찌개를 골라줘

	@Override
	public boolean test(Soup s) {
								//contains는 포함이 되어있는가
		return s.getMainMenu().contains("참치");
	}

}
