package chapter_7_ImplementingClasses;

public class StockItem {
	
	// attributes
	String stockNumber;
	String name;
	double price;
	static int totalStock;
	static double salesTax;
	
	// constructor
	StockItem(String numberIn, String nameIn, double priceIn) {
		stockNumber = numberIn;
		name = nameIn;
		price = priceIn;
		totalStock++;
	}
	
	// methods
	
	// setPrice(double)
	public void setPrice(double priceIn) {
		price = priceIn;
	}
	
	// increaseTotalStock(int)
	public static void increaseTotalStock(int stockIn) {
		totalStock = totalStock + stockIn;
	}
	
	// getStockNumber() : String
	public String getStockNumber() {
		return stockNumber;
	}
	
	// getName() : String
	public String getName() {
		return name;
	}
	
	// getTotalStock() : int
	public static int getTotalStock() {
		return totalStock;
	}
	
	// getPrice() : double
	public double getPrice() {
		return price;
	}
	
	
	// calculateTotalPrice() : double
	public double calculateTotalPrice() {
		double total = price * totalStock;
		return total;
	}
	
	// setSalesTax(double) 
	public static void setSalesTax(double numberIn) {
		salesTax = numberIn;
	}
	
	
}
