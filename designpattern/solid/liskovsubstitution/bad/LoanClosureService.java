package designpattern.solid.liskovsubstitution.bad;

public class LoanClosureService {

    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    /**
     *
     * this method will throw exception if we pass CreditCardLoan class object.
     * here all the child class object is not able to fully replaced its parent class object
     * so we should not do this kind of things.
     * */

    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();
    }

}
