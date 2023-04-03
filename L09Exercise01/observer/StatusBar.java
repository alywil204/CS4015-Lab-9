import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.attach(this);
    }

    public void show() {
        System.out.println("Status Bar:");
        for (Stock stock : stocks)
            System.out.println(stock);
    }

    public void update() {
        this.show();
    }
}
