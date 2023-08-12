package designpattern.solid.liskovsubstitution.bad;

public class CreditCardLoan implements LoanPayment {


    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Fore Close is not allowed");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("doRepayment is not allowed");
    }
}
