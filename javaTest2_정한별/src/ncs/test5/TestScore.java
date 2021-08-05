package ncs.test5;

import java.util.Arrays;
import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		double[][] arr = new double[3][4];
		Scanner sc = new Scanner(System.in);
		double[] sum = new double[3];
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			for(int j = 0 ; j < arr[i].length; j++) {
				
				if(j == 3) {
					arr[i][3] = sum[i] / 3;
					break;
				}
				System.out.printf("%d번째 학생 과목%d : ",i+1,j+1);
				arr[i][j] = sc.nextDouble();
				sum[i] += arr[i][j];
				
			}
			
		}
		
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + "\t");
			for(int j = 0 ; j < arr[i].length; j++) {
				
				if(j == 3) {
					System.out.print(sum[i] + "\t");
					System.out.println(arr[i][3]);
					break;
				}
				System.out.print(arr[i][j] + "\t");
				
			}
			
		}
		
	

	}

}
