package edu.ucaldas.creacionales.factory;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        // TODO
        System.out.println("Enviando SMS: " + message);
    }
}
