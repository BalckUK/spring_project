package kh.spring.beans;

import org.springframework.stereotype.Component;

import kh.spring.interfaces.Speaker;

@Component
public class BritzSpeaker implements Speaker {
	public BritzSpeaker() {
		System.out.println("Britz Speaker 생성");
	}
}
