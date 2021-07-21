package kh.java.loop;

import java.util.Scanner;

public class Test4 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		Test4 t2 = new Test4();
		t2.test();

	}
	public void test() {
		
		System.out.print("문자열 입력 : ");
		String a = sc.next();
		System.out.print("검색할 문자 입력 : ");
		char b = sc.next().charAt(0);
		int count = 0;
		int len = a.length();
		
		if(((int)b < 65 || (int)b > 90) && ((int)b < 97 ||(int) b > 122)){
			System.out.print("영문자를 입력하세요\n");
		}
		else {
			for(int i = 0 ; i < len ; i++) {
				if(a.charAt(i) == b) {count++;}}
		}
		System.out.printf("%d\n",(int)b);
		System.out.printf(b+"가 포함된 갯수 : %d",count);
		
		
	}

}
