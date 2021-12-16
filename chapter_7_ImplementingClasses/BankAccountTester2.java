package chapter_7_ImplementingClasses;

public class BankAccountTester2 {
	public static void main(String[] args) {
		// create a bank account
		BankAccount2 account1 = new BankAccount2("123456","Jessie Tomlinson");
		
		// create another bank account
		BankAccount2 account2 = new BankAccount2("123457", "Melanie Sykes");
		
		// make a deposit into the first account
		account1.deposit(50.00);
		
		// make a deposit into the second account
		account2.deposit(250.00);
		
		// set the interest rate, note we are calling it via the CLASS, not the INSTANCE (object)
		BankAccount2.setInterestRate(2.4);
		//account2.setInterestRate(10); // but this will still work universally!
		
		// add interest to account 1
		account1.addInterest();
		
		
		
		// display the account details
		System.out.println("Account Number: " + account1.getAccountNumber());
		System.out.println("Account Name: " + account1.getAccountName());
		System.out.println("Interest Rate: " + account1.getInterestRate()); // a static method should be access in a static way, see below
		System.out.println("Account Balance: " + account1.getBalance());
		System.out.println("");
		System.out.println("Account Number: " + account2.getAccountNumber());
		System.out.println("Account Name: " + account2.getAccountName());
		System.out.println("Interest Rate: " + account2.getInterestRate());
		System.out.println("Account Balance: " + account2.getBalance());
		System.out.println();
		System.out.println("Interest Rate accessed in static way: " + BankAccount2.getInterestRate());
	}
}