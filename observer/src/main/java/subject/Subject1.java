package subject;

import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements ISubject {

    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int MyValue) {
        this.myValue = MyValue;
        notifyObservers(myValue);
    }

    List<IObserver> observerList = new ArrayList<>();

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(this.getClass().getSimpleName(), updatedValue);
        }
    }
}
