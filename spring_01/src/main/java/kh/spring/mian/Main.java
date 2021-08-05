package kh.spring.mian;

import kh.spring.factory.TvFactory;
import kh.spring.interfaces.Tv;

public class Main {
	public static void main(String[] args) {
		// SamsungTV tv = new SamsungTV();
		// LgTV tv = new LgTV();
		// Tv tv = new SamsungTV();
		Tv tv = TvFactory.getInstance("Samsung");
		tv.powerOn();
	}
}
