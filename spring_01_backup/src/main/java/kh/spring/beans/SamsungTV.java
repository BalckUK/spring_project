package kh.spring.beans;

import kh.spring.interfaces.Speaker;
import kh.spring.interfaces.Tv;

public class SamsungTV implements Tv {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("삼성 TV 생성!");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("TV 켜짐");
	}
	
	public void powerOff() {
		System.out.println("TV 꺼짐");
	}

	@Override
	public void printPrice() {
		System.out.println("Samsung TV : "+this.price);
	}
}
