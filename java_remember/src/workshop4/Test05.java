package workshop4;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 값 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = num ; i < 10; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
			
		}
		System.out.println("\n결과 : " + sum);

	}

}
