package chapter_7_ImplementingClasses;

public class BankProgram {
	public static void main(String[] args) {
		char choice;
		int size;
		System.out.print("Maximum number of accounts?");
		size = EasyScanner.nextInt();
		// create Bank object
		Bank myBank = new Bank(size);
		
		// offer menu
		do {
			System.out.println(); // blank line
			System.out.println("1. Create new account "
					+ "\n2. Remove an account "
					+ "\n3. Deposit money "
					+ "\n4. Withdraw money "
					+ "\n5. Check account details "
					+ "\n6. View all accounts. "
					+ "\n7. Quit "
					+ "\n \nEnter choice (1-7)");
			System.out.println();
			
			// get choice
			choice = EasyScanner.nextChar();
			System.out.println();
			
			// process menu options
			switch (choice) {
			case '1': option1(myBank);
					break;
			case '2': option2(myBank);
					break;
			case '3': option3(myBank);
					break;
			case '4': option4(myBank);
					break;
			case '5': option5(myBank);
					break;
			case '6' : option6(myBank);
			case '7': break;
			default	: System.out.println("Invalid Entry ");
			}
			
		} while (choice != '7');
		
	}
	
	// add account
	private static void option1(Bank bankIn) {
		// get details from user
		System.out.println("Enter account Number: ");
		String number = EasyScanner.nextString();
		System.out.println("Enter account name: ");
		String name = EasyScanner.nextString();
		
		// create bank account
		BankAccount account = new BankAccount(number, name);
		
		// add account to the list
		boolean ok = bankIn.add(account);
		if (!ok) {
			System.out.println("The list is full. ");
		} else {
			System.out.println("Account created. ");
		}
	}
	
	// remove account
	private static void option2(Bank bankIn) {
		// get account number of account to remove
		System.out.println("Enter account number: ");
		String number = EasyScanner.nextString();
		// delete item if it exists
		boolean ok = bankIn.remove(number);
		if (!ok) {
			System.out.println("No such account number. ");
		} else {
			System.out.println("Account removed. ");
		}
	}
	
	// deposit money in account
	private static void option3(Bank bankIn) {
		System.out.println("Enter account number: ");
		String number = EasyScanner.nextString();
		System.out.println("Enter amount to deposit: ");
		double amount = EasyScanner.nextDouble();
		
		boolean ok = bankIn.depositMoney(number, amount);
		if (!ok) {
			System.out.println("No such account number. ");
		} else {
			System.out.println("Money deposited. ");
		}
	}
	
	// withdraw money from an account
	private static void option4(Bank bankIn) {
		// get details from user
		System.out.println("Enter account number: ");
		String number = EasyScanner.nextString();
		System.out.println("Enter amount to withdraw: ");
		double amount = EasyScanner.nextDouble();
		
		boolean ok = bankIn.withdrawMoney(number, amount);
			if (!ok) {
				System.out.println("No such account number. ");
			} else {
				System.out.println("Money withdrawn. ");
		}
	}
	
	// check account details
	private static void option5(Bank bankIn) {
		// get details from user
		System.out.println("Enter account number: ");
		String number = EasyScanner.nextString();
		BankAccount account = bankIn.getItem(number);
		if (account == null) {
			System.out.println("No such account number. ");
		} else {
			System.out.println("Account number: " + account.getAccountNumber()
				+ " \nAccount name: " + account.getAccountName()
				+ " \nAccount Balance: " + account.getBalance()
				+ " \n"	);
		}
	}
	
	// allow all accounts to be displayed
	private static void option6(Bank bankIn) {
		bankIn.viewItems();
	}
	
}
