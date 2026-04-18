package edu.ucaldas.creacionales.factory;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        // TODO
        System.out.println("Enviando EMAIL: " + message);
    }
}
