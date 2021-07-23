package kh.java.test.array;

import java.util.Scanner;

public class Test4 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test4 t4 =new Test4();

		t4.test1();

	}
	
	public void test1() {
		String[] sarr = new String[1];
		char[] charr = new char[11]; 
		
		
		System.out.print("사용자 전화번호 입력 : ");
		sarr[0] = sc.next();
		
		for(int i = 0 ; i < sarr[0].length(); i++) {
			charr[i] = sarr[0].charAt(i);
			}
		char[] copy = charr.clone();
		
		for(int i = 0 ; i < charr.length;i++) {
			if( i >= 3 && i <= 6) {
				copy[i] = '*';
			}
		}
		System.out.println(copy);
		
	}

}
