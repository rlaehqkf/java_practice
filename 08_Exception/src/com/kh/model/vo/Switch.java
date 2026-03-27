package com.kh.model.vo;

public class Switch {
	private boolean on;

	public Switch(boolean on) {
		this.on = on;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	@Override
	public String toString( ) {
		return "Switch [on= " + on + "]";
	}
	
	
}

