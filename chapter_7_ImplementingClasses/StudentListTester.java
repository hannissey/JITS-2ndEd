package chapter_7_ImplementingClasses;

public class StudentListTester {
	  public static void main(String[] args)
	  {
	    char choice;
	    int size;
	    System.out.print("Number of students in class? ");
	    size = EasyScanner.nextInt();
	    // create StudentList object
	    StudentList sixthForm = new StudentList(size);

	    // offer menu
	    do
	    {
	      System.out.println();
	      System.out.println("1. Create new student record");
	      System.out.println("2. Remove student");
	      System.out.println("3. Add maths score");
	      System.out.println("4. Add english score");
	      System.out.println("5. View all students");
	      System.out.println("6. Quit");
	      System.out.println();
	      System.out.print("Enter choice [1-6]: ");

	      // get choice
	      choice = EasyScanner.nextChar();
	      System.out.println();

	      // process menu options
	      switch (choice)
	      {
	        case '1': option1(sixthForm);
	                  break;
	        case '2': option2(sixthForm);
	                  break;
//	        case '3': option3(sixthForm);
//	                  break;
//	        case '4': option4(sixthForm);
//	                  break;
	        case '5': option5(sixthForm);
	                  break;
	        case '6': break;
	        default:  System.out.println("Invalid entry");
	      }
	    }
	    while (choice != '6');
	  }

	  // add account
	  private static void option1(StudentList studentListIn)
	  {
	    // get details from user
	    System.out.print("Enter student number: ");
	    String number = EasyScanner.nextString();
	    System.out.print("Enter student name: ");
	    String name = EasyScanner.nextString();
	    // create new student
	    Student student1 = new Student(number, name);
	    // add account to list
	    boolean ok = studentListIn.add(student1);
	    if (!ok)
	    {
	      System.out.println("The list is full");
	    }
	    else
	    {
	      System.out.println("Student record created");
	    }
	  }

	  // remove account
	  private static void option2(StudentList studentListIn)
	  {
	    // get account number of account to remove
	    System.out.print("Enter student number: ");
	    String number = EasyScanner.nextString();
	    // delete item if it exists
	    boolean ok = studentListIn.remove(number);
	    if (!ok)
	    {
	      System.out.println("No such student");
	    }
	    else
	    {
	      System.out.println("Student removed");
	    }
	  }

	  // deposit money in an account
	  private static void option3(Bank bankIn)
	  {
	    // get details from user
	    System.out.print("Enter account number: ");
	    String number = EasyScanner.nextString();
	    System.out.print("Enter amount to deposit: ");
	    double amount = EasyScanner.nextDouble();
	    boolean ok = bankIn.depositMoney(number, amount); // attempt to deposit
	    if (!ok)
	    {
	      System.out.println("No such account number");
	    }
	    else
	    {
	      System.out.println("Money deposited");
	    }
	  }

	  // withdraw money from an account
	  private static void option4(Bank bankIn)
	  {
	    // get details from user
	    System.out.print("Enter account number: ");
	    String number = EasyScanner.nextString();
	    System.out.print("Enter amount to withdraw: ");
	    double amount = EasyScanner.nextDouble();
	    boolean ok = bankIn.withdrawMoney(number, amount); // attempt to withdraw
	    if (!ok)
	    {
	      System.out.println("No such account number");
	    }
	    else
	    {
	      System.out.println("Money withdrawn");
	    }
	  }

	  // check account details
	  private static void option5(StudentList studentListIn)
	  {
	    // get details from user
	    System.out.print("Enter student number ");
	    String number = EasyScanner.nextString();
	    Student student1 = studentListIn.getItem(number);
	    if (student1 == null)
	    {
	      System.out.println("No such student");
	    }
	    else
	    {
	      System.out.println("Account number: " + student1.getNumber());
	      System.out.println("Account name: " + student1.getName());
	      System.out.println();
	    }
	  }
	}

