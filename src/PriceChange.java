public class PriceChange {
    double currentPrice;
    double upDownRate;
    PriceChange(double currentPrice, double upDownRate) {
        this.currentPrice = currentPrice;
        this.upDownRate = upDownRate;
    }

    double changingPrice(double upDownRate, double currentPrice, Stock stock) {
        Stock stock1 = stock;
        //stock1.currentPrice = currentPrice + upDownRate;
        return 0;
    }
}
