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
	
	// remove(int) : boolean
	
	
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
	
	public void getItem (int studentIn) {
		for (int i = 0; i < total; i++) {
			Student tempStudent = list[i]; // find the account at index i
			System.out.println(tempStudent);
		}
	}
	
	public int getTotal() {
		return total;
	}
	

}
