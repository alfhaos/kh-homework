package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		
		if(b == 0 || b < 0 ) {
			div = 0 ;
		}
		System.out.println("합 : " + sum);
		System.out.println("차 : " + sub);
		System.out.println("곱 : " + mul);
		System.out.println("나누기 : " + div);

	}

}
