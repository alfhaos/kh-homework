package kh.java.condition;

import java.util.Scanner;

public class SwitchStudy {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		SwitchStudy study = new SwitchStudy();
		study.test2();
	}
	
	public void test3() {
		
	}
	public void test2() {
		String menu = "------------------\n"
					+ "오늘의 메뉴\n"
					+ "------------------\n"
					+ "1. 순대국(8,000원)\n"
					+ "2. 감자국(7,000원)\\n"
					+ "3. 김치찌개(8,500원)\\n"
					+ "------------------\n"
					+ "선택: ";
		System.out.println("메뉴를 선택하세요.");
		System.out.print("> ");
		int me = sc.nextInt();
		int price = 0;
		String name = " ";
		
		switch(me) {
		case 1: name = "순대국"; price = 8000; break;
		case 2: name = "감자국"; price = 7000; break;
		case 3: name = "김치찌개"; price = 8500; break;
		default: System.out.println("해당하는 메뉴가 없습니다. 종료합니다.");
		return;
		}
		System.out.println(name + "의 가격은 " + price + "원입니다.");
	}

}
