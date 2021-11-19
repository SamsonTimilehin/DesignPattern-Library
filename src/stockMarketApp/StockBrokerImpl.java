package stockMarketApp;

public class StockBrokerImpl implements StockBroker{

    private final String name;

    public StockBrokerImpl(String name){
        this.name = name;
    }
    @Override
    public void update(Stock stock) {
        System.out.println("Hello "+ name + " " + stock.getName() + " price is "+ stock.getPrice());
    }
}
