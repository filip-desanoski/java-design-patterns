package subject;

import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {

    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int value) {
        this.myValue = value;
        notifyObservers(myValue);
    }

    List<IObserver> observersList = new ArrayList<>();

    @Override
    public void register(IObserver o) {
        observersList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (int i = 0; i < observersList.size(); i++) {
            observersList.get(i).update(this.getClass().getSimpleName(), updatedValue);
        }
    }
}
