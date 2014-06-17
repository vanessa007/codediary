
public class TestStockClass {
	public static void main(String[] args) {
		
		Stock myStock = new Stock("Java", "Sun Microsystems Inc");
		myStock.previousClosingPrice = 4.5;
		myStock.currentPrice = 4.35;
		
		System.out.println("The change percent is: " + myStock.getChangePercent() + "%");
	}

}

class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}