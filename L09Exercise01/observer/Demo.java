public class Demo {
    public static void main(String[] args) {
        Stock stock1 = new Stock("Stock 1", 1.0f);
        Stock stock2 = new Stock("Stock 2", 2.0f);
        Stock stock3 = new Stock("Stock 3", 3.0f);

        StockListView stockListView = new StockListView();
        StatusBar statusBar = new StatusBar();
        stockListView.addStock(stock1);
        statusBar.addStock(stock2);
        stockListView.addStock(stock3);
        statusBar.addStock(stock3);

        stockListView.show();
        statusBar.show();

        System.out.println();
        stock1.setPrice(1.1f);
        System.out.println();
        stock2.setPrice(2.2f);
        System.out.println();
        stock3.setPrice(3.3f);
    }
}