package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int num = 1;
		double sum = 0;
		while(num < 101) {
			sum += (double)num;
			num++;
		}
		System.out.println("합계 : " + (int)sum);
		System.out.println("평균 : " + (double)sum/100);

	}

}
