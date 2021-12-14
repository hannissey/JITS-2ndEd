package chapter_7_ImplementingClasses;

public class StockItemTester {
	public static void main(String[] args) {
		String tempNumber;
		String tempName;
		double tempPrice;
		
		System.out.println("Enter the stock number: ");
		tempNumber = EasyScanner.nextString();
		System.out.println("Enter the name of the item: ");
		tempName = EasyScanner.nextString();
		System.out.println("Enter the price of the item: ");
		tempPrice = EasyScanner.nextDouble();
		
		/* Create a new item of stock using the values that were entered by the user */
		StockItem item1 = new StockItem(tempNumber, tempName, tempPrice);
		
		// Increase the total number of items in stock by 5
		StockItem.increaseTotalStock(5);
		
		// Display the stock number
		System.out.println("Total stock number is: " + StockItem.getTotalStock());
		
		// Display the total price of all items in stock
		item1.getTotalStock();
		
		// set sales tax for all objects of the class to 10 without referring to any particular object
		StockItem.setSalesTax(10);
	}
}
