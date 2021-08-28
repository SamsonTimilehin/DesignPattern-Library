package shoppingApp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){

        productList.add(product);
    }

    public void removeProduct(Product product){

        productList.remove(product);
    }

    public double calculateTotalPriceOfProducts(){
       //return productList.stream().mapToDouble(Product::getPrice).reduce(0.0, Double::sum);
        double sum = 0;
        for(Product currentProduct : productList){
            sum +=currentProduct.getPrice();
        }
        return sum;
    }
    public void payment(PaymentMethod paymentMethod){
        paymentMethod.pay(calculateTotalPriceOfProducts());
    }
}
