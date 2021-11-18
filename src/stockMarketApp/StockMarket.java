package stockMarketApp;

public class StockMarket {

    public static void main(String[] args) {



        Company microSoft = new CompanyImpl("apple", 45);

        StockBroker stockBroker1 = new StockBrokerImpl();
        StockBroker stockBroker2 = new StockBrokerImpl();
        StockBroker stockBroker3 = new StockBrokerImpl();
        StockBroker stockBroker4 = new StockBrokerImpl();
        StockBroker stockBroker5 = new StockBrokerImpl();

        microSoft.register(stockBroker1);
        microSoft.register(stockBroker2);
        microSoft.register(stockBroker3);
        microSoft.register(stockBroker4);
        microSoft.register(stockBroker5);

        microSoft.unRegister(stockBroker2);

        microSoft.notifyStockBroker();

        microSoft.currentPrice(59.50);

        microSoft.uploadPriceChange();


    }
}
