package com.kh.sw.controller;

import com.kh.model.vo.Switch;
import com.kh.sw.util.SwitchUtil;
import com.kh.sw.util.SwitchUtilImpl;

public class SwitchController  {
	private Switch s = new Switch(false); // 잘못짠 코드라셨음 복습은 이런식으로 하면 안될듯
	
	//
	public boolean toggleSwitch() {
		SwitchUtil su = new SwitchUtilImpl();
		boolean on = su.toggle(s);
		return on;
		// System.out.println(on);
		
	}
	

	
	
	
	
	
	
}
