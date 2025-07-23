package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface  StockObserverable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAddedd);

    int getStockCount();
}
