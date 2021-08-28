package shoppingApp;

        //...................Strategy Design Pattern..................................................

public class PaymentTest {

    public static void main(String[] args) {

        ShoppingCart shoppingCart1 = new ShoppingCart();
        ShoppingCart shoppingCart2 = new ShoppingCart();

        Product product1 = new Product("Eve soap","444-44-444", 500);
        Product product2 = new Product("Golden penny noodles","666-66-666", 100);
        Product product3 = new Product("Dangote Sugar","222-22-222", 700);
        Product product4 = new Product("Mymy toothe paste","555-55-555", 500);
        Product product5 = new Product("Cabin biscuit","777-77-777", 200);

        shoppingCart1.addProduct(product2);
        shoppingCart1.addProduct(product1);
        shoppingCart1.addProduct(product3);
        shoppingCart1.addProduct(product5);

        shoppingCart1.payment(new CreditCardPaymentMethod("Peter",4512));


        shoppingCart2.addProduct(product2);
        shoppingCart2.addProduct(product4);
        shoppingCart2.addProduct(product5);

        shoppingCart2.payment(new PaypalPaymentMethod("John","john@gmial.com","5q7s5r1"));

    }
}
