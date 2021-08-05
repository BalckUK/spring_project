package kh.spring.factory;

import kh.spring.beans.LgTV;
import kh.spring.beans.SamsungTV;
import kh.spring.interfaces.Tv;

public class TvFactory {
	public static Tv getInstance(String brand) {
		if (brand.equals("Samsung")) {
			return new SamsungTV();
		}else if(brand.equals("Lg")) {
			return new LgTV();
		}
		return null;
	}
}
