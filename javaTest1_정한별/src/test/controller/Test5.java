package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		
		if((a >= 1 && a <= 9) &&(b >= 1 && b <= 9))
			System.out.println((a*b) < 10 ? "한자리 수 입니다":"두자리 수 입니다");
		
	}

}
