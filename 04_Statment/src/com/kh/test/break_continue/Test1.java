package com.kh.test.break_continue;
import java.util.*;
public class Test1 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//t1.test1();
		t1.test2();
	}
	
	public void test1() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int i = 0;
		int a = 1;
		while(true) {
			if(i > num) {
				break;
			}
			else if(i % 2 == 1) {
			a *= i;
			System.out.println(a);}
			i++;
			
		}
		System.out.println(a);
		
	}
	public void test2() {
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		int max,min,count,num3 = 0;
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		count = min;
		while(true) {
			if(count > max) {
				break;
			}
			else if(count % 2 == 1) {
				num3 += count;
			}
			count++;
		}
		System.out.print("====================\n");
		System.out.printf("%d 부터 %d 까지의 홀수의 합은 %d 입니다.",min,max,num3);
	}
	
	
}
