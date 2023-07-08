package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Юзер1", "123", (byte) 13);
        userService.saveUser("Юзер2", "345", (byte) 2);
        userService.saveUser("Юзер3", "юзер3", (byte) 12);
        userService.saveUser("Юзер4", "юзер", (byte) 33);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
