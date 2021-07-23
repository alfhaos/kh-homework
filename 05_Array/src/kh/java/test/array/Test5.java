package kh.java.test.array;

import java.util.Scanner;

public class Test5 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test5 t5 =new Test5();

		t5.test1();

	}
	
	public void test1() {
		String[] sarr = new String[1];
		char[] charr = new char[13]; 
		
		
		System.out.print("주민등록번호 입력 : ");
		sarr[0] = sc.next();
		
		for(int i = 0 ; i < sarr[0].length(); i++) {
			charr[i] = sarr[0].charAt(i);
			}
		char[] copy = charr.clone();
		
		for(int i = 0 ; i < charr.length;i++) {
			if( i >= 7) {
				copy[i] = '*';
			}
		}
		System.out.println(copy);
		
	}

}
