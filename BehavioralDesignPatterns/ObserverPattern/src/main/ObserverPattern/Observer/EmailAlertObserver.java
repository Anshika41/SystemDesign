package Observer;

import Observable.StockObserverable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;

    StockObserverable observerable;

    public EmailAlertObserver(String emailId, StockObserverable observable){
        this.observerable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
      sendMail(emailId,"product is in stock hurry up!!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("email sent to:" + emailId);
    }
}
