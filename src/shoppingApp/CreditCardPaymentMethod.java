package shoppingApp;

public class CreditCardPaymentMethod implements PaymentMethod{

    private String name;
    private int cardPin;

    public CreditCardPaymentMethod(String name, int cardPin) {
        this.name = name;
        this.cardPin = cardPin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardPin() {
        return cardPin;
    }

    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment with credit card is : " + amount);
    }
}
