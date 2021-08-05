package kh.spring.mian;

import kh.spring.beans.LgTV;
import kh.spring.interfaces.Tv;

public class Main {
	public static void main(String[] args) {
		//SamsungTV tv = new SamsungTV();
		//LgTV tv = new LgTV();
		Tv tv = new LgTV();
		tv.powerOn();
	}
}
