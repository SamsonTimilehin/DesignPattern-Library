package shoppingApp;

public class Product {

    private final String productName;
    private final String uniqueNumber;
    private final double price;

    public Product(String productName, String uniqueNumber, double price) {
        this.productName = productName;
        this.uniqueNumber = uniqueNumber;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public double getPrice() {
        return price;
    }
}
