package edu.ucaldas.behaviour.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("No se ha definido una estrategia de pago");
        }
        strategy.pay(amount); 
    }
}
