package designpattern.structural.facade;

public class Main {


    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(123);
        accessingBank.withdrawCash(456);
        accessingBank.depositeCash(789);

    }
}
