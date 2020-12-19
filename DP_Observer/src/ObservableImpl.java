import java.util.ArrayList;
import java.util.List;
public class ObservableImpl implements Observable {
    private int  state;
    private List<Observer> observers ;
    public ObservableImpl() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer o) {
    observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
    observers.remove(index);
     }
    }
    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update();
        }

    }
    public void valuesChanged() {
        notifyObservers();
    }

    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        valuesChanged();
    }
}