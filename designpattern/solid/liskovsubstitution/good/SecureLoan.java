package designpattern.solid.liskovsubstitution.good;

public interface SecureLoan extends LoanPayment {
    void foreCloseLoan();
}
