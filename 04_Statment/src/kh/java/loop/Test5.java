package kh.java.loop;

import java.util.Scanner;

public class Test5 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test5 t5 = new Test5();
		
		t5.test();

	}
	public void test() {
		String buffer;
		int i,num,avg1 = 0,avg2 = 0,avg3 = 0;
		
		System.out.print("입력할 회원수 : ");
		num = sc.nextInt();
		
		String[] name = new String[num];
		String[] address = new String[num];
		String[] phone = new String[num];
		int[] age = new int[num];
		int[] cm = new int[num];
		int[] kg = new int[num];
		
		for(i = 0 ; i < num ; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
			System.out.print("주소 : ");
			buffer = sc.nextLine();
			address[i] = sc.nextLine();
			System.out.print("키 : ");
			cm[i] = sc.nextInt();
			System.out.print("몸무게 : ");
			kg[i] = sc.nextInt();
			System.out.print("연락처 : ");
			phone[i] = sc.next();
			avg1 += age[i];
			avg2 += cm[i];
			avg3 += kg[i];
		} 
		System.out.println("================ 저장회원===============");
		for(i = 0 ; i < num ; i++) {
			System.out.printf(i+1 +". " + "%s %d세 %s %dcm %dkg %s\n",name[i],age[i],address[i],cm[i],kg[i],phone[i]);
		}
		System.out.println("============================================\n");
		avg1 = avg1 / i;
		avg2 = avg2 / i;
		avg3 = avg3 / i;
		System.out.printf("평균나이 %d세 / 평균 키 : %dcm / 평균 몸무게 : %dkg",avg1,avg2,avg3);
		
		
		
	}

}
