package ObserverPattern;

import ObserverPattern.Observable.IphoneObserver;
import ObserverPattern.Observable.StockObserverable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObserverable iphoneStockObservable = new IphoneObserver();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
