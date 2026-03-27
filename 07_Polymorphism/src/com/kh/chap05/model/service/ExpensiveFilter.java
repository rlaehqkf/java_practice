package com.kh.chap05.model.service;

import com.kh.chap05.model.vo.Soup;

public class ExpensiveFilter implements SoupFilter {

	@Override
	public boolean test(Soup s) {
		return s.getPrice() > 10000;
	}

}
