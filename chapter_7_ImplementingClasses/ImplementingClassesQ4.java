package chapter_7_ImplementingClasses;

public class ImplementingClassesQ4 {
	public static void main(String[] args) {
		int y = 20;
		SomeClass myObject = new SomeClass(); // initially sets x to 10
		
		test(y, myObject); // sends 20 and myObject, with x as 10, to test method
		System.out.println(y); // this should still be 20?
		System.out.println(myObject.getX()); // this will be 100
	}
	
	private static void test (int z, SomeClass classIn) {
		z = 50;
		classIn.setX(100); // calls setX on classIn, which changes x to 100
	}
}
