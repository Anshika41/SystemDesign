package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObserverable;

public class MobileAlertObserver implements NotificationAlertObserver {

    String userName;
    StockObserverable observerable;

    public MobileAlertObserver(String emailId, StockObserverable observerable){
        this.observerable = observerable;
        this.userName = emailId;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up!!");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("msg sent to:" + userName);
    }
}
