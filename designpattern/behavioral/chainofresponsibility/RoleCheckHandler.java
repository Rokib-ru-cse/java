package designpattern.behavioral.chainofresponsibility;

public class RoleCheckHandler extends BaseHandler {
    @Override
    public boolean handle(String username, String password) {
        if ("admin".equals(username)) {
            System.out.println("Loading admin page ... ");
            return true;
        }
        System.out.println("Loading default page ... ");
        return handleNext(username, password);
    }
}
