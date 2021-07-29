package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee ep = null;
		int num;
		abc:
		while(true) {
			mainMenu();
			num = sc.nextInt();
		
			switch(num) {
			case 1:
				ep = new Employee();
				ep.empInput();
				break;
			case 2:
				modifyuMenu(ep);
				break;
			case 3:
				ep = null;
				break;
			case 4:
				if(ep == null) {
					System.out.println(">>먼저 사원정보를 입력하세요.");
					break;
				}	
				ep.empOutput();
				break;
			case 9:
				ep = null;
				break abc;
				
			}
		}
	
		
		
	}
	
	public static void mainMenu() {
		
		System.out.println("******* 사원 정보 관리 프로그램 ************");
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 삭제");
		System.out.println("4. 사원정보 출력");
		System.out.println("9. 끝내기");
		System.out.println("********************************************");
		
	}
	
	public static void modifyuMenu(Employee ep) {
		int num;
		int any2;
		String any;
		String modifyuMenu = "********** 사원 정보 수정 메뉴 **********\r\n"
				+ "	1. 이름 변경 => setEmpName()\r\n"
				+ "	2. 급여 변경 => setSalary()\r\n"
				+ "	3. 부서 변경 => setDept()\r\n"
				+ "	4. 직급 변경 => setJob()\r\n"
				+ "	5. 이전 메뉴로 이동 => return 처리할 것\r\n"
				+ "********************************************";
		while(true) {
		System.out.print(modifyuMenu);
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.print("이름 변경 : ");
			any = sc.next();
			ep.setEmpName(any);
			break;
		case 2:
			System.out.print("급여 변경 : ");
			any2 = sc.nextInt();
			ep.setSalary(any2);
			break;
		case 3:
			System.out.print("부서 변경 : ");
			any = sc.next();
			ep.setDept(any);
			break;
		case 4:
			System.out.print("직급 변경 : ");
			any = sc.next();
			ep.setJob(any);
			break;
		case 5:
			return;
			}
	
		}
	}

}
