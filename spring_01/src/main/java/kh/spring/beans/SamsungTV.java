package kh.spring.beans;

public class SamsungTV {
	public SamsungTV() {
		System.out.println("삼성 TV 생성!");
	}
	
	public void powerOn() {
		System.out.println("TV 켜짐");
	}
	
	public void powerOff() {
		System.out.println("TV 꺼짐");
	}
}
