package designpattern.structural.facade;

public class SecurityCodeCheck {
    private int securityCode;

    {
        securityCode = 1234;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int securityCode) {
        return getSecurityCode() == securityCode;
    }
}
