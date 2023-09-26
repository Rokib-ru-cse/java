package designpattern.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }
}
