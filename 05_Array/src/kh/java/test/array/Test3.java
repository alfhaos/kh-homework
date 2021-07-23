package kh.java.test.array;

import java.util.Scanner;

public class Test3 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test3 t3 =new Test3();
		
		t3.test();

	}
	
	public void test() {
		String[] arr = new String[1];
		char[] charr = new char[1];
		int count = 0;
		System.out.println("입력값 : ");
		arr[0] = sc.next();
		System.out.println("검색값 : ");
		charr[0]= sc.next().charAt(0);
		
		for(int i = 0 ; i < arr[0].length(); i++) {
			if(charr[0] == arr[0].charAt(i)) {
				count++;
			}
		}
		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다.\n",arr[0],charr[0],count);
		
		
	}

}
