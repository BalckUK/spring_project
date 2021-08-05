package kh.spring.beans;

import kh.spring.interfaces.Speaker;
import kh.spring.interfaces.Tv;

public class LgTV implements Tv {

	private Speaker speaker;
	private int price;

	public LgTV() {

	}

	public LgTV(Speaker speaker, int price) {
		System.out.println("LG TV 생성!");
		this.speaker = speaker;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("TV 켜짐");
	}

	public void powerOff() {
		System.out.println("TV 꺼짐");
	}

	public void init() {
		System.out.println("LG TV 초기 설정 가동");
	}

	public void destory() {
		System.out.println("LG TV 고장");
	}

	@Override
	public void printPrice() {
		System.out.println("LG TV : " + price);
	}
}
