package ncs.test4;

import java.util.Arrays;
import java.util.Random;

public class TestSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			double rd = Math.random();
			arr[i] = (int)(rd*50) + 51;
		}
		System.out.println("before : " + Arrays.toString(arr));
		for(int i = 0; i < arr.length-1; i++) {
			
			int min = i; // 최소값에 해당하는 인덱스
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] < arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.print("after : " + Arrays.toString(arr));
		
	
		
		

	}

}
