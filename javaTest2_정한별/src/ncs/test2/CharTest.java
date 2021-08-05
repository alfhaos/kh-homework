package ncs.test2;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a;
		
		System.out.print("문자열 입력 : ");
		a = sc.next();
		
		char[] arr = new char[a.length()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = a.toUpperCase().charAt(i);

		}
		
		for(int j = arr.length-1; j >= 0 ; j-- ) {
			System.out.print(arr[j]);
		}
	}

}
