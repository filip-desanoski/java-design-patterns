package subject;

import observer.IObserver;

public interface ISubject {
    void register(IObserver iObserver);

    void unregister(IObserver iObserver);

    void notifyObservers(int i);
}
