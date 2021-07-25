package com.kh.test.multi.dimentional.array;

public class Sample2 {

	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		//s2.exercise1();
		s2.exercise2();
		

	}
	
	public void exercise1() {

		int[][] arr = new int[3][5];
		
		for(int i = 0 ; i <arr.length;i++) {
			for(int j = 0; j < arr[i].length; j++) {
				double dran = Math.random();
				int ran = (int)(dran*100)+1;
				arr[i][j] = ran;
				if(arr[i][j] % 5 == 0) {
					System.out.printf("%d열 %d행 의 값 : %d\n ",i,j, arr[i][j]);
				}
				
			}
			
		}
		
		
	}
	public void exercise2() {
		int[][] arr =new int[4][4];
		int colsum1 = 0,colsum2 = 0,colsum3 = 0,result = 0;
		for(int i = 0 ; i < 3 ; i++) {
			int sum = 0;
			for(int j = 0 ; j < 3 ; j++) {
				double dran = Math.random();
				int ran =(int)(dran*100)+1;
				arr[i][j] = ran;
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
				if(j == 2) {
					System.out.print(+i+"행 합계 : " + sum);
				}
			}
			colsum1 += arr[i][0];
			colsum2 += arr[i][1];
			colsum3 += arr[i][2];
			System.out.println();
		}
		result = colsum1+colsum2+colsum3;
		System.out.print(colsum1 + " "+colsum2 + " "+colsum3+ " "+result);
		
	}

}
