package designpattern.solid.singleresponsibility;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class AccountOperations {

    private static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }



    /**
     *
     * this deposit method should not be here.
     * this is a transaction related action
     * this method should be placed inside another class named transactionOperation
     *
     *
     * */

    public void deposit(int amount, int accountNumber) {
        Account account = accountMap.get(accountNumber);
        account.setTotalAmount(accountMap.get(accountNumber).getTotalAmount().add(new BigInteger(amount + "")));
        accountMap.put(accountNumber, account);
    }


}
