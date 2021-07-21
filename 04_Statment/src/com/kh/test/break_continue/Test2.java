package com.kh.test.break_continue;

import java.util.Scanner;

public class Test2 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();

	}
	
	public void test() {
		double ran = Math.random();
		int number = (int)(ran * 100)+1;
		int count = 0;
		System.out.println(number);
		while(true) {
			System.out.print("정수 입력 : ");
			int inputnum = sc.nextInt();
			if(number < inputnum) {
				System.out.println("입력하신 정수보다 작습니다");
				count++;
				continue;
			}
			else if(number > inputnum) {
				System.out.println("입력하신 정수보다 큽니다");
				count++;
				continue;
			}
			else if(number == inputnum) {
				break;
			}
			
		}
		System.out.printf("정답입니다. %d회 만에 정답을 맞추셨습니다",count);
		
	}

}
