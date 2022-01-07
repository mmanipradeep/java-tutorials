package com.mani.concurrency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.sl.driver");
        connection= DriverManager.getConnection("","","");
        return connection;
    }
}
