package workshop4;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[2][2];
		int sum = 0,count = 0;
		
		System.out.print("입력 : ");
		String str = sc.nextLine();
		String[] strarr = str.split(" ");
	
		for(int i = 0 ; i<strarr.length ; i++) {
			int num = Integer.valueOf(strarr[i]);
			if(num < 1 || num > 5 ) {
				System.out.println("숫자를 확인 하세요");
				System.exit(0);
			}
			arr[0][i] = num;
			
		}
		for(int j = 0 ; j < arr[1].length ; j++) {
			double dValue = Math.random();
		    int ran = (int)(dValue * 5)+1;
		    arr[1][j] = ran;
		}
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
				count++;
			}
			System.out.println();
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/count);
	}

}
