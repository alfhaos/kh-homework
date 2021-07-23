package kh.java.test.array;

import java.util.Scanner;

public class Test6 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test6 t6 =new Test6();

		t6.test1();

	}
	
	public void test1() {
		System.out.print("홀수인 양의정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		int count = 0;
		if(num % 2 == 0 || num < 0) {
			System.out.print("홀수인 양의 정수를 입력하세요");
		}
		int[] arr = new int[num];
		
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = (count+1);
			if(i >= (num / 2)) {
				count--;
			}
			else {
				count++;
			}
		}
		printArr(arr);
		
	}
	
	public void printArr(int[] arr) {
		String arr2 = "[";
		for(int i = 0; i < arr.length; i++) {
			arr2 += arr[i];
			if(i < arr.length-1){
			arr2 += ",";
			}
			
		}
		System.out.print(arr2+"] \n");
	}
}
