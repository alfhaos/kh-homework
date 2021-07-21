package kh.java.loop;

import java.util.Scanner;

public class Test2 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			Test2 t2 = new Test2();
			t2.test();

	}
	
	public void test() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.print(i % 2 == 0 ? "박":"수");
			
			}
		}
}
