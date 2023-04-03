import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String symbol;
    private float price;

    private List<Observer> observers = new ArrayList<Observer>();

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    public void attach(Observer o) {
        this.observers.add(o);
    }
    public void detach(Observer o) {
        this.observers.remove(o);
    }
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update();
        }
    }
}
