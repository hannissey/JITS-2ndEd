package chapter_7_ImplementingClasses;

public class StudentTester {
	public static void main(String[] args) {
		
		Student[] studentList = new Student[2];
		
		studentList[0] = new Student("Paul Harris", "1");
		studentList[0].enterMarks(60, 56, 79);
		
		studentList[1] = new Student("Kamala Harris", "2");
		studentList[1].enterMarks(99, 89, 85);
		
		for (int i = 0; i < studentList.length; i++) {
			// Student Report
			System.out.print(
				"Annual Report Card for " + studentList[i].getName()
				+ ". \nEnrolment number: " + studentList[i].getNumber()
				+ ". \n\nYour grades are listed below. "
				+ "\nMaths: " + studentList[i].getMathsMark()
				+ "\nEnglish: " + studentList[i].getEnglishMark()
				+ "\nScience: " + studentList[i].getScienceMark()
				+ "\n"
				);
				if (studentList[i].calculateAverageMark() >= 70) {
					System.out.println("\nYou PASSED with an grade average of " + studentList[i].calculateAverageMark());
				} else {
					System.out.println("\nYou FAILED with an grade average of " + studentList[i].calculateAverageMark());
				}
			System.out.println("\n----------------------------------------------\n");
		}
			 
	}
}
