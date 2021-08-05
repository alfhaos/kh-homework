package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		String[] arr2 = new String[5];
		String point;
		String Class = null;
		int A,B,C,D,E;
		double result = 0;
		
		
		point = sc.nextLine();
		arr = point.split(" ");
		
		
		for(int i = 0; i < arr.length ; i++) {
			arr2[i] = arr[i];
		}
		
		for(int j = 0 ; j < arr2.length ; j++) {
			if(arr2[j] == null) {
				System.out.println("다시 입력 하세요");
				System.exit(0);
				}
		}
		A = Integer.valueOf(arr2[0]);
		B = Integer.valueOf(arr2[1]);
		C = Integer.valueOf(arr2[2]);
		D = Integer.valueOf(arr2[3]);
		E = Integer.valueOf(arr2[4]);
		if((A >= 10 && A <= 99) && (B >= 10 && B <= 99) && (C >= 10 && C <= 99) && (D >= 10 && D <= 99) && (E >= 10 && E <= 99)) {
			result = (((A+B)/2)*0.6) + (((C+D)/2) * 0.2) + (E*0.2);
			
			if(result >= 90.0)
				Class = "Gold Class";
			else if(result >= 80.0)
				Class = "Silver Class";
			else if(result >= 70.0)
				Class = "Bronze Class";
			else
				Class = "Normal Class";
		}
		else {
			System.out.println("다시 입력 하세요");
		}
		System.out.println("평가 점수 : " + result);
		System.out.println("Class : " + Class);
		
		
		
	}

}
