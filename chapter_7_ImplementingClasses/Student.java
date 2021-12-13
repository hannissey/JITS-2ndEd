package chapter_7_ImplementingClasses;

public class Student {
	
	// attributes
	String studentNumber;
	String studentName;
	int markForMaths;
	int markForEnglish;
	int markForScience;

	// constructor Student(String, String)
	public Student(String name, String number) {
		studentName = name;
		studentNumber = number;
		int markForMaths = -999;
		int markForEnglish = -999;
		int markForScience = -999;
	}

	// getName() : String
	public String getName() {
		return studentName;
	}
	
	// getNumber() : String
	public String getNumber() {
		return studentNumber;
	}
	
	// enterMarks(int, int, int)
	public void enterMarks(int maths, int english, int science) {
		// assign input to variables
		markForMaths = maths;
		markForEnglish = english;
		markForScience = science;
	}
	
	// getMathsMark() : int
	public int getMathsMark() {
		return markForMaths;
	}
	
	// getEnglishMark() : int
	public int getEnglishMark() {
		return markForEnglish;
	}
	
	// getScienceMark() : int
	public int getScienceMark() {
		return markForScience;
	}
	
	
	// calculateAverageMark() : double
 	public double calculateAverageMark() {
 		double result = markForMaths + markForEnglish + markForScience;
 		result = result / 3.0;
 		return result;
 	}
	
	
}
