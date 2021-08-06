package kh.spring.beans;

import org.springframework.stereotype.Component;

import kh.spring.interfaces.Speaker;

@Component("Britz")
public class BritzSpeaker implements Speaker {
	public BritzSpeaker() {
		System.out.println("Britz Speaker 생성");
	}

	@Override
	public void volumeUP() {
		System.out.println("Britz : 볼륨이 Up 되었습니다");
	}
}
