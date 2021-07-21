package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test3 t3 =new Test3();
		t3.test();

	}
	
	public void test() {
		while(true) {
		System.out.print("2보다 큰 정수 입력 : ");
		int number = sc.nextInt();
		if(number < 2 ) {
			System.out.print("잘못 입력하셨습니다. 다시 입력하세요.\n");
			continue;
			}
		else if(number % 2 != 0 || number % 3 != 0) {System.out.print("소수다.\n"); break;}
		else {System.out.println("소수가 아니다."); break;}
		}
		System.out.println("프로그램종료");
		
	}

}
