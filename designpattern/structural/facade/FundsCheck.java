package designpattern.structural.facade;

public class FundsCheck {
    private int cashInAccount = 1000;

    public int getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(int cashWithdrawn) {
        cashInAccount = cashInAccount - cashWithdrawn;
    }

    public void increaseCashInAccount(int cashDeposited) {
        cashInAccount = cashInAccount + cashDeposited;
    }

    public boolean haveEnoughMoney(int cashToWithdrawal) {
        if (cashToWithdrawal > getCashInAccount()) {
            System.out.println("Error: you don't have enough money");
            System.out.println("Current Balance : " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Completed : Current Balance is " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(int cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Completed : Current Balance is " + getCashInAccount());
    }
}
