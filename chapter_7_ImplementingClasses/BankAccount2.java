package chapter_7_ImplementingClasses;

public class BankAccount2 {
	private String accountNumber;
	private String accountName;
	private double balance;
	private static double interestRate = 0; // good practice to initialise attributes when declared
	
	// constructor
	public BankAccount2(String numberIn, String nameIn) {
		accountNumber = numberIn;
		accountName = nameIn;
		balance = 0;
	}
	
	// get account name
	public String getAccountName() {
		return accountName;
	}
	
	// get account number
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// deposit
	public void deposit(double numberIn) {
		balance = balance + numberIn;
	}
	
	// withdraw
	public void withdraw(double numberIn) {
		balance = balance - numberIn;
	}
	
	// set Interest rate - declared as static
	public static void setInterestRate(double numberIn) {
		interestRate = numberIn;
	}
	
	// get interest rate - declared as static
	public static double getInterestRate() {
		return interestRate;
	}
	
	// add interest rate
	public void addInterest() {
		balance = balance + (balance * interestRate) / 100;
	}
}
