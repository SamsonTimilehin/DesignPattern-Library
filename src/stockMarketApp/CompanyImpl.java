package stockMarketApp;

import java.util.ArrayList;
import java.util.List;

public class CompanyImpl implements Company{

    private Stock stock;
    private final List<StockBroker> brokers = new ArrayList<>();

    public CompanyImpl(String name, double price){
        stock = new Stock(name, price);
    }

    @Override
    public void register(StockBroker stockBroker) {
        brokers.add(stockBroker);
    }

    @Override
    public void unRegister(StockBroker stockBroker) {
        brokers.remove(stockBroker);
    }

    @Override
    public void notifyStockBroker() {
        for(StockBroker stockBrokerElement : brokers){
            stockBrokerElement.update(stock);
        }
    }

    @Override
    public void uploadPriceChange() {
        System.out.println("PRICE CHANGE");
        currentPrice(stock.getPrice());
        notifyStockBroker();
    }

    @Override
    public void currentPrice(double newPrice) {
        stock.setPrice(newPrice);
    }
}
