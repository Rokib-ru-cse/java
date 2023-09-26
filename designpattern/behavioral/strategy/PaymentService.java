package designpattern.behavioral.strategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
