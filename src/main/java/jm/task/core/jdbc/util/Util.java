package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rjdf7ktdf4";
    private static final String URL = "jdbc:mysql://localhost:3306/table";
    private static Connection connection = null;
    private static Util util = null;
    private Util() {
        try {
            if( connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Util getInstance(){
        if(util == null) {
            util = new Util();
        }
        return util;
    }

    public Connection getConnection() {
        return connection;
    }
}
