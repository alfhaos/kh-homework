package workshop4;

public class Test01 {

	public static void main(String[] args) {
		int [][] arr2 = {{ 5, 5},{10,10,10,10,10},{20,20,20},{30,30,30,30}};
		int sum = 0, count = 0;
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length; j++) {
				sum += arr2[i][j];
				count++;
			}
			
		}
		double avg = sum / count;
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
	}

}
