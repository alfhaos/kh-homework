package com.exception.number;

public class NumberProcess {

	public NumberProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDouble(int a, int b){
		
		try {
			if((a < 1 || a > 100) || (b < 1 || b > 100))
				throw new NumberRangeException();
			System.out.println("배수 확인 : " + a%b);
		}
		
		catch(NumberRangeException e){
			System.out.println("1부터 100사이의 값이 아닙니다.");
			System.exit(0);
		}
		return a % b == 0 ? true : false;
	}

}
