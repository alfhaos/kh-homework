package com.kh.test.multi.dimentional.array;

public class Sample {

	public static void main(String[] args) {
		Sample test = new Sample();
		//test.test1();
		//test.test2();
		//test.test3();
		//test.test4();
		//test.test5();
		//test.test6();
		//test.test7();
		test.test8();
		}
	
	/*public void test1() {
		outer:
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {	
				System.out.print("★");
				if(i+j == 4)
					break;
			}
			System.out.println();
		}
	}
	public void test2() {
		outer:
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {	
				System.out.print("★");
				if(i == j)
					break;
			}
			System.out.println();
		}
	}
	public void test3() {
		int count = 4;
		outer:
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {
				if(j >= count) 
					System.out.print("★");
					
				else 
					System.out.print(" ");
				
			}
			count--;
			System.out.println();
		}
	}
	public void test4() {
		outer:
		for(int i = 0; i < 5; i++) {
			for(int j = 1 ; j < 5-i; j++) {	
				System.out.print(" ");}
			for(int k = 0 ; k <i*2+1;k++) {
				System.out.print("★");
				}
			
			System.out.println();
		}
	}
	
	public void test5() {
		int count = 0;
		outer:
		for(int i = 0; i < 3; i++) {
			if(i > 0) {
				for(int k = 0; k < i*2;k++) {
				System.out.print(" ");}
			count++;}
			
			if(count == 0) {
			for(int j = 0 ; j < 5; j++) {
				System.out.print("*");}
			}
			else if(count == 1) {
				for(int j = 0 ; j < 3; j++) {
					System.out.print("*");}
			}
			else if(count == 2) {
					System.out.print("*");
			}
			
			System.out.println();	
		}
	}
	public void test6() {
		int count = 4;
		outer:
		for(int i = 0; i < 5; i++) {
			if(i <= 1) {
			for(int k = 0 ; k < 6-((i+1)*2);k++) {
				System.out.print(" ");
				}
			for(int j = 0 ; j < (i+1)*2-1; j++) {	
				System.out.print("*");
				}
			}
			else if(i == 2) {
				for(int j = 0 ; j < 5; j++) {	
					System.out.print("*");
				}
			}
			else if(i ==3) {
				for(int k = 0 ; k < i-1;k++) {
					System.out.print(" ");
					}
				for(int j = 0 ; j < 3; j++) {	
					System.out.print("*");
					}
			}
			else if(i ==4) {
				for(int k = 0 ; k < i;k++) {
					System.out.print(" ");
					}
				for(int j = 0 ; j < 1; j++) {	
					System.out.print("*");
					}
			}
			
			System.out.println();
			
		}
	}
	public void test7() {
		for(int i = 0; i <= 3; i++){
            for(int j = i; j <= 2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
        for(int i = 0; i <= 1; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= 1; j++){
                System.out.print("*");
            }
            for(int j = i+1; j <= 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}*/
	
	public void test8() {
		outer:
			for(int i = 3; i > 0; i--){
	            for(int j = i; j <= 2; j++){
	                System.out.print(" ");
	            }
	            for(int j = i; j <= 2; j++){
	                System.out.print(" ");
	            }
	            for(int j = 0; j < i; j++){
	                System.out.print("*");
	            }
	            for(int j = 0; j < i-1; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		
		for(int i = 2; i <= 3; i++){
            for(int j = i; j <= 2; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= 2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		
		
	}
	
	
	
	
	
	
}
