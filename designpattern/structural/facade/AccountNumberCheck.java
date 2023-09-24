package designpattern.structural.facade;

public class AccountNumberCheck {
    private int accountNumber;

    {
        accountNumber = 12345678;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAccountActive(int accountNumber) {
        return getAccountNumber() == accountNumber;
    }
}
