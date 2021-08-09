package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	Scanner sc = new Scanner(System.in);
	private static String a;
	
	public static void main(String[] args) {
		CharacterProcess cp = new CharacterProcess();
		
		Run run = new Run();
		run.test1();
		
		cp.countAlpha(a);
		
		
		System.out.println("시스템 종료");
	}

	private void test1() {
		System.out.println("문자열 입력 : ");
		this.a = sc.nextLine();
	}

}
