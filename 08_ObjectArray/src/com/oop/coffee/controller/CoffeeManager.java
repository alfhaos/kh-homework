package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	
	Scanner sc = new Scanner(System.in);
	private static final int max = 3;
	Coffee[] cf = new Coffee[max];
	
	
	
	public void inputcf() {
		
		for(int i = 0 ; i < max ; i++) {
			Coffee c = new Coffee();
			System.out.print("원산지 입력 : ");
			c.setOrigin(sc.next());
		
			System.out.print("지역 입력 : ");
			c.setLocation(sc.next());
			cf[i] = c;
			
		}
		System.out.println("커피 정보 입력 끝 ");
	}
	
	
	public void outputcf() {
		
		for(Coffee cf2 : cf) {
			System.out.println(cf2.printCoffee());
		}
	}
	
		
	
	

}
