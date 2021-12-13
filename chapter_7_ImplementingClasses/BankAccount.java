package chapter_7_ImplementingClasses;

public class BankAccount {
	// the attributes
	// despite String being an object, it is possible for attributes of one class to be objects of another
	private String accountNumber;
	private String accountName;
	private double balance;
	
	// the constructor
	public BankAccount(String accountNumberIn, String accountNameIn) {
		accountNumber = accountNumberIn;
		accountName = accountNameIn;
		balance = 0;
	}
	

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amountIn) {
		balance = balance + amountIn;
	}
	
	public void withdraw(double amountIn) {
		balance = balance -amountIn;
	}
	
	
}
