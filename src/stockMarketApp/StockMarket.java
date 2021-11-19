package stockMarketApp;

public class StockMarket {

    public static void main(String[] args) {



        Company microSoft = new CompanyImpl("MicroSoft shares", 45);

        StockBroker stockBroker1 = new StockBrokerImpl("Mr Kola");
        StockBroker stockBroker2 = new StockBrokerImpl("Mrs Jane");
        StockBroker stockBroker3 = new StockBrokerImpl("Mr Peter");
        StockBroker stockBroker4 = new StockBrokerImpl("Dr Maxwell");
        StockBroker stockBroker5 = new StockBrokerImpl("Dr Johnson");

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
