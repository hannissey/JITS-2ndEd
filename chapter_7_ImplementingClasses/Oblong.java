package chapter_7_ImplementingClasses;

public class Oblong {
	private double height;
	private double length;
	// private is used to restrict access to attributes
	
	// constructor
	public Oblong(double lengthIn, double heightIn) {
		length = lengthIn;
		height = heightIn;
	}
	
	// methods
	public void setLength(double lengthIn) {
		length = lengthIn;
	}
	
	public void setHeight(double heightIn) {
		height = heightIn;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double calculateArea() {
		// double area = length * height;
		// return area;
		// quicker to do this, no need for a new variable:
		return length * height;
	}
	
	public double calculatePerimeter() {
		return (length + height) * 2;
	}
	
	
	
}
