package designpattern.behavioral.strategy;

public class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        creditCard = new CreditCard("cardNumber", "expiryDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        creditCard.setAmount(creditCard.getAmount() - amount);
    }

}
