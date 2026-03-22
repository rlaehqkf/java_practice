package com.kh.chap01.run;

import com.kh.chap01.condition.ConditionElse;
import com.kh.chap01.condition.ConditionIf;
import com.kh.chap01.condition.ConditionSwitch;
import com.kh.chap02.loop.LoopFor;
import com.kh.chap02.loop.LoopWhile;
import com.kh.chap03.escape.EscapeBreak;

public class Run {
	
	public static void main(String[] args) {
		
		ConditionIf ci = new ConditionIf();
		//ci.method1();
		//ci.quiz();
		ConditionElse ce = new ConditionElse();
		//ce.method1();
		//ce.method2();
		//ce.ageCheck();
		ConditionSwitch cs = new ConditionSwitch();
		//cs.method0();
		//cs.findByName();
		//cs.login();
		LoopFor lf = new LoopFor();
		//lf.method0();
		//lf.method1();
		//lf.gugudan();
		//lf.mainMenu();
		LoopWhile lw = new LoopWhile();
		//lw.method1();
		//lw.method2();
		//lw.method3();
		//lw.lotto();
		EscapeBreak eb = new EscapeBreak();
		//eb.method1();
		//eb.checkId();
		
		
	}

}
