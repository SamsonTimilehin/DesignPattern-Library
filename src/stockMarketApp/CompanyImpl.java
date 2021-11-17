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
        brokers.forEach(StockBroker::update);
    }

    @Override
    public void uploadPriceChange() {
        System.out.println("Stock price change");
        notifyStockBroker();
    }

    public void priceChange(double newPrice){
        stock.setPrice(newPrice);

    }
    public double getNewPrice(){
        return stock.getPrice();
    }
}
