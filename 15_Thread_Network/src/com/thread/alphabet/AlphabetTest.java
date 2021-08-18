package com.thread.alphabet;



public class AlphabetTest {

	public static void main(String[] args) {
		Runnable run1 = new UpperAlphbetThread();
		Runnable run2 = new LowerAlphbetThread();
		
		
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
	
		
		th1.start();
		th2.start();
	}

}
