package designpattern.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, String> users;

    {
        users = new HashMap<>();
        users.put("admin", "admin");
        users.put("user", "user");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
