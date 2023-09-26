package designpattern.behavioral.chainofresponsibility;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Authorization was successful!");

            return true;
        }
        return false;
    }


}
