package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		int a ,b;
		
		System.out.print("정수1 입력 : ");
		a = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		b = sc.nextInt();
		
		if((a >= 1 && a <= 9) && (b >= 1 && b <= 9) ) {
			System.out.println("합 : "+ calc.sum(a, b));
			System.out.println("차 : "+ calc.subtract(a, b));
			System.out.println("곱 : "+ calc.multiply(a, b));
			System.out.println("나누기 : "+ calc.divide(a, b));
		}
		else {
			System.out.println("1~9까지만 입력하세요.");
		}
		

	}

}
