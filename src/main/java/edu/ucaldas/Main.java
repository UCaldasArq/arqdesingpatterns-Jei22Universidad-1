package edu.ucaldas;

import java.util.Scanner;

import edu.ucaldas.behaviour.observer.Investor;
import edu.ucaldas.behaviour.observer.Stock;
import edu.ucaldas.behaviour.strategy.CreditCardPayment;
import edu.ucaldas.behaviour.strategy.PayPalPayment;
import edu.ucaldas.behaviour.strategy.PaymentContext;
import edu.ucaldas.creacionales.factory.EmailFactory;
import edu.ucaldas.creacionales.factory.NotificationFactory;
import edu.ucaldas.creacionales.factory.SMSFactory;
import edu.ucaldas.estructurales.decorator.BasicProduct;
import edu.ucaldas.estructurales.decorator.CheeseDecorator;
import edu.ucaldas.estructurales.decorator.Product;
import edu.ucaldas.creacionales.factory.Notification;
import edu.ucaldas.behaviour.observer.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

        // for (int i = 1; i <= 5; i++) {
        //     //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        //     // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        //     System.out.println("i = " + i);
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tipo de notificación (EMAIL, SMS, PUSH): ");
        String type = scanner.nextLine();

        scanner.close();

        NotificationFactory factory;

        switch (type) {
            case "EMAIL":
                factory = new EmailFactory();
                break;
            case "SMS":
                factory = new SMSFactory();
                break;
            // case "PUSH":
            //     factory = new PushFactory();
            //     break;
            default:
                throw new IllegalArgumentException("Tipo no válido");
        }

    
        Notification notification = factory.createNotification();
        notification.send("Hola desde Factory Method");
        

        Product product = new BasicProduct();

        product = new CheeseDecorator(product); // + queso

        System.out.println(product.getDescription());
        System.out.println("Precio: " + product.getPrice());
    
    
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(100);

        context.setStrategy(new PayPalPayment());
        context.executePayment(200);

        // context.setStrategy(new CryptoPayment());
        // context.executePayment(300);

         Stock stock = new Stock();

        Observer inv1 = new Investor("Juan");
        Observer inv2 = new Investor("Ana");

        stock.addObserver(inv1);
        stock.addObserver(inv2);

        stock.setPrice(100.0);
        stock.setPrice(120.5);
    
    }
    
}