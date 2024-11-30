class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO
        this.symbol = symbol;
        this.quantity =quantity;
        this.buyingPrice = buyingPrice;
        this.highestPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        // TODO
        this.currentPrice = newPrice;
    if(newPrice >= 0 && newPrice > currentPrice)
    {
        this.currentPrice = newPrice;
        this.highestPrice = newPrice;
    }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
    
     double value  =(currentPrice - buyingPrice)*quantity;
     if(value >= 0){
        return 100;
     }else{
        return -100;
     }
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        double currentTotal = currentPrice*quantity;
        return currentTotal;
    }
}
