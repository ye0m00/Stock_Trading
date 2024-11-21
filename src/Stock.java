public class Stock {
    String ticker;
    double price;
    String history;

    Stock(String ticker, double price, String history) {
        this.ticker = ticker;
        this.price = price;
        this.history = history;
    }
    void updatePrice(double newPrice) {

    }

    String getHistory() {
        return"";
    }

    public double getPrice() {
        return price;
    }

    public String getTicker() {
        return ticker;
    }
}
