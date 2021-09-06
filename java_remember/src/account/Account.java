package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	
	public double calculateInterest() {
		return balance * interestRate;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void accountInfo() {
		System.out.println("계좌번호 : "+this.account + " 잔액 : " +this.balance + " 이자율 : "+this.interestRate *100 + "%");
	}
	
	public void accountInfo2() {
		System.out.println("계좌번호 : "+this.account + " 잔액 : " +this.balance + " 이자율 : "+(double)Math.round(this.interestRate*1000)/10 + "%" + " 이자 : " + (int)(this.balance * this.interestRate)+"원");
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
