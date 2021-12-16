package chapter_7_ImplementingClasses;

public class StudentList {
	// collection class for Student
	
	// attributes
	private Student[] list;
	private int total;
	
	// METHODS
	
	// constructor StudentList(int)
	public StudentList(int studentNumber) {
		list = new Student[studentNumber];
		total = 0;
	}
	
	// added search method from Bank Class
	// search(String) : int
	public int search(String accountNumberIn) {
		for (int i = 0; i < total; i++) {
			Student tempAccount = list[i]; // find the account at index i
			String tempNumber = tempAccount.getNumber();
			if(tempNumber.equals(accountNumberIn)) {
				return i;
			}	
		}
		return -999;
	}
	
	// add(Student) : boolean 
	public boolean add(Student studentIn) {
		
		if (!isFull()) // check if list is full 
		{
			list[total] = studentIn; // add item
			total++; // increment total
			return true; // indicate success
		} else {
			return false;
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
	
	// get all items 
	public void viewItems() {
		for (int i = 0; i < total; i++) {
			Student tempStudent = list[i]; // find the account at index i
			System.out.println("Student name: " + tempStudent.getNumber()
			+ " \nStudent Number: " + tempStudent.getName()
			+ " \n"	);
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
	
	public int getTotal() {
		return total;
	}
	

}
