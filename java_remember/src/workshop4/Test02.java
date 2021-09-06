package workshop4;

public class Test02 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		a:
		for(int i = 0 ; i < arr3.length ; i++) {
			double dValue = Math.random();
		    int ran = (int)(dValue * 10)+1;
		    arr3[i] = ran;
		    
		    for(int j = 0 ; j < i ; j++) {
		    	if(arr3[j] == ran) {
		    		i--;
		    		System.out.print("(중복발견)");
		    		continue a;
		    	}
		    
		    }
		   
			sum += arr3[i];
			System.out.print(arr3[i] + " ");	
		}
		System.out.println("\nsum = " + sum);
		System.out.println("avg = " + sum/arr3.length);

	}

}
