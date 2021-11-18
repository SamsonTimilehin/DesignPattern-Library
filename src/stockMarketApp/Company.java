package stockMarketApp;

public interface Company {

    void register(StockBroker stockBroker);
    void unRegister(StockBroker stockBroker);
    void notifyStockBroker();
    void uploadPriceChange();
    void currentPrice(double newPrice);

}
