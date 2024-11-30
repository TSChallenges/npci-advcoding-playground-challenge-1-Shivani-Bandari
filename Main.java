public class Main {
    public static void main(String[] args) {
        // Test Case 1: Stock Analysis
        StockPortfolio stock = new StockPortfolio("AAPL", 10, 150.0);
        stock.updatePrice(160.0);
        System.out.println("Calculated profit: "+stock.calculateProfit());
        System.out.println("Get Current value : "+stock.getCurrentValue());
        stock.updatePrice(170.0);
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());

    }
}
