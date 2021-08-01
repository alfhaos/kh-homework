package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

public class Run {

	public static void main(String[] args) {

		CoffeeManager cm = new CoffeeManager();
		String a = "<세계3대커피>\n"
				+ "---------------------------\n"
				+ "원산지\t지역\n"
				+ "---------------------------";
		
		
		cm.inputcf();
		System.out.println(a);
		cm.outputcf();
		System.out.println("---------------------------");
	}

}
