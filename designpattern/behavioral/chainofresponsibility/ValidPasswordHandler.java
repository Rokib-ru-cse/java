package designpattern.behavioral.chainofresponsibility;

public class ValidPasswordHandler extends BaseHandler {

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong Password");
            return false;
        }
        setNextHandler(new RoleCheckHandler());
        return handleNext(username, password);
    }
}
