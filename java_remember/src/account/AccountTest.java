package account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("441-0209-1203",500000,0.073);
		System.out.println("계좌정보 : " + account.getAccount() + " 현재 잔액 : " + account.getBalance());
		
		account.deposit(20000);
		System.out.println("계좌정보 : " + account.getAccount() + " 현재 잔액 : " + account.getBalance());
		
		System.out.println("이자정보 : "+ account.calculateInterest());
	}

}
