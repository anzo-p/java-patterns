package behavioral.observer.observable;

import behavioral.observer.observer.Observer;

public interface ProducerCoordinator {

    void register(Observer o);

    void unegister(Observer o);

    void notifyObserver();
}
