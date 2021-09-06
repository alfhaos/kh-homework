package workshop4;

import java.util.Arrays;
import java.util.Collections;

public class Test03 {

	public static void main(String[] args) {
		int temp = 0;
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			System.out.print(arr[i] +" ");
		}

	}

}
