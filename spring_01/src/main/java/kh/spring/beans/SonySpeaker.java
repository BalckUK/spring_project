package kh.spring.beans;

import org.springframework.stereotype.Component;

import kh.spring.interfaces.Speaker;

@Component("Sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("Sony Speaker 생성");
	}

	@Override
	public void volumeUP() {
		System.out.println("Sony : 볼륨이 Up 되었습니다");
	}
}
