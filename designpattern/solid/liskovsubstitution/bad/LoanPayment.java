package designpattern.solid.liskovsubstitution.bad;

public interface LoanPayment {
    void doPayment(int amount);

    void foreCloseLoan();

    void doRepayment(int amount);
}
