package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {

	
	Scanner sc = new Scanner(System.in);
	private static final int max = 5;
	Person[] p = new Person[max];
	
	
	public void inputPerson() {
		
		
		for(int i = 0 ; i < p.length ; i++) {
			Person ps = new Person();
			System.out.print(i+"번째 이름 입력 : ");
			ps.setName(sc.next());
			System.out.print(i+"번째 나이 입력 : ");
			ps.setAge(sc.nextInt());
			System.out.print(i+"번째 키 입력 : ");
			ps.setHeight(sc.nextInt());
			System.out.print(i+"번째 몸무게 입력 : ");
			ps.setWeight(sc.nextInt());
			System.out.print(i+"번째 재산 입력 : ");
			ps.setMoney(sc.nextInt());
			
			p[i] = ps;
			
		}
		
	}
	
	public void outputPerson() {
		for(Person array : p) {
			System.out.println(array.information());
		}
	}
	
}
