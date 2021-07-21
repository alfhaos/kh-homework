package kh.java.loop;

import java.util.Scanner;

public class Test1 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();

	}
	
	public void test() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int a = 0;
		for(int i = 0 ; i <= num ; i += 2) {a += i;}
		System.out.printf("정수 짝수합 : %d",a);
	}

}
