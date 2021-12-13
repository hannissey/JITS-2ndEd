package chapter_7_ImplementingClasses;

public class ParameterTest {
	public static void main(String[] args) {
		// create new bank account
		BankAccount account1 = new BankAccount("1", "Candy Corn");
		System.out.println("Started with: " + account1.getBalance());
		test(account1, 260);
		System.out.println("Account Number: " + account1.getAccountNumber());
		System.out.println("Account Name: " + account1.getAccountName());
		System.out.println("Account Balance: " + account1.getBalance());
		
	}
	
	// a method that makes a deposit in the bank account
	public static void test(BankAccount accountIn, double depositIn) {
		accountIn.deposit(depositIn);
	}
}
