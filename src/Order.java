public class Order {
    String orderID;
    String type;
    Stock stock;
    double amount;

    void executeOrder() {

    }
    void cancelOrder() {

    }

    public Stock getStock() {
        return stock;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
