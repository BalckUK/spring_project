package kh.spring.mian;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.beans.LgTV;
import kh.spring.interfaces.Tv;

public class Main {
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
		Tv tv = (Tv) ctx.getBean(Tv.class); // Dependency Lookup : DL / DI
		((LgTV)tv).volumUP();
		// tv.printPrice();
		ctx.close();
	}
}
