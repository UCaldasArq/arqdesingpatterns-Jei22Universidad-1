package edu.ucaldas.creacionales.factory;

public class EmailFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        // TODO
        return new EmailNotification();
        //return null;
    }
}
