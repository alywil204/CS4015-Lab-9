import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<UIMediator> mediators = new ArrayList<>();

    public void attach(UIMediator m) {
        mediators.add(m);
    }
    public void detach(UIMediator m) {
        mediators.remove(m);
    }
    public void notifyObservers(String event) {
        for (UIMediator m : this.mediators) {
            m.notifyMediator(this, event);        
        }
    }
}
