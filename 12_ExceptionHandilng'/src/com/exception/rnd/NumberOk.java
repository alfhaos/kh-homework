package com.exception.rnd;

import java.util.Random;
import java.util.Scanner;

public class NumberOk {
	static Scanner sc =new Scanner(System.in);
	
	public static int rd;
	
	public static void main(String[] args) {
		NumberOk no = new NumberOk();
		int count = 0;
		char ch;
		double value = Math.random();
		rd = (int)(value * 100)+1;
		loop:
		while(true) {
			switch(no.checkNumber(no.getNumber())) {
			case 0:
				System.out.println("맞았습니다.(" + count +"번$$");
				System.out.print("계속 하시겠습니까?(y/n) :");
				ch = sc.next().charAt(0);
				if(ch == 'n') {
					break loop;
				}
				else {
					break;
				}
			case -1:
				System.out.println("입력한 숫자보다 작습니다.");
				count++;
				break;
			case 1:
				System.out.println("입력한 숫자보다 큽니다.");
				count++;
				break;
			}
				
				
		}
		System.out.println("시스템 종료 ");
		
	}
	
	
	public int getNumber() {
		int a;
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		return a;
		
	}
	public int checkNumber(int a) {
		if(a == rd) {
			return 0;
			}
		else if(a < rd) {
			return -1;
			}
		else {
			return 1;
		}
	}
}
