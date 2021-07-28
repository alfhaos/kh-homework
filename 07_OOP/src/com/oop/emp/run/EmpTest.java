package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee ep = new Employee();
		int num;
		abc:
		while(true) {
			mainMenu();
			num = sc.nextInt();
		
			switch(num) {
			case 1:
				ep.empInput();
				break;
			case 2:
				ep.delete();
				break;
			case 3:
				ep.empOutput();
				break;
			case 9:
				break abc;
				
			}
		}
	
		
		
	}
	
	public static void mainMenu() {
		
		System.out.println("******* 사원 정보 관리 프로그램 ************");
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 삭제");
		System.out.println("3. 사원정보 출력");
		System.out.println("9. 끝내기");
		System.out.println("********************************************");
		
	}

}
