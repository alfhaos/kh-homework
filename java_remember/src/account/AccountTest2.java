package account;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] account = new Account[5];
		
		for(int i = 0 ; i < account.length ; i++) {
			account[i] = new Account("221-0101-211"+(i+1),100000,0.045);
			account[i].accountInfo();
			
		}
		for(int i = 0 ; i < account.length ; i++) {
			account[i].setInterestRate(0.037);
			account[i].accountInfo2();
		}
	
	}

}
