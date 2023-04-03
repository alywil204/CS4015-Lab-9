import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.attach(this);
    }

    public void show() {
        System.out.println("Stock List View:");
        for (Stock stock : stocks)
            System.out.println(stock);
    }

    public void update() {
        this.show();
    }
}
