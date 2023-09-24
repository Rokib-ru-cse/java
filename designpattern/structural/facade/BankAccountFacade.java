package designpattern.structural.facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    WelcomeToBak welcomeToBak;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(int cashToGet) {
        if (accountNumberCheck.isAccountActive(getAccountNumber())
                && securityCodeCheck.isCodeCorrect(getSecurityCode())
                && fundsCheck.haveEnoughMoney(cashToGet)
        ) {
            System.out.println("Transaction Completed");
        } else {
            System.out.println("Transaction Failed");
        }
    }

    public void depositeCash(int cashToDeposit) {
        if (accountNumberCheck.isAccountActive(getAccountNumber())
                && securityCodeCheck.isCodeCorrect(getSecurityCode())
        ) {
            fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction Completed");
        } else {
            System.out.println("Transaction Failed");
        }
    }


}
