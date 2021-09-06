package workshop4;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc ca = new Calc();
		System.out.print("입력 값 : ");
		int num = sc.nextInt();
		
		System.out.println("결과 : " + ca.calculate(num));
		
		

	}

}
