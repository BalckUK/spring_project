package kh.spring.beans;

import kh.spring.interfaces.Tv;

public class LgTV implements Tv {
	public LgTV() {
		System.out.println("LG TV 생성!");
	}
	
	public void powerOn() {
		System.out.println("TV 켜짐");
	}
	
	public void powerOff() {
		System.out.println("TV 꺼짐");
	}
}
