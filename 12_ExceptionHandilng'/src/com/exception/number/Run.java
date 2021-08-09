package com.exception.number;

import java.util.Scanner;

public class Run {
	Scanner sc = new Scanner(System.in);
	public static int a;
	public static int b;
	public static void main(String[] args) {
		
		Run rn = new Run();
		rn.test();
		
		NumberProcess np = new NumberProcess();
		
		if(np.checkDouble(a, b)) {
			System.out.println(a+ "는" + b +"의 배수이다");
		}
		else {
			System.out.println(a+ "는" + b +"의 배수가 아니다");
		}
		

	}

	private void test() {
		System.out.print("정수1 입력 : ");
		a = sc.nextInt();
		System.out.print("정수2 입력 : ");
		b = sc.nextInt();
	}

}
