package com.thread.sleep;



public class SleepTest {

	public static void main(String[] args) {
		
		SleepTest st = new SleepTest();
		
		st.sendAphorism();
	
		
		

	}
	
	
	public static void sendAphorism() {
		String[] arr = {"티끌모아태산","바늘도둑소도둑","닭쫓던개","늦었다고 생각할때 시작",
						"호랑이동굴 정신만차림","오랑캐","오솔비","감자","로스트아크","쓰마일 게이트"};
		
		
		for(int i = 0 ; i < 10 ; i++) {
			double ran = Math.random();
			int random = (int)(ran*10);
			System.out.println(arr[random]);
		
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {
			
				e.printStackTrace();
		}
		
		}
	}
	

}
