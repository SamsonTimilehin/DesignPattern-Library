package stockMarketApp;

public class StockBrokerImpl implements StockBroker{
    @Override
    public void update(Stock stock) {
        System.out.println(stock.getName() + " price is "+ stock.getPrice());
    }
}
