package chapter_7_ImplementingClasses;

public class Bank {
	// attributes
	private BankAccount[] list; // to hold the accounts
	private int total; // to keep track of the number of accounts in the list
	
	// METHODS
	// the constructor
	public Bank(int sizeIn) {
		// size array with parameter
		list = new BankAccount[sizeIn];
		total = 0;
	}
	
	// helper method to find the index of a specified amount
	// search(String) : int
	public int search(String accountNumberIn) {
		for (int i = 0; i < total; i++) {
			BankAccount tempAccount = list[i]; // find the account at index i
			String tempNumber = tempAccount.getAccountNumber();
			if(tempNumber.equals(accountNumberIn)) {
				return i;
			}	
		}
		return -999;
	}
	
	// getTotal() : int
	private int getTotal() {
		return total;
	}
	
	// isEmpty() : boolean
	private boolean isEmpty() {
		if (total == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// isFull() : boolean
	private boolean isFull() {
		if (total == list.length) {
			return true;
		} else {
			return false;
		}
	}
	
	// add(BankAccount) : boolean 
	public boolean add(BankAccount accountIn) {
		if (!isFull()) // check if list is full 
		{
			list[total] = accountIn; // add item
			total++; // increment total
			return true; // indicate success
		} else {
			return false;
		}
	}
	
	// getItem(int) : BankAccount
	public BankAccount getItem(String accountNumberIn) {
		int index;
		index = search(accountNumberIn); // uses the search method to return the index number of account
		if (index == -999) {
			return null; // indicate invalid index
		} else {
			return list[index];
		}
	}
	
	// get all items 
	public void viewItems() {
		for (int i = 0; i < total; i++) {
			BankAccount tempAccount = list[i]; // find the account at index i
			System.out.println("Account number: " + tempAccount.getAccountNumber()
			+ " \nAccount name: " + tempAccount.getAccountName()
			+ " \nAccount Balance: " + tempAccount.getBalance()
			+ " \n"	);
		}
	}
	
	// depositMoney(String, double) : boolean
	public boolean depositMoney(String accountNumberIn, double amountIn) {
		int index = search(accountNumberIn);
		if (index == -999) {
			return false;
		} else {
			list[index].deposit(amountIn);
			return true;
		}
	}
	
	// withdrawMoney(String, double) : boolean
	public boolean withdrawMoney(String accountNumberIn, double amountIn) {
		int index = search(accountNumberIn);
		if (index == -999) {
			return false;
		} else {
			list[index].deposit(amountIn);
			return true;
		}
	}
	
	// remove(String) : boolean
	public boolean remove(String accountNumberIn) {
		int index = search(accountNumberIn);
		if (index == -999) {
			return false;
		} else {
			for(int i = index; i <= total-2; i++) {
				list[i] = list[i+1];
			}
			total--;
			return true;
		}
	}
}
