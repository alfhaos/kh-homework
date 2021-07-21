package kh.java.condition;

import java.util.Scanner;

public class SwitchTest1 {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String aa = "";
		int wp,tatal = 0;
		double price = 0.0;
		String menu = "----------menu----------\r\n"
				+ "1. 가정용 (50원/liter)\r\n"
				+ "2. 상업용 (45원/liter)\r\n"
				+ "3. 공업용 (30원/liter)\r\n"
				+ "-------------------------";
		
		System.out.print(menu + "\n메뉴 번호를 선택하세요. ==> ");
		int number = sc.nextInt();
		System.out.print("물 사용량을 입력하세요. ==> ");
		int water = sc.nextInt();
		
		switch(number){
			case 1 : aa = "가정용";
					price = 50 * water; break;
			case 2 : aa = "상업용(업소에서 사용하실 경우)"; 
					price = 45 * water; break;
			case 3 : aa = "공업용"; 
					price = 30 * water;break;
			default : System.out.println("잘못된 번호 입력"); break;
		}
		wp = (int)(price * 0.05);
		tatal = wp + (int)price;
		
		System.out.println("----------<<수도세>>-----------");
		System.out.printf("선택메뉴번호 : %d. %s를 선택하셨습니다.\n",number,aa);
		System.out.printf("사용요금 : %d\n",(int)price);
		System.out.printf("수도세 : %d\n",wp);
		System.out.printf("총 수도요금 : %d원\n",tatal);
		
	}

}
