package designpattern.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);
        authService.login("admin", "admin");


    }
}
