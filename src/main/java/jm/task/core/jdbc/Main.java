package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Jack", "Smith", (byte) 35);
        userService.saveUser("Olivia", "Jones", (byte) 20);
        userService.saveUser("Lily", "Brown", (byte) 75);
        userService.saveUser("Oscar", "Wilson", (byte) 56);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnection();
    }
}
