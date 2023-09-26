package designpattern.behavioral.strategy;

public class CreditCard {
    private int amount;

    public CreditCard(String cardNumber, String expiryDate, String cvv) {

    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
