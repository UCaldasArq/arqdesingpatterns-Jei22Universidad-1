package edu.ucaldas.creacionales.factory;

public class SMSFactory extends NotificationFactory {
    @Override

    public Notification createNotification() {
        // TODO
        return new SMSNotification();
        //return null;
    }
}
