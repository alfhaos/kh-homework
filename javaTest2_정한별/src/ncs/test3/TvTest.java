package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tv = new Tv[3];
		int maxprice = 0 ,minprice = 0;
		String max = null,min = null;
		tv[0] = new Tv("INFINIA",1500000,"LED TV");
		tv[1] = new Tv("XCANVAS",1000000,"LCD TV");
		tv[2] = new Tv("CINEMA",2000000,"3D TV");
		
		minprice = tv[0].getPrice();
		for(int i = 0 ; i < tv.length ; i++) {
			System.out.print(tv[i].toString());
			
			if(tv[i].getPrice() >= maxprice )
				max = tv[i].getName();
			if(tv[i].getPrice() <= minprice)
				min = tv[i].getName();
		}
		System.out.println("가격이 가장 비싼 제품 " + max);
		System.out.println("가격이 가장 저렴한 제품 " + min);
		
	}

}
