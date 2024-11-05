package org.example;

import java.util.HashMap;

public class UserDatabase {
    private HashMap<String, User> users = new HashMap<>();

    public boolean registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please try another.");
            return false;
        }
        users.put(username, new User(username, password));
        System.out.println("Registration successful.");
        return true;
    }

    public boolean loginUser(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            return true;
        }
        System.out.println("Invalid username or password.");
        return false;
    }
}
